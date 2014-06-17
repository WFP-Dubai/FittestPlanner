package org.wfp.fittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public abstract class AbstractTest {
	
	public <E> void assertListSize(List<E> lst, int size) {
		assertNotNull(lst);
		assertEquals(lst.size(), size);
	}
}
