package com.selenium.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.test.TestReadExcel;

public class ReadExcel {
	public static Object[][] readDataFromExcel(String fileName, int index) throws FileNotFoundException, IOException {
		Object[][] dataobject;
		String path = TestReadExcel.class.getClassLoader().getResource(fileName).getPath();
		Workbook wb = new XSSFWorkbook(new FileInputStream(path));
		Sheet sheet = wb.getSheetAt(index);
		int rownum = sheet.getLastRowNum();//获取行数，实际行数rownum+1
		int cellnum = sheet.getRow(rownum).getLastCellNum();//获取列数
		dataobject = new Object[rownum][cellnum];
		System.out.println(wb.getSheetName(index));
		int i = 0;
		for (Row row : sheet) {
			int j = 0;
			System.out.println("rownum: " + row.getRowNum());
			if (i > 0) {
				for (Cell cell : row) {
					String str=String.valueOf(cell);//转化为字符串
					dataobject[i - 1][j] = str;
					j++;
				}
			}
			i++;
		}
		return dataobject;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Object[][] data = ReadExcel.readDataFromExcel("ecshop.xlsx", 0);
	}
}
