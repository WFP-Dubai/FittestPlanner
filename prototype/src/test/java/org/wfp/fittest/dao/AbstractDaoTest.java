package org.wfp.fittest.dao;

import org.junit.After;
import org.junit.Before;
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
	
	@Before
    public abstract void setUp();
	
	@After
	public abstract void tearDown();
	
	
}
