package com.testNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDemo {
	@Test
	public void m1() {
	//	SoftAssert af = new SoftAssert();
         Assert.assertTrue(10<20);           
          System.out.println("hi print sussfully");
	}
}