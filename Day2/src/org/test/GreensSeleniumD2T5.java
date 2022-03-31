package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensSeleniumD2T5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\EClipse workspace\\Day2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnClick = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		btnClick.click();
		WebElement btnCtsClick = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		btnCtsClick.click();

	}

}
