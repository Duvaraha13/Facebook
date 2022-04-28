package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {
	
	public static void main (String[]args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dd\\git\\Facebook\\Day2\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	//JavaScriptExecutor js = (JavaScriptExecutor) driver;
JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement closeClick = driver.findElement(By.xpath("//button[text()='✕']"));
    closeClick.click();
	
     WebElement input = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
     
  js.executeScript("arguments[0].setAttribute('value','iphone')",input);
 
  
     Object script = js.executeScript("return arguments[0].getAttribute('value')",input );
     
     System.out.println(script);
}
}