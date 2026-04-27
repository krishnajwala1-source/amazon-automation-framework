package test;

import org.testng.annotations.Test;
import org.testng.Assert;
import base.BaseTest;
import pages.SearchResultsPage;
import pages.homePage;
import pages.titleVerification;

@Test
public class searchPage_Test extends BaseTest{
		
		public void titleVerify() {
		titleVerification sp= new titleVerification(getDriver());
		sp.verifyTitle();
	
	    }
	
		public void searchProduct() {
	    homePage hp= new homePage(getDriver());
	    hp.searchProduct("iphone");
	    	
	    SearchResultsPage results = new SearchResultsPage(getDriver());
	    //Assert.assertTrue(results.getResultsCount() > 0);
	    int count = results.getResultsCount();
	    System.out.println("Results count: " + count);

	    Assert.assertTrue(count > 0, "No results found!");
	    }
	        
	    }
	
	
	    
	
	
		
	


