package com.florin.exceptions;


import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UtilsTest {

	
	private Utils util;
	
	@Before
	public void setup() {
		util = new Utils();
	}
	
	@Test
	public void divide() throws Exception {
		int x = 20; 
		int y = 2;
		int test = util.divide(x, y);
		assertEquals(10, test, 0);
	}
	
	

	


}
