package DHLT4U.GenericMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import DHLT4U.TestData.*;

//This is Browser Setting Program

public class Browser {
	// Initialize browser.
	public static WebDriver driver = null;
			
	public void userLogin(String UserName, String Password) {
		
		BaseClassMethods functionMethod = new BaseClassMethods();
		LoginTestData testdata =new LoginTestData();
		driver=new ChromeDriver();
		driver.get("https://track.dhlsmartrucking.com");
		driver.manage().window().maximize();
		
		//verify login page displayed.
		boolean loginPageDisplayed = driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed();
		
		if (loginPageDisplayed == true) {
			//identify user name and password text box
			WebElement userName =  driver.findElement(By.xpath("//input[@name='userName']"));
			functionMethod.highLightElement(userName, driver);
			userName.sendKeys(LoginTestData.userName);
			
			WebElement passWord = driver.findElement(By.xpath("//input[@name='password']"));
			functionMethod.highLightElement(passWord, driver);
			passWord.sendKeys(LoginTestData.password);
			
			//click on Login
			WebElement login = driver.findElement(By.xpath("/html/body/form/div/div[4]/button"));
			login.click();
			
			driver.manage().timeouts().pageLoadTimeout(7000, TimeUnit.MILLISECONDS);
			System.out.println("Login Successful");
						
		}
		
	}
	
	
	public void Logout() {
	
		BaseClassMethods BasePage = new BaseClassMethods();
		
		  driver.switchTo().activeElement(); 
		  WebElement profileIcon =  driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@id='rightNav']//li[1]//a[@class='nav-link']//img"));
		  profileIcon.click();
		  
		  //Click on logout  
		  WebElement logOut = driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ul[@id='rightNav']//li[1]//a[text()='Logout']")); 
		  BasePage.highLightElement(logOut, driver); 
		  logOut.click();
		 
		
		//close the browser
		driver.quit();
		
	}
	
	
}
