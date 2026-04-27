package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class titleVerification {
	
	//Constructor
	WebDriver driver;
	
	public titleVerification(WebDriver driver) {
		
		this.driver=driver;	
		
	}
	
	//locator
	
			//Actions
	 
		 public void verifyTitle() {
			 
			 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

			    wait.until(ExpectedConditions.titleContains("Amazon"));

			    String title = driver.getTitle();
			    System.out.println(title);

			   /* if (title.contains("Amazon")) {
			        System.out.println("Verification Successful: Title contains 'Amazon'");
			    } else {
			        System.out.println("Verification Failed: Title does not contain 'Amazon'");
			    }*/
			    
			    //instead using if else we can use assert
			    
			    Assert.assertTrue(title.contains("Amazon"), "Title verification failed");
			    
			}


		 }
