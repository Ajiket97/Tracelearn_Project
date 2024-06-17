package com.ParameterofTest;

import org.testng.annotations.Test;

public class ParameterOfTestAnnotation {
	@Test(timeOut = 1000)
	public void m1() throws InterruptedException {
		System.out.println("");
		Thread.sleep(2000);

	}

	@Test(description = "this parameter notedown description")

	public void m2() {
		System.out.println("m2 for description");

	}

	@Test(invocationCount = 3)

	public void m3() {
		System.out.println("m3 run 3 times dut to invocation count parameter");

	}

	@Test(priority = 1)

	public void m4() {
		System.out.println(" m4 Due to priority all method set as serial number");

	}

	@Test(timeOut = 1000)

	public void m5() throws InterruptedException {
		System.out.println("fail due to   compete in in given time");
		Thread.sleep(2000);

	}

	@Test(invocationCount = 3)

	public void m6() throws InterruptedException {
		
		System.out.println("fail");
		Thread.sleep(2000);
		

	}
	@Test(dependsOnMethods = "m1")
	public void m7() {
		System.out.println("if m1 fail then m7 skip");

	}
}
