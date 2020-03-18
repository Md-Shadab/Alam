package com.accuride.pageObjects;

import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class HeaderObject {
	
	WebDriver ldriver;
	
	
	public HeaderObject(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Track your order')]")
	@CacheLookup
	WebElement trackyourorder;

	
	
	@FindBy(xpath="//a[contains(text(),'NEWS SIGNUP')")
	@CacheLookup
	WebElement newssignup;
	
	@FindBy(xpath="//a[contains(text(),'Extranet')]")
	@CacheLookup
	WebElement extranet;
	
	@FindBy(xpath="//a[contains(text(),'Login / Sign Up')]")
	@CacheLookup
	WebElement loginsignup;
	
	@FindBy(xpath="//a[contains(text(),'562.903.0200')]")
	@CacheLookup
	WebElement telephone;
	
	
	
	@FindBy(xpath="//div[@class='panel header']/ul/li/a")
	@CacheLookup
	List<WebElement> header; 

	
	@FindBy(xpath ="//ul[starts-with(@id,'menu-top')]/li/a")
	@CacheLookup
	List<WebElement> Menu;
	
	@FindBy(xpath="//a[@class='cc-btn cc-allow']")
	@CacheLookup
	WebElement  acceptalert;
	
	@FindBy(xpath="//a[@class='cc-btn cc-dismiss']")
	@CacheLookup
	WebElement  dismissalert;
	
	
	
	
	
	@FindBy(xpath="//div[@class='block block-new-customer']//a[@class='action create primary']")
	@CacheLookup
	WebElement btnsignin;
	
	
	public void verifyheader()  {
		
		String  str[]= {"TRACK YOUR ORDER", "NEWS SIGNUP", "EXTRANET", "LOGIN / SIGN UP", "CONTACT","562.903.0200"};
		
		int j = header.size();
		
		for(int i = 0;i<j;i++) {
			
			Assert.assertEquals(str[i], header.get(i).getText());
			System.out.println(header.get(i).getText());
		
		}
	
	}

	
	
	
		public void loginSignup() {
			
			if(loginsignup.isDisplayed()) {
				loginsignup.click();
			}
			
		}
	
		public void setUserName(String uname)
		{
			//txtUserName.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			//txtPassword.sendKeys(pwd);
		}
		
		
			
		public void signinbutton() {
			
			if(btnsignin.isDisplayed()) {
			
				btnsignin.click();
			}
			
			}
			
		
		public boolean isAlertPresent() {
			
			try {
				
				ldriver.switchTo().alert();
				return true;
			}
			
			catch(NoAlertPresentException e) {
				
				return false;
			}
		}
		


		
		
	
	
	
	
}
