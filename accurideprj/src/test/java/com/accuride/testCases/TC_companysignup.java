package com.accuride.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC_companysignup extends BaseClass {

	
	
	@Test
	public void companysignupaccount() throws Exception {
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Login / Sign Up')]")).click();
		
		WebElement companybtn = driver.findElement(By.xpath("//div[@class='block block-new-company']/div/div/div/a"));
			
			companybtn.click();
		
		WebElement companynamefield = driver.findElement(By.id("company_name"));
		
			companynamefield.sendKeys("Indusnet");
			
		WebElement legalname= driver.findElement(By.id("legal_name"));
			
			legalname.sendKeys("Indusnet technology");
			
		WebElement  companyemail=driver.findElement(By.id("company_email"));
		
			companyemail.sendKeys("shadab9635@gmail.com");
			
		WebElement 	vat= driver.findElement(By.id("vat_tax_id"));
		
			vat.sendKeys("123456");
			
			
		WebElement 	resellerid = driver.findElement(By.id("reseller_id"));
		
			resellerid.sendKeys("123456");
			
			
		WebElement streetaddress = driver.findElement(By.id("street0"));
		
			streetaddress.sendKeys("AC 67 ");
			
		WebElement streetaddress1= driver.findElement(By.id("street1"));
		
			streetaddress1.sendKeys("kolkata");
			
		WebElement city= driver.findElement(By.id("city"));
		
			city.sendKeys("Kolkata");
			
		Select drpcountry = new Select(driver.findElement(By.id("country_id")));	
		
			List<WebElement> drp =drpcountry.getOptions();
			
				for(WebElement country : drp) {
					
					country.click();
					country.isSelected();
					Thread.sleep(5000);
				}
				
				
		Select region = new Select(driver.findElement(By.id("region_id")));
		
			List<WebElement> regionid= region.getOptions();
			
				for(WebElement rid : regionid) {
					
					rid.click();
					rid.isSelected();
					Thread.sleep(1000);
				}
		
				
				driver.findElement(By.id("postcode")).sendKeys("709000");
		
		       
				driver.findElement(By.id("telephone")).sendKeys("9876543210");;
				
				
				driver.findElement(By.id("job_title")).sendKeys("Owner");
		
				driver.findElement(By.id("email_address")).sendKeys("shadab9635@gmail.com");
				
				
				driver.findElement(By.id("firstname")).sendKeys("shadab");
				
				driver.findElement(By.id("lastname")).sendKeys("alam");
		
		Select gender = new Select(driver.findElement(By.id("gender")));
			
			List<WebElement> genderlist = gender.getOptions();
			
				for(WebElement list : genderlist) {
					
					list.click();
					list.isSelected();
					Thread.sleep(3000);
				}
				
				
				
				customercategory();
		
				pickyourindustry();
				
				driver.findElement(By.xpath("//div[@class='actions-toolbar']/div/button")).click();
				
				Thread.sleep(5000);
				
				
				//WebElement aftersignupmsg = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
				
				//System.out.println(aftersignupmsg.getText());
				
	/*			if(aftersignupmsg.getText().equalsIgnoreCase("Thank you! We're reviewing your request and will contact you soon")){
					
					logger.info("Company Account creation successfully done");
				//*[@id="maincontent"]/div[2]/div[2]/div/div/div	
				}
				
				else {
					captureScreen(driver,"companysignupaccount");
					logger.info("Company Account creation is failed !");
				}*/
		
	}
	
	
	
public void customercategory() {
		
		String str[] = {"Independent" ,"Professional" ,"Business"};
	 Select select =new Select(driver.findElement(By.id("customer_category")));
	 
	 List<WebElement> customerlist=select.getOptions();
	 System.out.println(customerlist.size());
	 
	 for(int i=0;i<customerlist.size();i++) {
		 
		 Assert.assertEquals(str[i],customerlist.get(i).getText());
		 System.out.println(customerlist.get(i).getText());
		 
	 }
	 logger.info("Verification is done successfully");
	 select.selectByVisibleText("Business");
	 
	}
	
	public void pickyourindustry() throws Exception {
		
		Select selectindustry = new Select(driver.findElement(By.id("pick_your_industry")));
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
