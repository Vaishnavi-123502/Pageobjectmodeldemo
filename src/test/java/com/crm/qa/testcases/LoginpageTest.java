package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utils.TestUtil;

public class LoginpageTest extends Testbase{
	LoginPage loginpage;
	HomePage homepage;
	String sheetName = "Sheet1";

	
	public LoginpageTest(){
		
		super();
	}

	@BeforeMethod
	
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		
	}
	
	
	@Test(priority=1)
	
	public void navigatetologinpage() {
		loginpage.clickonlogin();
	}
	
	@DataProvider
	public Object[][] getCRMTestData(){
		Object data[][] = TestUtil.getTestData(sheetName);
		return data;
	}
	
	@Test(priority=2,dataProvider="getCRMTestData")
	public void logintohomepage(String username,String password)
	{
		loginpage.clickonlogin();
		loginpage.login(username,password);
	}
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
