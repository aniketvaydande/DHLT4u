package DHLT4U.DashboardsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
import DHLT4U.GenericMethods.WaitMethods;
import DHLT4U.Pages.Dashboards.VerifyHomePage;
import DHLT4U.TestData.*;

public class LoginTest
{
	@BeforeTest
    public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Aniket\\Selenium\\chromedriver_win32\\chromedriver.exe");//temp driver path
    //	System.setProperty("webdriver.chrome.driver", "*\\DHL_SalesForce\\src\\test\\drivers\\chromedriver.exe"); need to use this path
    //	Browser setUp = new Browser();
    //	setUp.setUpBrowser();
    }

    @AfterTest
    public void tearDown() {
	//	Browser setUp = new Browser();
    //	setUp.tearDownBrowser();
    }

    /**

     * This test case will login in sales force and Create leads.
     * @throws MalformedURLException 

     */

    @SuppressWarnings("null")
	@Test
	public void Login()
	{
    	WebDriver driver = null;
		LoginTestData LTD = new LoginTestData();
		Browser br = new Browser();
		BaseClassMethods bcm = new BaseClassMethods();
	//	System.setProperty("webdriver.chrome.driver", "C:\\Aniket\\Selenium\\chromedriver_win32\\chromedriver.exe");
		br.userLogin(LoginTestData.userName, LoginTestData.password);
//		driver.manage().timeouts().pageLoadTimeout(10000, TimeUnit.MILLISECONDS);
	    WaitMethods wait = new WaitMethods();
		wait.hardWait();
		
	
		
		
	//	driver.switchTo().equals(driver.findElement(By.xpath("//div[@class='container']//div[@id='addModify']//following::div[@id='onTripVehicleStoppageDetails']")));
	//	driver.switchTo().activeElement();
		if (driver.findElement(By.xpath("//div[@id='navbarsExample04']")).isDisplayed()){
		
		bcm.highLightElement(driver.findElement(By.xpath("//a//img[@id='companyImage']")), driver);
		driver.findElement(By.xpath("//a//img[@id='companyImage']")).click();
		}
		driver.switchTo().defaultContent();
		
		bcm.highLightElement(driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']")), driver);
		bcm.closePopup(); 
		
		
		
		driver.findElement(By.xpath("//a[text()='Dashboard']")).click();
		driver.findElement(By.xpath("//a[text()='Dashboard']")).sendKeys("Executive Live View");
		
		driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']")).click();
		bcm.highLightElement(driver.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']")), driver);
		
		//driver.switchTo().equals(driver.findElement(By.xpath("//div[@class='container']//div[@id='addModify']//following::div[@id='onTripVehicleStoppageDetails']")));
		driver.findElement(By.xpath("//div[@class='container']//div[@id='addModify']//following::div[@id='onTripVehicleStoppageDetails']")).click();
		
		//bcm.highLightElement(driver.findElement(By.xpath("//p[text()='Enroute Placement']")), driver);
		
		bcm.highLightElement(driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']")), driver);
		driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']//button")).click();
	/*	driver.navigate().equals(driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']")));
		if (driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']")).isDisplayed()){
			*/
			bcm.highLightElement(driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']")), driver);
			bcm.closePopup(); 
			driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
	/*	}
		*/
		
		VerifyHomePage vhp = new VerifyHomePage();
		vhp.verifyHomePageHeaders();
	}

}
