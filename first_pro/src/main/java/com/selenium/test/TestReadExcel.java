package com.selenium.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestReadExcel {

	public static void main(String[] args) throws IOException {
		String path = TestReadExcel.class.getClassLoader().getResource("ecshop.xlsx").getPath();
		try (Workbook wb = new XSSFWorkbook(new FileInputStream(path))) {
			// for (int i = 0; i < wb.getNumberOfSheets(); i++) {
			Sheet sheet = wb.getSheetAt(0);
			int rownum = sheet.getLastRowNum();
			int cellnum = sheet.getRow(rownum).getLastCellNum();
			System.out.println(rownum);
			System.out.println(wb.getSheetName(0));
			for (Row row : sheet) {
				System.out.println("rownum: " + row.getRowNum());
				for (Cell cell : row) {
					System.out.println(cell);
				}
			}
		}
	}
	// }

}
