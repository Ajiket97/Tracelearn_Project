package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
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

}
