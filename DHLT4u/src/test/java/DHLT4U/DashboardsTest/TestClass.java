package DHLT4U.DashboardsTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import DHLT4U.TestData.LoginTestData;

public class TestClass {

	public static void main(String[] args) throws MalformedURLException {
		
		//Define Capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//Chrome options definition
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String HubURL = "http://23.133.38.99:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(HubURL), options);
		
		
		driver.get("https://track.dhlsmartrucking.com");
		System.out.println("Hub is running");
		
		WebElement userName =  driver.findElement(By.xpath("//input[@name='userName']"));
		userName.sendKeys("Aniket");
				
		WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
		passWord.sendKeys("Qwerty@101");
				
		//click on Login
		WebElement login = driver.findElement(By.xpath("/html/body/form/div/div[4]/button"));
		login.click();
		driver.manage().timeouts().pageLoadTimeout(30000, TimeUnit.MILLISECONDS);
		driver.close();
	}

}
