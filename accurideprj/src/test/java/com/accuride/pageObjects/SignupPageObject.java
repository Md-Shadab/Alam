package com.accuride.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class SignupPageObject {
	
	
	WebDriver ldriver;
	
	
	public SignupPageObject(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@id='firstname']")
	@CacheLookup
	WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	@CacheLookup																
	WebElement lastname;
	
	@FindBy(xpath="//button[@class='action submit primary']//span[contains(text(),'SIGN IN')]")
	@CacheLookup
	WebElement signin_submit; 
	
	@FindBy(xpath="//input[@id='email_address']")
	@CacheLookup
	WebElement signupemailaddress;
	
	@FindBy(xpath="//input[@id='password']")
	@CacheLookup
	WebElement signuppasswordfield;
	
	
	@FindBy(xpath="//input[@id='password-confirmation']")
	@CacheLookup
	WebElement confirmpasswordfield;
	
	@FindBy(id="customer_category")
	@CacheLookup
	WebElement customercategoryvalue;
	
	@FindBy(id="pick_your_industry")
	@CacheLookup
	WebElement industrydropdown;
	

	public void setfirstName(String fname) {
		
		firstname.sendKeys(fname);
	}
	
	public void setlastName(String lname) {
		
		lastname.sendKeys(lname);
	}
	
	
	public void set_signupemail(String signupemail) {
		
		if(signupemailaddress.isEnabled()) {
			signupemailaddress.sendKeys(signupemail);
		}
	}
	
	public void signuppwd(String signuppassword) {
		signuppasswordfield.sendKeys(signuppassword);
	}
	
	public void signupconfirmpwd(String signupconfirmpassword) {
		confirmpasswordfield.sendKeys(signupconfirmpassword);
	}
	
	public void SigninSubmitbtn()
	{
		signin_submit.click();
	}
	
	
	public void customercategory() {
		
		String str[] = {"Independent" ,"Professional" ,"Business"};
	 Select select =new Select(customercategoryvalue);
	 
	 List<WebElement> customerlist=select.getOptions();
	 System.out.println(customerlist.size());
	 
	 for(int i=0;i<customerlist.size();i++) {
		 
		 Assert.assertEquals(str[i],customerlist.get(i).getText());
		 System.out.println(customerlist.get(i).getText());
		 
	 }
	 System.out.println("Verification is done successfully");
	 select.selectByVisibleText("Business");
	 
	}
	
	public void pickyourindustry() throws Exception {
		
		Select selectindustry = new Select(industrydropdown);
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Architectural/Design");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Cabinetmaker");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("DIY/Homeowners");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Engineer");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Industrial/Engineering");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Maintenance & Repair");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("OEM");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Retailer- Cabinetry/Woodworking");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Retailer -Industrial/Engineering");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Specialized/Custom");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Woodworker");
		Thread.sleep(1000);
		selectindustry.selectByVisibleText("Other");
		
	}
}
	//	String str1[]= {"Architectural/Design","Cabinetmaker","DIY/Homeowners","Engineer","Industrial/Engineering","Maintenance & Repair","OEM","Retailer- Cabinetry/Woodworking","Retailer -Industrial/Engineering","Specialized/Custom","Woodworker","Other"};
		
		//WebElement drp=ldriver.findElement(By.id("pick_your_industry"));
		/*Select selectindustry = new Select(industrydropdown);
		List<WebElement> dropdown= selectindustry.getOptions();
		int j=dropdown.size();
		System.out.println("Total number of industry drop down values is========" +j);
		System.out.println(dropdown.get(j).getText());
		

		for(int i=0;i<dropdown.size();i++) {
			
			Assert.assertEquals(str1[j+1], dropdown.get(i).getText());
			System.out.println(dropdown.get(i).getText());
		}
		System.out.println("pick your industry value  verification is done successfully");
		selectindustry.selectByVisibleText("OEM");
	}*/
	


	
	

