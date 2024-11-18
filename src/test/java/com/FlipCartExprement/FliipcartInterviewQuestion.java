package com.FlipCartExprement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FliipcartInterviewQuestion {
	@Test
	public void vrifyPrice() throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.flipkart.com/search?q=whirpool&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		Thread.sleep(3000);
	   String text =  d.findElement(By.xpath("//a[text()=\"Whirlpool AC Whirlpool Remote Controller\"]/parent::div/child::a[3]/div/div[@class=\"Nx9bqj\"]")).getText();
	   System.out.println(text);
	}
}
