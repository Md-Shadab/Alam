package com.accuride.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MenusectionObject {
	
	WebDriver ldriver;
	
	public MenusectionObject(WebDriver rdiver){
		
		ldriver=rdiver;
		PageFactory.initElements(rdiver, this);
		
	}
	
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Products')]")
	@CacheLookup
	WebElement products;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Drawer Slides')]")
	@CacheLookup
	WebElement drawerslide;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Specialty Slides')]")
	@CacheLookup
	WebElement specialityslide;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Access Control')]")
	@CacheLookup
	WebElement accesscontrol;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Accessories')]")
	@CacheLookup
	WebElement accessories;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Online Store')]")
	@CacheLookup
	WebElement onlinestore;
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Markets')]")
	@CacheLookup
	WebElement markets;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-0 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Access Control Systems')]")
	@CacheLookup
	WebElement accesscontrolsystem;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-1 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Aerospace / Watercraft')]")
	@CacheLookup
	WebElement areospace;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-2 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Appliances')]")
	@CacheLookup
	WebElement appliances;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-3 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Architectural & Design')]")
	@CacheLookup
	WebElement architecturaldesign;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-4 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Automation / Motion Control')]")
	@CacheLookup
	WebElement automationmotioncontrol;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-0 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Automotive')]")
	@CacheLookup
	WebElement automotive;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-1 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Construction / Railway')]")
	@CacheLookup
	WebElement constructionrailway;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-2 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Electronic Enclosures')]")
	@CacheLookup
	WebElement electronicenclosures;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-3 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Emergency Vehicles')]")
	@CacheLookup
	WebElement emergencyvehicles;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-4 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Healthcare')]")
	@CacheLookup
	WebElement healthcare;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-0 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Homeowners')]")
	@CacheLookup
	WebElement homeowners;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-1 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Machinery')]")
	@CacheLookup
	WebElement machinery;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-2 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Transportation')]")
	@CacheLookup
	WebElement transportation;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-3 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Vending / Cash Handling')]")
	@CacheLookup
	WebElement vendingcashhandling;
	
	@FindBy(xpath="//div[@class='nav-item level2 nav-4 submenu-left subhover  dropdown-submenu']/a/span[contains(text(),'Woodworking & Cabinetry')]")
	@CacheLookup
	WebElement woodworkingcabinetry;
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Resources')]")
	@CacheLookup
	WebElement resources;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'About Slides')]")
	@CacheLookup
	WebElement aboutslides;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Slide Guides')]")
	@CacheLookup
	WebElement slideguides;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Videos')]")
	@CacheLookup
	WebElement videos;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'CADs')]")
	@CacheLookup
	WebElement cads;
	
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'FAQ')]")
	@CacheLookup
	WebElement faqs;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Literature')]")
	@CacheLookup
	WebElement literature;
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Blog')]")
	@CacheLookup
	WebElement blog;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'In Your Industry')]")
	@CacheLookup
	WebElement inyourindustry;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Slideology')]")
	@CacheLookup
	WebElement slideology;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Customer Stories')]")
	@CacheLookup
	WebElement customerstories;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Products')]")
	@CacheLookup
	WebElement blogproduct;
	
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Support')]")
	@CacheLookup
	WebElement support;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Customer Support')]")
	@CacheLookup
	WebElement customersupport;
	
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Shipping and Returns')]")
	@CacheLookup
	WebElement shipingreturns;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Warranty')]")
	@CacheLookup
	WebElement warranty;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Help Center')]")
	@CacheLookup
	WebElement helpcenter;
	
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Company')]")
	@CacheLookup
	WebElement company;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Who we are')]")
	@CacheLookup
	WebElement whoweare;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Why Accuride')]")
	@CacheLookup
	WebElement whyaccuride;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Testimonials')]")
	@CacheLookup
	WebElement testimonials;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Newsroom')]")
	@CacheLookup
	WebElement newsroom;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'OEM Direct')]")
	@CacheLookup
	WebElement oemdirect;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Careers')]")
	@CacheLookup
	WebElement careers;
	
	@FindBy(xpath="//div[@class='dynamic-items col-xs-3 hidden-xs hidden-sm']/ul/li/a/span[contains(text(),'Events')]")
	@CacheLookup
	WebElement events;
	
	
	@FindBy(xpath="//ul[starts-with(@id,'menu-top')]/li/a/span[contains(text(),'Store')]")
	@CacheLookup
	WebElement store;
	
	@FindBy(xpath="//li[@class=' nav-item level0 nav-0 submenu-left subhover  subdynamic dropdown level-top shop']/div/div/div/div/div/div/ul/li/a/span")
	@CacheLookup
	WebElement storeonlinestore;
	
	@FindBy(xpath="//li[@class=' nav-item level0 nav-0 submenu-left subhover  subdynamic dropdown level-top shop']/div/div/div/div/div/div/ul/li[2]/a/span")
	@CacheLookup
	WebElement oem;
	
	@FindBy(xpath="//li[@class=' nav-item level0 nav-0 submenu-left subhover  subdynamic dropdown level-top shop']/div/div/div/div/div/div/ul/li[3]/a/span")
	@CacheLookup
	WebElement distributor;

	
	
	@FindBy(xpath ="//ul[starts-with(@id,'menu-top')]/li/a")
	@CacheLookup
	List<WebElement> Menu;
	
	
	
	
	
		public void verifymenu() {
			
		
			String str1[]= {"PRODUCTS", "MARKETS", "RESOURCES", "BLOG", "SUPPORT", "COMPANY", "STORE"};
			
			
				int  k = Menu.size();
				//System.out.println(k);
			//System.out.println(Menu.get(k).getText());
			
			//System.out.println(i);
				for(int j=0;j<k;j++)
					{
				
					Assert.assertEquals(str1[j], Menu.get(j).getText());
					System.out.println(Menu.get(j).getText());	
				
			}
	}
	
	public void verifymenulist() throws Exception
	{
		
		Actions action = new Actions(ldriver);
		
		action.moveToElement(products).perform();
		Thread.sleep(2000);
		
		action.moveToElement(drawerslide).perform();
		Thread.sleep(1000);
		
		action.moveToElement(specialityslide).perform();
		Thread.sleep(2000);
		
		action.moveToElement(accesscontrol).perform();
		Thread.sleep(1000);
		
		action.moveToElement(accessories).perform();
		Thread.sleep(1000);
		
		action.moveToElement(onlinestore).perform();
		Thread.sleep(1000);
		
		action.moveToElement(markets).perform();
		Thread.sleep(1000);
		
		action.moveToElement(accesscontrolsystem).perform();
		Thread.sleep(1000);

		action.moveToElement(areospace).perform();
		Thread.sleep(1000);
		
		action.moveToElement(appliances).perform();
		Thread.sleep(1000);
		
		action.moveToElement(areospace).perform();
		Thread.sleep(1000);
		
		action.moveToElement(appliances).perform();
		Thread.sleep(1000);
		
		action.moveToElement(architecturaldesign).perform();
		Thread.sleep(1000);
		
		action.moveToElement(automationmotioncontrol).perform();
		Thread.sleep(1000);
		
		action.moveToElement(automotive).perform();
		Thread.sleep(1000);
		
		action.moveToElement(constructionrailway).perform();
		Thread.sleep(1000);
		
		action.moveToElement(electronicenclosures).perform();
		Thread.sleep(1000);
		
		action.moveToElement(emergencyvehicles).perform();
		Thread.sleep(1000);
		
		action.moveToElement(healthcare).perform();
		Thread.sleep(1000);
		
		action.moveToElement(homeowners).perform();
		Thread.sleep(1000);
		
		action.moveToElement(machinery).perform();
		Thread.sleep(1000);
		
		action.moveToElement(transportation).perform();
		Thread.sleep(1000);
		
		action.moveToElement(vendingcashhandling).perform();
		Thread.sleep(1000);
		
		action.moveToElement(woodworkingcabinetry).perform();
		Thread.sleep(1000);
		
		
		action.moveToElement(resources).perform();
		Thread.sleep(1000);
		
		action.moveToElement(aboutslides).perform();
		Thread.sleep(1000);
		
		action.moveToElement(slideguides).perform();
		Thread.sleep(1000);
		
		action.moveToElement(videos).perform();
		Thread.sleep(1000);
		
		action.moveToElement(cads).perform();
		Thread.sleep(1000);
		
		action.moveToElement(faqs).perform();
		Thread.sleep(1000);
		
		action.moveToElement(literature).perform();
		Thread.sleep(1000);
		
		action.moveToElement(blog).perform();
		Thread.sleep(1000);
		
		action.moveToElement(inyourindustry).perform();
		Thread.sleep(1000);
		
		action.moveToElement(slideology).perform();
		Thread.sleep(1000);
		
		action.moveToElement(customerstories).perform();
		Thread.sleep(1000);
		
		action.moveToElement(blogproduct).perform();
		Thread.sleep(1000);
		
		action.moveToElement(support).perform();
		Thread.sleep(1000);
		
		action.moveToElement(customersupport).perform();
		Thread.sleep(1000);
		
		action.moveToElement(shipingreturns).perform();
		Thread.sleep(1000);
		
		action.moveToElement(warranty).perform();
		Thread.sleep(1000);
		
		action.moveToElement(helpcenter).perform();
		Thread.sleep(1000);
		

		action.moveToElement(company).perform();
		Thread.sleep(1000);
		
		action.moveToElement(whoweare).perform();
		Thread.sleep(1000);
		
		action.moveToElement(whyaccuride).perform();
		Thread.sleep(1000);
		
		action.moveToElement(testimonials).perform();
		Thread.sleep(1000);
		
		action.moveToElement(newsroom).perform();
		Thread.sleep(1000);
		
		action.moveToElement(oemdirect).perform();
		Thread.sleep(1000);
		
		action.moveToElement(careers).perform();
		Thread.sleep(1000);
		
		action.moveToElement(events).perform();
		Thread.sleep(1000);
		
		action.moveToElement(store).perform();
		Thread.sleep(1000);
		
		action.moveToElement(storeonlinestore).perform();
		Thread.sleep(1000);
		
		action.moveToElement(oem).perform();
		Thread.sleep(1000);
		
		action.moveToElement(distributor).perform();
		Thread.sleep(1000);
	}
	
	
	

}
