package org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWeight {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dd\\git\\Facebook\\Day2\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.phptravels.net/login");
		WebElement userName = driver.findElement(By.xpath("//input[.='Email']"));
		userName.sendKeys("ewkmf");
		String text = userName.getText();
		System.out.println(text);
	}

	
}
