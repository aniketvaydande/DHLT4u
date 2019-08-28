package DHLT4U.GenericMethods;

import java.util.Set;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.JavascriptExecutor;

public class BaseClassMethods extends Browser {
	
	//this is base file

	public void highLightElement(WebElement element, WebDriver driver) {

		    // remember the new element
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 2px solid red;");
       
	}

	
	public void selectDropDownValue() {
		
		
	}
	
	
	
	public void selectValueByIndex() {
		
	}
	
	public void herifyHomePage() {
		
		
	}
	
	public void clickOnButtonByText(String Name) {
		
	driver.findElement(By.xpath("//a//div[text()='"+Name+"']")).click();	
		
		
	}
	
	public void forceClickOnButtonByText(String Name) {
		
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		WebElement buttonName = driver.findElement(By.xpath("//a//div[text()='"+Name+"']"));
		System.out.println(buttonName);
	    jsExec.executeScript("arguments[0].click();", buttonName);
			
		}
	
	public void clickOnTab(String Name) {
		WebElement tabName = driver.findElement(By.xpath("//a[@title='"+Name+"']"));
		System.out.println(tabName);
		highLightElement(tabName, driver);
		tabName.click();
	}
	
	public void clickOnListView() {
		WebElement tabName = driver.findElement(By.xpath("//a[text()='List View']"));
		System.out.println(tabName);
		highLightElement(tabName, driver);
		tabName.click();
	}
	
	
	public void forceClickElement(String Name){
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		WebElement tabName = driver.findElement(By.xpath("//a[@title='"+Name+"']"));
		System.out.println(tabName);
	    jsExec.executeScript("arguments[0].click();", tabName);
	}
	
	public void closePopup() {
		
		highLightElement(driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']//button")), driver);
		driver.findElement(By.xpath("//div[@id='onTripVehicleStoppageDetails']//button")).click();
	}
	
	
	
	
}
