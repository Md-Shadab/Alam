package com.accuride.testCases;

import org.testng.annotations.Test;

import com.accuride.pageObjects.MenusectionObject;

public class TC_menusection extends BaseClass {

	
	
	@Test
	public void menu_verify() {
		
		MenusectionObject mp = new MenusectionObject(driver);
		driver.get(baseURL);
		
		mp.verifymenu();
		logger.info("menu verification is done here");
			
			//captureScreen(driver,"menu_verify");
		
	}
	
	
	@Test
	public void menulist_verify() throws Exception {
		
		MenusectionObject mp = new MenusectionObject(driver);
		
		
		mp.verifymenulist();
		
	}
	
	
	
}
