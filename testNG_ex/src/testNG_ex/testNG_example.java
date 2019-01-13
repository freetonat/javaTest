package testNG_ex;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testNG_example {
	
	@Test
	public void tx1()
	{
		System.out.println("My first testNG testcase");
	}
	
	@Test
	public void tx2()
	{
		System.out.println("My first testNG testcase");
	}
	
	@BeforeSuite
	@Parameters("preinstall")
	public void preinstall()
	{
		System.out.println("My first testNG preinstall");
	}
}
