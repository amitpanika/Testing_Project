package com.selenium.test.TestNG1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataDriverTesting {

	@Test
	public void Data() {
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheeet;
		XSSFRow Row;
		XSSFCell cell;

		// create an object of file class to open file
		File excelFile = new File("C:\\Users\\HP\\OneDrive\\Documents\\DataDriver.xlsx");

		// Create an object of file inputStream to read data from file
		try {
			FileInputStream inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// Excel->workbook->row->cell

			//Create object of XSSFWorkbook to handle xlsx file.

			XSSFFactory inputStream = null;
			ExcelWBook = new XSSFWorkbook(inputStream);

			// To Excess Sheet

			XSSFSheet ExcelWSheet = ExcelWBook.getSheetAt(0);


			// Get Total row count

			int ttlRow = ExcelWSheet.getLastRowNum() + 1;

			// Get Total column count

			int ttCells = ExcelWSheet.getRow(0).getLastCellNum();

			int ttlRows = 0;
			for (int currentRow = 0; currentRow<ttlRows ; currentRow++) {

				int ttlCells = 0;
				for(int currentCell= 0; currentCell<ttlCells; currentCell++)
				{
					System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
					System.out.print("\t");
				}

				System.out.println();
			}

			try {
				ExcelWBook.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
}
	}


}
