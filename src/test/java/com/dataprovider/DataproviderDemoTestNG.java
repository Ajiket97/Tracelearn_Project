package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataproviderDemoTestNG {

	@DataProvider(name = "dataProviderDemo")

	public String[][] dataProviderDemo() throws IOException {
		String base = System.getProperty("user.dir");
		FileInputStream file = new FileInputStream(base + "\\src\\test\\resources\\deta.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet sheet = book.getSheet("Ajit");
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(rows).getLastCellNum();
		System.out.println(rows+" "+ columns);
		String[][] excelDeta = new String[rows][columns];
		for (int i = 1; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columns; j++) {
				XSSFCell cell = row.getCell(j);
				excelDeta[i - 1][j] = cell + " ";

				System.out.print(excelDeta[i - 1][j]);
			}
			System.out.println(" ");
		}
		return excelDeta;

	}
	RemoteWebDriver d;

	@Test(dataProvider = "DataFeatch", dataProviderClass = DataProviderDemo.class)
	private void m1(String name, String Email, String phone, String adress) throws InterruptedException {
		//String exp = "Easy 14 days return & exchange available";

		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		d.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys(name);
		d.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys(Email);
		d.findElement(By.xpath("//input[@id=\"phone\"]")).sendKeys(phone);
		d.findElement(By.xpath("//textarea[@id=\"textarea\"]")).sendKeys(adress);
		d.quit();

	}

}
