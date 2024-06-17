package com.HandlingDropDownlist;

import java.awt.Desktop.Action;
import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

public class CarDekho {
	@Test
	public void carDekhoXpath() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=10804450041708806193&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9300140&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	d.manage().window().maximize();
		
		//d.get("https://www.cardekho.com/");
		d.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		FluentWait<WebDriver> wait = new FluentWait(d);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text() = 'EN']")));

		Actions act = new Actions(d);
		act.moveToElement(d.findElement(By.xpath("//div[text() = 'EN']")));
		act.perform();
//		List<WebElement> al = d.findElements(By.xpath("//div[@class=\"app-content\"]/child::div[@class=\"gsc_container homepage\"]/child::section[@data-track-component=\"The most searched cars\"]/child::div/child::div[@class=\"gsc_ta_scroll  gsc_ta_scroll_move \"]/child::ul/child::li"));
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		List<WebElement> lisst = d.findElements(By.xpath("//div[@id=\"nav-flyout-icp\"]/descendant::a"));
		for (WebElement List : lisst) {
			String texxt = List.getText();
			System.out.println(texxt);
			if (texxt.contains("KN")) {
				List.click();
			}
			
		}
	}

}
