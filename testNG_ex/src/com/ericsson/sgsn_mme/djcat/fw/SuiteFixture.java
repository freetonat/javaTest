package com.ericsson.sgsn_mme.djcat.fw;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class SuiteFixture {
	
	@BeforeSuite
	@Parameters({"preinstall"})
	public void testSuiteSetup()
	{
		System.out.println("method testSuiteSetup");
	}

}
