package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.waitUtils;


public class homePage {
	
	
	WebDriver driver;
    waitUtils waitUtil;

    // Constructor
    public homePage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new waitUtils(driver); // ✅ important
    }

    // Locators
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
	
	//actions
    public void searchProduct(String product) {
        waitUtil.waitForVisible(searchBox).sendKeys(product);
        waitUtil.waitForClickable(searchButton).click();
    }
	    }

