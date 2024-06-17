package com.FlipCartExprement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
	@Test
	public void offerPriceOfShoes() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.myntra.com/shoes?rawQuery=shoes");
		d.findElements(By.xpath("//ul[@class=\"results-base\"]/li[@class=\"product-base\"]/descendant::h4[@class=\"product-product\"]/parent::div/child::div[@class=\"product-price\"]/descendant::span[@class=\"product-discountedPrice\"]"));
	List<WebElement> list = d.findElements(By.xpath("//ul[@class=\"results-base\"]/li[@class=\"product-base\"]/descendant::h4[@class=\"product-product\"]"));
		for (WebElement webElement : list) {
			String shoesname = webElement.getText();
			String ShoesPrice = d.findElement(By.xpath("//ul[@class=\"results-base\"]/li[@class=\"product-base\"]/descendant::h4[text()='"+shoesname+"']/parent::div/child::div[@class=\"product-price\"]/descendant::span[@class=\"product-discountedPrice\"][1]")).getText();
System.out.println(shoesname+"------------>"+ShoesPrice);
		}
	}
}
