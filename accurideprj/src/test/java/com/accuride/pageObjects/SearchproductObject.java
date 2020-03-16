package com.accuride.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchproductObject {

	WebDriver ldriver;
	
	
	public SearchproductObject(WebDriver rdiver){
		
		
		ldriver=rdiver;
		PageFactory.initElements(rdiver, this);
	}
	
	
	@FindBy(xpath="//input[@class='input-text sli_searchbox_textfield']")
	@CacheLookup
	WebElement searchfield;

	@FindBy(xpath="//div[@class='product details product-item-details sli_generic_container']")
	@CacheLookup
	WebElement oneproduct;
	
	@FindBy(id="attribute_393_3342")
	@CacheLookup
	WebElement length;
	
	@FindBy(xpath="//span[@class='minus update']")
	@CacheLookup
	WebElement minusupdate;
	
	@FindBy(xpath="//span[@class='plus update']")
	@CacheLookup
	WebElement plusupdate;
	
	@FindBy(xpath="//button[@class='action tocart primary']/span")
	@CacheLookup
	WebElement addtocart;
	
	@FindBy(xpath="//span[@class='base']")
	@CacheLookup
	WebElement searchresulttextmsg;
	
	@FindBy(id="product-addtocart-button")
	@CacheLookup
	WebElement addtocartbtn;
	
	@FindBy(xpath="//a[@class='action showcart']")
	@CacheLookup
	WebElement cartimage;
	
	@FindBy(id="top-cart-btn-checkout")
	@CacheLookup
	WebElement checkoutbtn;
	
	@FindBy(name="super_attribute[393]")
	@CacheLookup
	WebElement length2;
	
	public void searchinputverify(String productname) throws Exception {
		
		searchfield.clear();
		searchfield.sendKeys(productname);
		Thread.sleep(3000);
		searchfield.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
			
	}
	
	public void searchresultverify() throws InterruptedException {
	
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);

		
		Actions producthover = new Actions(ldriver);
		producthover.moveToElement(oneproduct).perform();
		Thread.sleep(5000);
			
		Select sl= new Select(length);
		sl.selectByIndex(3);
		Thread.sleep(2000);
		
		minusupdate.click();
		Thread.sleep(2000);
		
		plusupdate.click();
		Thread.sleep(3000);
		
		addtocart.click();
		Thread.sleep(5000);
		
		Select s2= new Select(length2);
		s2.selectByIndex(3);
		Thread.sleep(5000);
		addtocartbtn.click();
		Thread.sleep(5000);
		
		cartimage.click();
		Thread.sleep(5000);
		
		checkoutbtn.click();
		Thread.sleep(5000);
		
		
	}	
	
	public void resulttext() {
		
		if(searchresulttextmsg.getText().equalsIgnoreCase("Search results for 'light duty'")) {
			
			System.out.println("search result is according to the input entry");
		}
		
		else
		{
			System.out.println("search result is not according to the input entry");
		}
		
	}
	
	
	
	
	
}
