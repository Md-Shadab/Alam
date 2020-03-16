package com.accuride.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageObject {

	WebDriver ldriver;
	
	public LoginPageObject(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='email']")
	@CacheLookup
	WebElement loginemail;
	
	@FindBy(xpath="//div[@class='field password']//input[@id='pass']")
	@CacheLookup
	WebElement loginpassword;
	
	
	@FindBy(xpath="//div[@class='field choice']//label[@class='label']")
	@CacheLookup
	WebElement remembermecheckbox;
	
	@FindBy(xpath="//span[contains(text(),'Log In')]")
	@CacheLookup
	WebElement lognbtn;
	
	@FindBy(xpath="//a[@class='action remind']//span[contains(text(),'Forgot Your Password?')]")
	@CacheLookup
	WebElement forgetpasswordlink;
	
	@FindBy(xpath=("/html/body/div[2]/header/div[1]/div/ul/li[4]/span/span"))
	@CacheLookup
	WebElement logoutbutton;
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	@CacheLookup   //ul[@class='header links']/li[5]/a			    
	WebElement signout;
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	@CacheLookup
	WebElement myaccount;
	
	@FindBy(xpath="//div[contains(text(),'The account sign-in was incorrect or your account')]")
	@CacheLookup
	WebElement loginfailuremsg;
	
	
	
	public void logout_button() throws InterruptedException {

		//int i = logoutbutton.size();
		//System.out.println(logoutbutton.getText());
		logoutbutton.click();
		Thread.sleep(3000);
		
		signout.click();
		/*Select slt= new Select(logoutbutton);
		List<WebElement> menuoption = slt.getOptions();
		System.out.println(menuoption);
		//slt.selectByVisibleText("SIGN OUT");
		
	/*	System.out.println(logoutbutton.getText());
		Actions mouse = new Actions(ldriver);
		mouse.moveToElement(logoutbutton).click();
		Thread.sleep(5000);
		mouse.moveToElement(signout).click();*/
		
	}
	
	
	public void login_email(String lgnemail) {
		loginemail.sendKeys(lgnemail);
	}
	
	
	public void login_password(String lgnpassword) {
		loginpassword.sendKeys(lgnpassword);
	}
	
	public void rememberme_checkbox() {
		
		remembermecheckbox.click();
	}
	
	
	public void login_button() {
		
		lognbtn.click();
	}
	
	
	public void forget_passwordlink() {
		
		forgetpasswordlink.click();
	}
	
	
	public void usernameverify() {
		
		if(logoutbutton.getText().equalsIgnoreCase("shadab alam")) {
			
			System.out.println("username is verified successfully");
		}
		
		else{
			System.out.println("username is failed");
		}
		
	}
	
	
	public void loginfailedmsg() {
		
		if(loginfailuremsg.getText().equalsIgnoreCase("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."))
		{
			System.out.println("failure message is displayed");
		}
		else {
			System.out.println("failure message is not displaying");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
