package com.excel.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtil {
	@Test
	public void readExcel() throws IOException {
		String baseDir = System.getProperty("user.dir");
		System.out.println(baseDir);
		FileInputStream fis = new FileInputStream(baseDir + "/src/test/resources/Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Ajit123");
		int rows = sheet.getLastRowNum();
		int cells = sheet.getRow(rows).getLastCellNum();
		Object [] [] excelData = new Object [rows] [cells];
		for (int i = 1; i <= rows; i++) {
		XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cells; j++) {
				XSSFCell cell = row.getCell(j);
				excelData [i-1][j] = cell;
				System.out.print(excelData [i-1][j]);
				
			}
			
		}
				
		

	}
}
