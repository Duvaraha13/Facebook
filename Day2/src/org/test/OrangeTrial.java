package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeTrial {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dd\\git\\Facebook\\Day2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement logUser = driver.findElement(By.id("txtUsername"));
		logUser.sendKeys("fkdnfndf");
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("good");

		WebElement clicl = driver.findElement(By.id("btnLogin"));
		clicl.click();
	}

}
////input[@id='txtUsername']
