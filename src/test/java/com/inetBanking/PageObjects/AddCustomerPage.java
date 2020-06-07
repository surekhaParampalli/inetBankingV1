package com.inetBanking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage 
{

	 WebDriver Idriver;
	public AddCustomerPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement NewCustomerLink; 
	
	@FindBy(xpath="//input[@name=\"name\"]")
	@CacheLookup
	WebElement txtCustName;
	
	@FindBy(xpath="//input[@value=\"f\"]")
	@CacheLookup
	WebElement Gender;
	
	@FindBy(name="dob")
	@CacheLookup
	WebElement dob;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement pincode;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement tele;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement emailid;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	@CacheLookup
	WebElement btnSubmit;
	
	public void addCustomerLink() {
		NewCustomerLink.click();
	}
	public void custName(String cname)
	{
		txtCustName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
		Gender.click();
	}
	
	public void custdob(String mm,String dd, String yy)
	{
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void custAddress(String caddr)
	{
		txtaddress.sendKeys(caddr);
	}
	
	public void custCity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custState(String cState)
	{
		txtstate.sendKeys(cState);
	}
	
	public void custPin(String cPin)
	{
		pincode.sendKeys(cPin);
	}
	
	public void custTele(String ctele)
	{
		tele.sendKeys(ctele);
	}
	
	public void custEmail(String cemail)
	{
		emailid.sendKeys(cemail);
	}
	
	public void custPassword(String cPwd)
	{
		txtpassword.sendKeys(cPwd);
	}
	
	public void addCustSubmit()
	{
		btnSubmit.click();
	}
	
	
	
	
	
	
	
}
