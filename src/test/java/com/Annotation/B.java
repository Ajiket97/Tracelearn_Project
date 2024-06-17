package com.Annotation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B {
	@Test
	public void m1() {
		System.out.println("m1 of B");
	}

	@BeforeMethod

	public void m2() {
		System.out.println("@BeforeMethod");
	}

	@Test

	public void m3() {
		System.out.println("m3 of B");
	}

	@Test

	public void m4() {
		System.out.println("m4 of B");
	}

}
