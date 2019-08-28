package DHLT4U.DashboardsTest;

import DHLT4U.GenericMethods.*;
import DHLT4U.TestData.LoginTestData;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import DHLT4U.DashboardsTest.*;

public class SLADashboardTest
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

     */

    @Test
    public void SLADashboardTest()
    {
    	WebDriver driver = null;
    	LoginTestData LTD = new LoginTestData();
		Browser br = new Browser();
		BaseClassMethods bcm = new BaseClassMethods();
		
		br.userLogin(LTD.userName, LTD.password);
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
		
		
    	
    }
}
