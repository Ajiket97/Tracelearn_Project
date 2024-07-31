package com.selenimum;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FrameHandling {
	RemoteWebDriver d;

	@Test
	public void handlingFrame() throws InterruptedException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/parent-window/");
		Thread.sleep(6000);
		d.findElement(By.xpath("//button[@type=\"button\"]")).click();
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@name=\"fname\"]")).sendKeys("ajit");
		d.switchTo().frame(0);
		d.findElement(By.xpath("//input[@name=\"lname\"]")).sendKeys("Shingnare");
		d.switchTo().parentFrame();
		d.findElement(By.xpath("//button[@name=\"ok-btn\"]")).click();
		
	}
}
