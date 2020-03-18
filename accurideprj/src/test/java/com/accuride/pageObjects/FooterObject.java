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

	WebElement lt = ldriver.findElement(By.xpath("//ul[@class='footer links']/li")); 
	
	List<WebElement> lt1 = lt.findElements(By.tagName("a"));
	//int z =footer.size();
	int z= lt1.size();
	
	for(int i=0;i<z;i++) {
		
		lt1.get(i).click();
		ldriver.navigate().back();
		Thread.sleep(3000);
	}
	
	}
}



