package com.ParallelBrowserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CbtTesting {

	@Test
	public void cbtMethod() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");// https://www.google.com/
		System.out.println("This is CBT Method");
	}

}
