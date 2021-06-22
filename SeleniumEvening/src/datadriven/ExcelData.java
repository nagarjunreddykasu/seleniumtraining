package datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {
	
	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir")+"//src//datadriven//TestData.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		//To get number of sheets available in excel file
		int sheets=workbook.getNumberOfSheets();
		System.out.println("Sheets count: "+sheets);
		
		//To get row count in specified sheet in excel file
		int index=workbook.getSheetIndex("Sheet1");//0
		XSSFSheet sheet=workbook.getSheetAt(index);
		int rowCount=sheet.getLastRowNum()+1;
		System.out.println("Row count: "+rowCount);
		
		//To get the row number of specified test case in sheet
		int rowNum=0;
		for(int i=0;i<rowCount;i++){
			XSSFCell cell=sheet.getRow(i).getCell(0);
			if(cell.getStringCellValue().equals("TC_Login_03")){
				rowNum=i;
				break;
			}
		}
		System.out.println("Row number of test case TC_Login_03: "+(rowNum+1));
		
		//To get column count in the specified sheet
		XSSFRow row=sheet.getRow(0);
		short colCount=row.getLastCellNum();
		System.out.println("Columns count: "+colCount);
		
		
		//To get data in specified column and row number
		int colNum=0;
		for(int i=0;i<row.getLastCellNum();i++){
			if(row.getCell(i).getStringCellValue().equals("UserName")){
				colNum=i;
				break;
			}
		}
		
		row=sheet.getRow(rowNum);
		
		String username=row.getCell(colNum).getStringCellValue();
		System.out.println(username);
		
		//workbook.close();
		
		
		//to get column number of specified column name
		for(int i=0;i<colCount;i++){
			if(sheet.getRow(0).getCell(i).getStringCellValue().equals("Result")){
				colNum=i;
				break;
			}
		}
		
		sheet.getRow(rowNum).createCell(colNum).setCellValue("PASS");
		FileOutputStream fout=new FileOutputStream(path);
		workbook.write(fout);
		fout.close();
		workbook.close();
		
		
	}

}

/*
.xls			.xlsx
HSSFWorkbook	XSSFWorkbook
HSSFSheet		XSSFSheet
HSSFRow			XSSFRow
HSSFCell		XSSFCell



*/