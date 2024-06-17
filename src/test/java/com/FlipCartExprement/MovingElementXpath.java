package com.FlipCartExprement;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class MovingElementXpath {
	public static void movingElement() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/?gad_source=1&gclid=CjwKCAjwvIWzBhAlEiwAHHWgvYzIQuD8EwZ5XiQyED-EVUhay85-ebKArkzRMv5XrR1TUgzGDqU8yhoCiggQAvD_BwE");
		FluentWait<WebDriver> wait = new FluentWait(d);
		wait.withTimeout(Duration.ofSeconds(120));
		wait.pollingEvery(Duration.ofMillis(100));

		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//div[@class=\"_3bzdSa\"]/child::div[@id=\"product-5\"][2]")));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"_3bzdSa\"]/child::div[@id=\"product-1\"]/descendant::a")));
		Actions act = new Actions(d);
	//	act.moveToElement((WebElement) By.xpath("//div[@class=\"_3bzdSa\"]/child::div[@id=\"product-1\"]/descendant::a")).perform();

		WebElement web = d.findElement(By.xpath("//div[@class=\"_3bzdSa\"]/child::div[@id=\"product-1\"]/descendant::a"));
		act.moveToElement(web).click().perform();
		List<WebElement> list = d
				.findElements(By.xpath("//div[@class=\"_2tczCl\"]/child::div[@class=\"_3bzdSa\"]/child::div"));
		for (WebElement weblist : list) {
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			String text = weblist.getText();

			System.out.println(text);
			System.out.println("hi");
			if (text.contains("product-5")) {
				weblist.click();
			}

		}
		d.quit();
	}

	public static void main(String[] args) {
		movingElement();

	}
}
