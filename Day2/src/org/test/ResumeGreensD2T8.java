package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeGreensD2T8 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\EClipse workspace\\Day2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		WebElement btnModelresume = driver.findElement(By.xpath("//div[@id='heading201']"));
		btnModelresume.click();
		WebElement btnClick = driver.findElement(By.xpath("//a[contains(@title,'Model Resume training in chennai')][1]"));
		btnClick.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
