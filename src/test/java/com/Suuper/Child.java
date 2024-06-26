package com.Suuper;

public class Child extends Parrent {

	public Child() {
		super();
		System.out.println("Child class constuctor");
	}

	public void m1() {
       System.out.println("Child class method");
	}

	public static void main(String[] args) {
       Child c = new Child();
       c.m1();
	}

}
