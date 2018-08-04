package week6.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	public  Object[][] readExcel(String fileName) throws IOException{
		//open a excel from file path
		//XSSFWorkbook wBook = new XSSFWorkbook("./data/login.xlsx"); // hardcode the file name
	    XSSFWorkbook wBook = new XSSFWorkbook("./data/"+fileName+".xlsx"); // pass the file name dynamic
		
		//Go to sheet
		//XSSFSheet sheet = wBook.getSheet("login"); // hard code the shert name
	    XSSFSheet sheet = wBook.getSheetAt(0); // pass sheet name dynamicly
		
	//To find row count
	
	 int rowCount = sheet.getLastRowNum();
	 
	 //find the cell count
	 
	 short columnCount = sheet.getRow(0).getLastCellNum();
		
	 //Read the data
	 
	 Object[][] data = new Object[rowCount][columnCount];
	  for (int i=1; i<=rowCount;i++)
	  {
		  XSSFRow row = sheet.getRow(i);
	  
		  
			for(int j=0; j<columnCount;j++)
			  {
				try {
				  XSSFCell cell = row.getCell(j);
				  //String data = cell.getStringCellValue();
				  data[i-1][j]= cell.getStringCellValue();
				  
				 // System.out.println(data); 
			  }
		 catch (Exception e) {
			// TODO Auto-generated catch block
			 data[i-1][j]= "";
		}		  
	  }
	  
	  wBook.close();
	   }
	return data;
}
}


