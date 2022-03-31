package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripD2T7 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\EClipse workspace\\Day2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		WebElement txtFrom = driver.findElement(By.xpath("//input[@id='from_station']"));
		txtFrom.sendKeys("CHENNAI");
		WebElement txtTo = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtTo.sendKeys("DELHI");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
