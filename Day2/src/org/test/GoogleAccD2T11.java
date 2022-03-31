package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAccD2T11 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\EClipse workspace\\Day2\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		txtFirstName.sendKeys("DUVARAHANATH");
		WebElement txtLastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		txtLastname.sendKeys("D");
		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='username']"));
		txtUserName.sendKeys("duvaraha");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='Passwd']"));
		txtPassword.sendKeys("Du147");

		WebElement txtConfirmPass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		txtConfirmPass.sendKeys("Du147");

	}

}
