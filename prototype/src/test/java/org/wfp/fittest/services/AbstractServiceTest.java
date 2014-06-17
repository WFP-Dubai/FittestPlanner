package org.wfp.fittest.services;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.wfp.fittest.AbstractTest;

@TransactionConfiguration
@Transactional
@ContextConfiguration(locations = "classpath:dao-test-context.xml")
public abstract class AbstractServiceTest extends AbstractTest {

}
