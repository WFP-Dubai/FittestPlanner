package org.wfp.fittest.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.wfp.fittest.entity.Language;
import org.wfp.fittest.utility.AbstractRepository;

@RepositoryRestResource(path = "languages")
public interface LanguageRepository extends AbstractRepository<Language, Long> {

}
