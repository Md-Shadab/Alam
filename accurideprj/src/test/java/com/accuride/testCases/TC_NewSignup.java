package com.accuride.testCases;

import org.testng.annotations.Test;

import com.accuride.pageObjects.HomepageObject;
import com.accuride.pageObjects.SignupPageObject;
import com.aventstack.extentreports.ExtentTest;

public class TC_NewSignup extends BaseClass {

	public ExtentTest test;
	
	
	
	@Test
	public void signup() throws Exception {
		
		HomepageObject hp = new HomepageObject(driver);
		SignupPageObject sp= new SignupPageObject(driver);
		
		//ExtentTest test= extent.createTest("signup");
			hp.loginSignup();
			
			
			if(driver.getTitle().equals("Customer Login")) {
				
				hp.signinbutton();
				logger.info("Sign in page is opened for new user");
			}
			else {
				captureScreen(driver,"signup");
			logger.info("Signin page opening is failed");
			}
			
			sp.setfirstName(firstname);
			logger.info("First name is entered");
			
			sp.setlastName(lastname);
			logger.info("Last name is entered");
			
						
			sp.customercategory();
			captureScreen(driver,"signup");
			logger.info("customer category value verification is done successfully");
			
			sp.pickyourindustry();
			logger.info("pick your industry drop down  value verification done successfully");	
			
			sp.set_signupemail(signupemail);
			logger.info("signup email is entered");
			
			sp.signuppwd(signuppassword);
			logger.info("signup password is entered ");
			
			sp.signupconfirmpwd(signupconfirmpassword);
			logger.info("signup confirm password is entered");
				
			
		//	System.out.println(driver.findElement(By.id("customer_category")).getText());
			
			sp.SigninSubmitbtn();
			logger.info("Submit button is clicked Now.");
			Thread.sleep(5000);
			if(driver.getTitle().equals("Create New Customer Account")) {
				
				captureScreen(driver,"signup");
				logger.info("Creating new account is failed");
			}
			
			//test.log(Status.PASS, "sigup is working fine");
	}
	
	
	
	
	
}
