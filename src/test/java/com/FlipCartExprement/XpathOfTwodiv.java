package com.FlipCartExprement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class XpathOfTwodiv {
	@Test
	public void xpathFind() throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		
		Actions act = new Actions(d);
		
		act.moveToElement(d.findElement(By.xpath("//span[text()='Fashion']"))).perform();
		//Thread.sleep(6000)		;

		
		d.findElement(By.xpath("//div[@class=\"_1UgUYI _2eN8ye\"]/descendant::a[text()='Women Ethnic']/ancestor::div[@class=\"_1UgUYI _2eN8ye\"]/child::div[@class=\"_31z7R_\"]/descendant::a[3]")).click();
	}

	
}
