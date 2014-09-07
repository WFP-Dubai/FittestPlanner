package org.wfp.fittest.config;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * PersistenceConfig defines the configuration options for the data source used
 * FITTESTPlanner.
 * <p>
 * The data source configuration options are read from the properties file
 * <code>classpath:data-access.properties</code> which defined the jdbc url,
 * username and password. Hibernate options are defined in the properties file
 * <code>classpath:hibernate.properties</code>. Hibernate options will override
 * the default options specified for the data source.
 * 
 * @author Sami Zeinelabdin
 *
 */

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = { "org.wfp.fittest.repository" })
@Import(RestConfig.class)
@PropertySource("classpath:data-access.properties")
public class PersistenceConfig {

	@Autowired
	private Environment env;

	/**
	 * Configures the default data source used by the FITTESTPlanner
	 * application.
	 * <p>
	 * The data source defined the database location(url) as well as the
	 * username and password used to login to the database.
	 * 
	 * @return DataSource
	 * @see DriverManagerDataSource
	 * @see TransactionAwareDataSourceProxy
	 */
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		TransactionAwareDataSourceProxy tds = new TransactionAwareDataSourceProxy(
				ds);
		return tds;
	}

	/**
	 * Returns a Properties object that was read from the file
	 * <code>classpath:hibernate.properties</code>.
	 * 
	 * @return Properties object
	 */
	@Bean
	public Properties hibernateProperties() {
		try {
			PropertiesFactoryBean props = new PropertiesFactoryBean();
			ClassPathResource resource = new ClassPathResource(
					"hibernate.properties");
			props.setLocation(resource);

			return props.getObject();
		} catch (IOException e) {
			return null;
		}
	}

	/**
	 * Configures the hibernate JPA Vendor adapter.
	 * <p>
	 * The database type is set to <code>Database.POSTGRESQL</code>.
	 * 
	 * @return HibernateJpaVendorAdapter
	 * @see HibernateJpaVendorAdapter
	 * @see Database
	 */
	@Bean
	public HibernateJpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter jva = new HibernateJpaVendorAdapter();
		jva.setDatabase(Database.POSTGRESQL);
		return jva;
	}

	/**
	 * Configures the entity manager factory.
	 * <p>
	 * Sets the default data source using the <code>dataSource()</code> method.
	 * Sets JPA Vendor adapter using the <code>jpaVendorAdapter()</code> method.
	 * Sets Hibernate properties using the <code>hibernateProperties()</code>
	 * method. Entities in the package <code>org.wfp.fittest.entity</code> are
	 * scanned automatically.
	 * 
	 * @return LocalContainerEntityManagerFactoryBean
	 * @see EntityManagerFactory
	 */
	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan(new String[] { "org.wfp.fittest.entity" });
		em.setJpaVendorAdapter(jpaVendorAdapter());
		em.setJpaProperties(hibernateProperties());
		return em;
	}

	/**
	 * Configures default JPA transaction behavior.
	 * 
	 * @return PlatformTransactionManager
	 * @see PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager txm = new JpaTransactionManager();
		txm.setEntityManagerFactory(entityManagerFactory().getObject());
		return txm;
	}

	/**
	 * Configures default exception translation behavior.
	 * @return PersistenceExceptionTranslationPostProcessor
	 * @see PersistenceExceptionTranslationPostProcessor
	 */
	@Bean
	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
		return new PersistenceExceptionTranslationPostProcessor();
	}

}
