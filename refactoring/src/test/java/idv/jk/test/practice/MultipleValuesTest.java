package idv.jk.test.practice;

import java.util.Iterator;

import org.junit.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MultipleValuesTest {
	
	@SuppressWarnings("unchecked")
	@Test
	public void testReturnMultipleValue() {
		Iterator<String> i = mock(Iterator.class);
		
		when(i.next()).thenReturn("A").thenReturn("B");
		
		final String result = i.next() + i.next();
		
		assertTrue("AB".equals(result));
	}
}
