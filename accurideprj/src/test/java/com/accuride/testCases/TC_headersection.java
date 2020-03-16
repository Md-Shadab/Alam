package com.accuride.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.accuride.pageObjects.HomepageObject;

public class TC_headersection extends BaseClass {

	
	

		@Test(priority=1)
		public void header_verify() throws  InterruptedException, IOException {
			
			driver.get(baseURL);
			
			HomepageObject hp = new HomepageObject(driver);
			hp.verifyheader();
			//hp.verify_footer();
			logger.info("Homepage header is being verified over here.");
			
		}
		
		
		@Test(priority=2)
		public void footersection()
		{
			HomepageObject hp = new HomepageObject(driver);
			
			hp.verify_footer();
			logger.info("footer verification is done over here.");
		}
			
		}
	

