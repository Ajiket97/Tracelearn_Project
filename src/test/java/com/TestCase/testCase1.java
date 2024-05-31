package com.TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testCase1 {
	@Test
	public void m1() {
		System.out.println("this is m1 ");
	}

	@AfterMethod

	public void m2() {
		System.out.println("this is after method m2");
	}

	@AfterClass

	public void m3() {
		System.out.println("this is afterClass m3");
	}

	@BeforeTest
	public void m4() {
		System.out.println("Before test m4");
	}

	@BeforeClass
	public void m5() {
		System.out.println("this is BeforeClass m5");

	}

	@BeforeMethod
	public void m6() {
		System.out.println("this is BeforeMethod ");
	}

	@BeforeSuite
	public void m7() {
		System.out.println("BeforeSuite m7");
	}
}
