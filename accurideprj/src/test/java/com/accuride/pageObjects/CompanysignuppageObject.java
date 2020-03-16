package com.accuride.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanysignuppageObject {

	WebDriver ldriver;
	
	CompanysignuppageObject(WebDriver rdiver){
		
		ldriver=rdiver;
		PageFactory.initElements(rdiver, this);
	}
	
	
	@FindBy(xpath="//div[@class='block block-new-company']/div/div/div/a")
	@CacheLookup
	WebElement companysignupbtn;
	
	@FindBy(id="company_name")
	@CacheLookup
	WebElement companynameinput;
	
	
	
	
	public void companysignup() {
		
		companysignupbtn.click();
	}
	
}
