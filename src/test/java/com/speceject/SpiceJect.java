package com.speceject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class SpiceJect {
	@Test
	public void ject() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver d = new ChromeDriver(options);
		FluentWait<WebDriver> wait = new FluentWait(d);
		d.get("https://www.cricbuzz.com/cricket-match-squads/87871/ind-vs-eng-semi-final-2-icc-mens-t20-world-cup-2024");
		d.manage().window().maximize();
//		Actions act = new Actions(d);
//		act.moveToElement(d.findElement(By.xpath("//div[@id=\"country-tab-wrap\"]"))).perform();
		// d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> list = d.findElements(
				By.xpath("//div[text()=' Squad ']/parent::div/child::div[3]/descendant::a/child::div[2]/child::div"));
		for (WebElement Element : list) {
			String listt = Element.getText();
			System.out.println(listt);
			if (listt.contains("Virat Kohli")) {
				wait.until(ExpectedConditions.elementToBeClickable(Element));
				Element.click();
				//System.out.println("jiii");
				break;
			}
		}
	}

}
