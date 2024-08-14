package com.dynamicWbtable;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class HandleWebTable {
	RemoteWebDriver d;

	@Test
	public void handlingDynamicWebTable() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://datatables.net/");
		String text = d.findElement(By.xpath("//div[@id=\"example_info\"]")).getText();
		System.out.println(text);
		int totalNumPages = Integer.valueOf(text.substring(text.indexOf("f") + 2, text.indexOf("e") - 1));
		for (int page = 1;page <=1; page++) {
			WebElement activePage = d.findElement(By.xpath("//button[@aria-current=\"page\"]"));
			int rows = d.findElements(By.xpath("//table[@id=\"example\"]/tbody/tr")).size();
			int cells = d.findElements(By.xpath("//table[@id=\"example\"]/tbody/tr[1]/td")).size();

			for (int row = 1; row <= rows; row++) {
                for(int cell=1;cell<cells;cell++) {
                	String txt = d.findElement(By.xpath("//table[@id=\"example\"]/tbody/tr["+row+"]/td["+cell+"]")).getText();
                	System.out.println(txt);
                }
			}
		

		}

	}
}
