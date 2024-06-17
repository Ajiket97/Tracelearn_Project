package com.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class A {
	WebDriver driver;
	@BeforeTest
	public void m1() {
		System.out.println("@Before Test");
	}

	@Test
	@Parameters({"url","browser"})
	public void m2(String url,String browser) {
		
		if(browser.equalsIgnoreCase("ff")) {
			 driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("C")) {
			driver=new ChromeDriver();
		}
		else
			System.out.println("Invalid browser name");
		
		driver.get(url);//https://www.google.com/
		String title=driver.getTitle();
		String exp="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra123";
		System.out.println(title);
		int a=10;
		Assert.assertTrue(a<=9);
		System.out.println("Excecution after fail");
		
	}

	@Test
	public void m3() {
		int a=10;
		int b=20;
		int c=30;
		int sum=a+b;
		int sum1=b+c;
		SoftAssert softly=new SoftAssert();
		softly.assertEquals(sum,40);
		System.out.println("Excecution after fail123");
		softly.assertEquals(sum1,50);
		System.out.println("Excecution after fail");
		softly.assertAll();
		
	}

	@BeforeClass
	public void m4() {
		System.out.println("@Before class");
	}

}
