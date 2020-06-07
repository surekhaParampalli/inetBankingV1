package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver Idriver;
	
	public LoginPage(WebDriver rdriver) {
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[contains(text(),'Log out')]")
	@CacheLookup
	WebElement btnLogout;
	
	public void setUserName(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void submit()
	{
		btnLogin.click();
	}

	public void Logout()
	{
		btnLogout.click();
	}
}
