package com.ericsson.sgsn_mme.djcat.fw;

import org.testng.annotations.Test;

public class CucumberSystemTestCase extends TestCaseFixture{
	
	@Test
	public void testNGCucumberRunner()
	{
		System.out.println("method testNGCucumber");
		runCucumberTest();
	}
	
	public void runCucumberTest()
	{
		System.out.println("method runCucumberTest");
	}

}
