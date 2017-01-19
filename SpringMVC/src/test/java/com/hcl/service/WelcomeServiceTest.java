package com.hcl.service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WelcomeServiceTest {

	private WelcomeService welcomeService = new WelcomeService();
	
	@Test
	public void testAddition() {
		int testVariable = welcomeService.addition(10,20);
		assertTrue((testVariable==30)?true:false);
	}

}
