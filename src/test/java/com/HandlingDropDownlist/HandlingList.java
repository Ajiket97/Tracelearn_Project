package com.HandlingDropDownlist;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandlingList {
	RemoteWebDriver d;

	@Test
	public void selectCountry() {
		d = new ChromeDriver();
		d.manage().window().maximize();

		d.get("https://www.lokmat.com/#google_vignette");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		List<WebElement> web = d.findElements(By.xpath(
				"//div[@class=\"app-strip\"]/following-sibling   :: aside[@class=\"follow-us\"]/child::p[@class=\"follow-icons\"]/child::a[@rel=\"noopener\"]"));
		for (WebElement webElement : web) {
			webElement.click();
		}
		String original = d.getWindowHandle();
		Set<String> handle = d.getWindowHandles();

		for (String handles : handle) {
			if (handles.equals(original)) {

			} else {
				d.switchTo().window(handles);
				String title = d.getTitle();
				System.out.println(title);
				// System.out.println(handles);
				if (title.contains("Latest")) {
					d.switchTo().window(handles);
					System.out.println("hii this is instragaram");
					break;

				}
			}

		}

	}

}
