package com.selenimum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandleMultiplepdf {
	static RemoteWebDriver driver;
public static void main(String[] args) {
	driver = new ChromeDriver();

	driver.get("https://testautomationpractice.blogspot.com/");
	WebElement web = driver.findElement(By.id("multipleFilesInput"));
	String f1 = "C:/Users/shrik/Downloads/sample (1).pdf";
	String f2 = "C:/Users/shrik/Downloads/sample (2).pdf";
	String f3 = "C:/Users/shrik/Downloads/sample.pdf";
	web.sendKeys(f1+"\n"+f2+"\n"+f3);
	driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
}
}
