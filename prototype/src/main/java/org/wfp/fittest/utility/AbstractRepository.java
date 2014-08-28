package org.wfp.fittest.utility;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractRepository<T, ID extends Serializable> extends
		JpaRepository<T, ID> {

}
