package DHLT4U.Pages.Dashboards;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;		
import org.testng.annotations.Test;

import DHLT4U.GenericMethods.BaseClassMethods;
import DHLT4U.GenericMethods.Browser;
import DHLT4U.TestData.*;


public class VerifyHomePage extends BaseClassMethods
{
	public void verifyHomePageHeaders()
	{
	if(driver.findElement(By.xpath("//*[@id='menuJson']/li[1]/a")).isDisplayed())
	{
		System.out.println("Dashboard element verified");
		
	}
	else{
		System.out.println("Dashboard element missing");
	}
		
	}

}
