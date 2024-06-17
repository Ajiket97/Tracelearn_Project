package com.FlipCartExprement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyPrice {
	public static String text;
	public static String pText;

	@Test
	public void verifPriceMobile() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&as-pos=1&as-type=HISTORY");
 List<WebElement>List = d.findElements(By.xpath("//span[contains(text(),'Ratings')]/parent::span/parent::span/parent::div/parent::div/child::div[contains(text(),'Apple')]\r\n"
 		+ ""));
 for (WebElement mobileList : List) {
	String iphoneName =  mobileList.getText();
	 String text = d.findElement(By.xpath("//div[contains(text(),'"+iphoneName+"')]/parent::div/parent::div/descendant::div[8]/child::div[contains(text(),'₹')][1]"))
				.getText();
		
		System.out.println(iphoneName +"Price----"+text );

	
}

	d.quit();	
	}

}
