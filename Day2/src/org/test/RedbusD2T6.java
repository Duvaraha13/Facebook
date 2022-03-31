package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusD2T6 {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\EClipse workspace\\Day2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement btnSignup = driver.findElement(By.xpath("//div[@class='fr config-div']"));
		btnSignup.click();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
