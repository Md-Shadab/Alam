package com.accuride.testCases;

import org.testng.annotations.Test;

import com.accuride.pageObjects.FooterObject;

public class TC_footersection extends BaseClass {

	
	@Test
	public void footersection()
	{
		FooterObject hp = new FooterObject(driver);
		
		hp.verify_footer();
		System.out.println("footer verification is done over here.");
		//logger.info("footer verification is done over here.");
	}
	
	@Test
	public void footersection_check() throws Exception {
		
		FooterObject hp = new FooterObject(driver);
		hp.click_footer();
		System.out.println("every element of the footer is being verified over here");
		//logger.info("every element of the footer is being verified over here");
	}
	
	
	
}
