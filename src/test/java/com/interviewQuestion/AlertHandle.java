package com.interviewQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertHandle {
	@Test
	public void alertHandle() throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://the-internet.herokuapp.com/");
		d.findElement(By.xpath("//a[text()='Basic Auth']")).click();
		
		Alert al = d.switchTo().alert();
		
		al.accept();
	}
}
