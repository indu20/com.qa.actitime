package com.acti.utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUitls 
{
	 XSSFWorkbook excel;
	
    
      public ExcelUitls(String x1Path)
		
		{
			try
			{
				File file = new File(x1Path);
				FileInputStream fis = new FileInputStream(file);
			     excel = new XSSFWorkbook(fis);

			}
			catch(Exception e)
			{
				System.out.println("excelsheet not found" + e.getMessage());
			}
		}
		
		 public int getRowCount(int SheetNum)
		 {
			  int count = excel.getSheetAt(SheetNum).getLastRowNum()+1;
			  return count;
		     	 
		 }
		 //getting the data from the cell
		 public String getcellData(int SheetNum,int row,int col)
		 {
			String data = excel.getSheetAt(SheetNum).getRow(row).getCell(col).toString();
			return data; 
		 }

	 }



