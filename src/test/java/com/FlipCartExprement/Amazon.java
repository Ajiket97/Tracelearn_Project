package com.FlipCartExprement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazon() {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=708111563274&hvpos=&hvnetw=g&hvrand=12647510975577595238&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-64107830&hydadcr=14452_2391719&gad_source=1");
		WebElement web = d.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Actions action = new Actions(d);
		action.moveToElement(web).perform();
		d.findElement(By.xpath("//span [text() ='Your Orders']")).click();
	}

}
