package com.selenimum;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownList {
	@Test
	public static void dropdownList() {

		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement web = d.findElement(By.xpath("//select[@id=\"colors\"]"));

		Select s = new Select(web);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.deselectByIndex(1);

		
	}
}
