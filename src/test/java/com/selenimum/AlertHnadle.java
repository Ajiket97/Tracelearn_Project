package com.selenimum;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class AlertHnadle {
	RemoteWebDriver d;
	@Test
	public void handlingAlert() throws InterruptedException {
		   FluentWait wait = new FluentWait(d);
          d = new ChromeDriver();
          d.manage().window().maximize();
          d.get("https://www.testingshastra.com/prompt/"); 
          Thread.sleep(6000);
        //  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"pum-content popmake-content\"]")));
          d.findElement(By.xpath("//button[@type=\"button\"]")).click();
         // d.findElement(By.xpath("//input[@name=\"YourName\"]")).sendKeys("Ajit");
          d.findElement(By.xpath("//button[text()='Click Me']")).click();
          Alert a = d.switchTo().alert();
          a.sendKeys("ajit");
          a.accept();
          a.sendKeys("ajit");
          a.accept();
          String text =d.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
          System.out.println(text);
	}
}
