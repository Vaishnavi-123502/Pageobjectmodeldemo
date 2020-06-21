package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class LoginPage extends Testbase {

	HomePage homepage;
	@FindBy(xpath="//span[text()='Log In']")
	WebElement login;
	
	@FindBy(name="email")
	WebElement emailtextbox;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogin()
	{
		login.click();
	}
	
	public void login(String email,String pass)
	{
		emailtextbox.click();
		emailtextbox.sendKeys(email);
		password.click();
		password.sendKeys(pass);
		//loginbutton.click();
		//return homepage;
		
	}
	
}
