package com.accuride.pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterObject {

	WebDriver ldriver;
	
	
	public FooterObject(WebDriver rdriver){
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	
	@FindBy(xpath="//ul[@class='footer links']/li/a")
	@CacheLookup
	List<WebElement> footer;
	
	
	
public void verify_footer() {
		
		
		int z= footer.size();
		//System.out.println(z);
		for(int i=0;i<z;i++) {
			
			System.out.println(footer.get(i).getText());
		}
		
	}



public void click_footer() throws Exception {
	
	JavascriptExecutor js = (JavascriptExecutor) ldriver;
	
	js.executeScript("window.scrollBy(0,2500)");
	Thread.sleep(5000);

	WebElement lt = ldriver.findElement(By.xpath("//ul[@class='footer links']")); 
	List<WebElement> lt1 = lt.findElements(By.tagName("a"));
	
	for(WebElement str : lt1) {
		
		//String lt3 =str.getText();
		String lt3 = str.getAttribute("href");
	System.out.println(str.getAttribute("href"));
		str.click();
		ldriver.navigate().back();
		Thread.sleep(3000);
	
	}
	//webElement lt2=lt1.size();
	
/*	System.out.print(lt1.get(2).getAttribute("href"));
	//int z =footer.size();
	int z= lt1.size();
	
	for(WebElement webEle : lt1) {
		
		webEle.click();
		ldriver.navigate().back();
		Thread.sleep(3000);
	}*/
	
	}
}




