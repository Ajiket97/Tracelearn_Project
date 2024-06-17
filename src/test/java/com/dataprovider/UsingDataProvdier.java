package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyListener.class)
public class UsingDataProvdier {
	RemoteWebDriver d;

	@Test(dataProvider = "DataFeatch", dataProviderClass = DataProviderDemo.class)
	private void m1(String name, String Email, String phone, String adress) throws InterruptedException {
		//String exp = "Easy 14 days return & exchange available";

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(name);
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(Email);
		d.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(phone);
		d.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys(adress);
		d.quit();

	}

}
