package com.FlipCartExprement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class W3SchoolXpath {
@Test
	public static void verifyCustomerName() {
		String country = "Mexico";
	        ChromeDriver d = new ChromeDriver();
	        d.manage().window().maximize();
	        d.get("https://www.w3schools.com/sql/sql_and.asp");
	       // List<WebElement> ContryName = d.findElements(By.xpath("//table/tbody/tr/td[7]"));
	        //List<WebElement> allList = d.findElements(By.xpath("//table/tbody/tr/td[2]/following::td[5]"));
	        List<WebElement> allList = d.findElements(By.xpath("//td[text()='"+country+"']/preceding::td[5]"));
	            for (WebElement webElement : allList) {
					String text = webElement.getText();
					System.out.println(country +"------------"+ text);
				}
	        }
	    

	public static void main(String[] args) {
		verifyCustomerName();
	}

}
