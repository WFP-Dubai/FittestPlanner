package org.wfp.fittest.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration
@Transactional
@ContextConfiguration(locations = "classpath:dao-test-context.xml")
public abstract class AbstractDaoTest {
	
	public <E> void assertListSize(List<E> lst, int size) {
		assertNotNull(lst);
		assertEquals(lst.size(), size);
	}
}
