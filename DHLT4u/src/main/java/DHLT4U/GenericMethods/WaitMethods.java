package DHLT4U.GenericMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import DHLT4U.DashboardsTest.*;

public class WaitMethods extends Browser {

	public void hardWait() {
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

	}

	public void waitUntil(WebElement element) {
	//	Wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public void hardWaitx() {
		//driver.manage().timeouts();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);

	}

	
}
