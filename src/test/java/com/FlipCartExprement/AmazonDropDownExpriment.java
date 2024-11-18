package com.FlipCartExprement;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AmazonDropDownExpriment {
	@Test
	public void verifyDropDownList() throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=3696474822199221165&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9301536&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		Thread.sleep(3000);
		WebElement weblist = d.findElement(By.xpath("//select[@id=\"searchDropdownBox\"]"));
		Select s = new Select(weblist);
		List<WebElement> al = s.getAllSelectedOptions();
		System.out.println(al);
	}
}
