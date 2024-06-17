package com.CucumberDemo;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	RemoteWebDriver d;

//	@When("open chrome browser")
//	public void open_chrome_browser() {
//		d = new ChromeDriver();
//
//	}

//	@Then("lauch Url")
//	public void lauch_url() {
//		d.get("https://testautomationpractice.blogspot.com/");
//
//	}
//
//	@Then("fill the form {string}{string}{string}{string}")
//	public void fill_the_form_ajit(String name, String email, String phone, String adress) {
//		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(name);
//		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(email);
//		d.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(phone);
//		d.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys(adress);
//
//	}

	@Given("i have a following list of fruits<fruits> and is Quantity<quantity>:")
	public void i_have_a_following_list_of_fruits_fruits_and_is_quantity_quantity(DataTable table) {
		Map<String, String> map = table.asMap();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println(val + "" + key);
			d = new ChromeDriver();


			d.get("https://testautomationpractice.blogspot.com/");

			d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(val);
			d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(key);

		}
	}

}
