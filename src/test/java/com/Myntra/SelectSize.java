package com.Myntra;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSize {
	public static void selectSize() throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/shoes?rawQuery=shoes");
		d.findElement(By.xpath("//img[@alt=\"Campus Men Mesh Running Shoes\"]")).click();
		Thread.sleep(6000);
		String originalwindo = d.getWindowHandle();
		Set<String> allWindow = d.getWindowHandles();
		for (String string : allWindow) {
			if (string.contains(originalwindo)) {

			} else {
				d.switchTo().window(string);
				String title = d.getTitle();
				System.out.println(title);
				//Thread.sleep(6000);

				d.findElement(By.xpath("//p[number()=7]")).click();

			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		selectSize();
	}

}
