package com.accuride.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.accuride.pageObjects.HomepageObject;
import com.accuride.pageObjects.LoginPageObject;
import com.accuride.utilities.XLUtils;

public class TC_Loginpage extends BaseClass {

	
	
	
	@Test(dataProvider="LoginData")
	public void login(String email,String pwd) throws InterruptedException, IOException {
		
		HomepageObject hp = new HomepageObject(driver);
		LoginPageObject lp = new LoginPageObject(driver);
		
			hp.loginSignup();
			logger.info("login page is opened");
			Thread.sleep(5000);
			
		
			lp.login_email(email);
			logger.info("Email field is entered ");
			
			lp.login_password(pwd);
			logger.info("Password is entered");
			
			lp.login_button();
			logger.info("Login button is clicked now.");
			Thread.sleep(5000);
			
			if(driver.getTitle().equalsIgnoreCase("Global Manufacturer of Premium Ball-Bearing Drawer Slides | Accuride International")) {
				
				logger.info("Login is passed");
				lp.usernameverify();
				
			}
			else {
				lp.loginfailedmsg();
				logger.info("Login is failed");
				Thread.sleep(3000);
				
				captureScreen(driver,"login");
				logger.info("screen shot taken for invalid credential");
				
			}
			

			lp.logout_button();
			logger.info("Logout button sign is clicked now to choose sign out option.");
		
			
			
			
			}
			

	@DataProvider(name="LoginData")
	String [][] getData() throws IOException{
		
		String path= System.getProperty("user.dir")+"/src/test/java/com/accuride/testData/LoginData.xlsx";
		
		int rownum=XLUtils.getRowCount(path,"Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		
		String logindata[][]= new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++) {
			for(int j=0;j<colcount;j++) {
				
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i,j);
			}
		}
		return logindata;
	}
	
}








