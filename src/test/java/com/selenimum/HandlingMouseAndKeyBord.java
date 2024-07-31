package com.selenimum;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandlingMouseAndKeyBord {
	static RemoteWebDriver d; // Rk robat class for keyboard

	@Test // Am actions class for mouse
	public static void ByActionsClass() throws InterruptedException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		WebElement web = d.findElement(By.xpath("//span[text()='About Us']"));
		Actions act = new Actions(d);
		act.moveToElement(web).contextClick().perform();
		System.out.println("actionPerform");
		// d.quit();
	}

	@Test
	public void robotClass() throws InterruptedException, AWTException {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.testingshastra.com/");
		Thread.sleep(1000);
		d.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		WebElement web = d.findElement(By.xpath("//span[text()='About Us']"));
		Robot robo = new Robot();

	}
}
