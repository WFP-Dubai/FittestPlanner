package org.wfp.fittest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.wfp.fittest.entity.Activity;
import org.wfp.fittest.entity.ActivityRole;
import org.wfp.fittest.entity.ActivityType;
import org.wfp.fittest.entity.AuditRecord;
import org.wfp.fittest.entity.ConfirmedType;
import org.wfp.fittest.entity.Country;
import org.wfp.fittest.entity.OperationType;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.entity.Staff;
import org.wfp.fittest.entity.StaffRole;
import org.wfp.fittest.entity.StaffType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

@Configuration
public class RestConfig extends RepositoryRestMvcConfiguration {
	@Override
	protected void configureRepositoryRestConfiguration(
			RepositoryRestConfiguration config) {
		Class<?>[] classes = {
				Activity.class, ActivityRole.class,
				ActivityType.class, AuditRecord.class, ConfirmedType.class,
				Country.class, OperationType.class, ProfileType.class,
				Staff.class, StaffRole.class, StaffType.class
		};
		for (Class<?> cls : classes)
			config.exposeIdsFor(cls);
		config.useHalAsDefaultJsonMediaType(true);
		config.setDefaultPageSize(250);
		config.setMaxPageSize(500);
	}

	@Override
	protected void configureJacksonObjectMapper(ObjectMapper objectMapper) {
		super.configureJacksonObjectMapper(objectMapper);
		objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,
				false);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setDateFormat(new ISO8601DateFormat());
		objectMapper.registerModule(new Hibernate4Module());
	}
}
