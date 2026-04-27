package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.waitUtils;

public class SearchResultsPage {

    WebDriver driver;
    waitUtils waitUtil;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new waitUtils(driver); // ✅ important
    }

    By results = By.cssSelector("div[data-component-type='s-search-result']");

    public int getResultsCount() {

        waitUtil.waitForVisible(results); // ✅ wait before counting

        return driver.findElements(results).size();
        
    }

}
