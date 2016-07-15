package com.david.maven.HelloMaven;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Sfl4jTest {
	Logger logger = LoggerFactory.getLogger(Sfl4jTest.class);
	
	@Test
	public void testSfl4jTest(){
		logger.info("===================test=======================");
	}
}
