package com.dataprovider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	
	@DataProvider(name = "DataFeatch")
	public String[][] DataFeatch() throws IOException {
		String baseDir = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(baseDir + "/src/test/resources/deta.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workBook.getSheet("Ajit");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(row).getLastCellNum();
		String[][] data = new String[row][col];
		for (int i = 1; i <= row; i++) {
			XSSFRow r = sheet.getRow(i);
			for (int j = 0; j < col; j++) {
				XSSFCell c = r.getCell(j);
				data[i - 1][j] = c + "";
				System.out.println(data[i - 1][j]);
			}
		}
		workBook.close();
		return data;

	}

}
