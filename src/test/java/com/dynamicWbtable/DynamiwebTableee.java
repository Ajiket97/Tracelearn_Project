package com.dynamicWbtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DynamiwebTableee {
	RemoteWebDriver d;

	@Test
	public void dynamicWebTable() {
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://datatables.net/");
		String text = d.findElement(By.xpath("//div[@id=\"example_info\"]")).getText();
		System.out.println(text);
		int totalpage = Integer.valueOf(text.substring(text.indexOf("f") + 2, text.indexOf("e") - 1));
		System.out.println(totalpage);
		for (int i = 1; i <= 1; i++) {
			WebElement currentPage = d.findElement(By.xpath("//button[@aria-current=\"page\"]"));
			int rows = d.findElements(By.xpath("//table[@id=\"example\"]/tbody/tr")).size();
			int cells = d.findElements(By.xpath("//table[@id=\"example\"]/tbody/tr[1]/td")).size();
			for (int j = 1; j <= rows; j++) {
				for (int j2 = 1; j2 < cells; j2++) {
					
					String deta = d.findElement(By.xpath("//table[@id=\"example\"]/tbody/tr["+j+"]/td["+j2+"]")).getText();
					System.out.println(deta);
				}
			}

		}

	}

}
