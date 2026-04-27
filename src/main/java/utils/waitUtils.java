
	package utils;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class waitUtils {
		
		
		    WebDriver driver;
		    WebDriverWait wait;

		    // ✅ Proper constructor (NO void)
		    public waitUtils(WebDriver driver) {
		        this.driver = driver;
		        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }

		    // Wait for element visible
		    public WebElement waitForVisible(By locator) {
		        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		    }

		    // Wait for clickable
		    public WebElement waitForClickable(By locator) {
		        return wait.until(ExpectedConditions.elementToBeClickable(locator));
		    }

		    // Wait for invisibility
		    public boolean waitForInvisibility(By locator) {
		        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		    }

		    // Wait for page load
		    public void waitForPageLoad() {
		    	 wait.until(d -> ((JavascriptExecutor) d)
		                 .executeScript("return document.readyState").equals("complete"));
		     }
		    }



