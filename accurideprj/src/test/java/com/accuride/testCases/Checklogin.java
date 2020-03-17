package com.accuride.testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checklogin extends BaseClass {

	
	
	@Test
	public void loginverify() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//a[contains(text(),'Login / Sign Up')]")).click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		
			username.sendKeys("shadab.alam@indusnet.co.in");
		
		
		WebElement password = driver.findElement(By.xpath("//div[@class='field password']//input[@id='pass']"));
		
			password.sendKeys("Option123");
			
			
		
		 driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		 
		 Thread.sleep(5000);
		 
		 if(driver.getTitle().equalsIgnoreCase("Global Manufacturer of Premium Ball-Bearing Drawer Slides | Accuride International"))
		 {
			 usernameverify();
		 }
		 else {
			 System.out.println("login is failed");
		 }
		
	}

	
	
	public void usernameverify() {
		
		WebElement usernametext= driver.findElement(By.xpath("//div[@class='panel header']/ul/li[4]/span/span"));    
		
		if(usernametext.getText().equalsIgnoreCase("shadab alam")) {
			
			logger.info("username is verified");
		}
		else {
			logger.info("username is failed");
		}
	}

	/*public void imagetake() {
		
		WebElement logoimage=driver.findElement(By.xpath("//a[@class='logo']/img"));
		
		
		File file = new File(OUTPUTTYPE,logoimage);
	}*/
	
	
}
