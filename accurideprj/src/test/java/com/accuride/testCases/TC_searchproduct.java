package com.accuride.testCases;

import org.testng.annotations.Test;

import com.accuride.pageObjects.SearchproductObject;

public class TC_searchproduct extends BaseClass {

	
	@Test
	public void searchproductname() throws Exception {
	
		
		SearchproductObject sp = new SearchproductObject(driver);
		
		sp.searchinputverify(productnameforsearch);
		logger.info("search field method is working or not ");
		logger.info("product name is entered in search box field");
		
		
		sp.resulttext();
		logger.info("text for search result");
	
		
		sp.searchresultverify();
		logger.info("Mouse hover to one particular product on search result ");
		
	}
	
	
	
	
	
}
