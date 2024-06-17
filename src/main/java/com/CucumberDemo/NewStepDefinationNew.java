package com.CucumberDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class NewStepDefinationNew {
	RemoteWebDriver d ;
	
	@Given("open new chrome browser")
	public void open_new_chrome_browser() {
		d = new ChromeDriver(); 
	    
	}

	@And("launch  Automation Testing Practice url")
	public void launch_automation_testing_practice_url() {
		d.get("https://testautomationpractice.blogspot.com/");
	    
	}

	@And("fill the form as{string}{string}{string}")
	public void fill_the_form_as_name_name_e_mail_email_phone_phone(String name,String Email,String phone) {
		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(name);
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(Email);
		d.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(phone);

	}
	@Given("fill the as{string}")
	public void fill_the(String name) {
		d.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys(name);
	   
	}






}
