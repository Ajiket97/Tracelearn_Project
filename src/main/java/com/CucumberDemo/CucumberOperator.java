package com.CucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberOperator {
	RemoteWebDriver d;

	@Given("send name")

	public void name() {
		d = new ChromeDriver();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("ajit");

	}

	@Then("enter mail-id")

	public void email() {
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ajit123@GMAil.coom");

	}

	@And("phone ummber also")

	public void phone() {
		d.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys("99876541230");

	}

	@When("enter adress")

	public void adress() {
		d.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys("puneri");

	}
}
