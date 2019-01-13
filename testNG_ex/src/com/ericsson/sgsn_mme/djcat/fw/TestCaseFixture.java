package com.ericsson.sgsn_mme.djcat.fw;

import org.testng.annotations.BeforeTest;

public class TestCaseFixture extends SuiteFixture{
	
	@BeforeTest
	public void testCaseSetup()
	{
		System.out.println("method testCaseSetup");
	}

}
