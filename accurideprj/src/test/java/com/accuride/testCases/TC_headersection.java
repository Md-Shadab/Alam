package com.accuride.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import com.accuride.pageObjects.HeaderObject;

public class TC_headersection extends BaseClass {

	
	

		@Test
		public void header_verify() throws  InterruptedException, IOException {
			
			driver.get(baseURL);
			
			HeaderObject hp = new HeaderObject(driver);
			hp.verifyheader();
			//hp.verify_footer();
			logger.info("Homepage header is being verified over here.");
			
		}
		
		
		
			
		}
	

