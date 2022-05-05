package selenium.start;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {
		
		File f=new File(System.getProperty("user.dir")+"\\Book1.xlsx");	
		FileInputStream fis=new FileInputStream(f);
		
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    int rowno = sh.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowno;i++) 
		{
		 XSSFRow row = sh.getRow(i);
		 XSSFCell cel = row.getCell(0);
		 PrintCelValue(cel);
		}
		System.out.println("-------------------");
		
		for(int i=0;i<rowno;i++) 
		{
		  XSSFRow row = sh.getRow(i);
		  XSSFCell cel = row.getCell(1);
		  PrintCelValue(cel);
		}
	 }
	 public static void  PrintCelValue(XSSFCell cel){
		 
		CellType celtype = cel.getCellType();//get value of cell according to type
		switch(celtype) 
		{
		case STRING:System.out.println(cel.getStringCellValue());break;
		case NUMERIC:System.out.println(cel.getNumericCellValue());break;
		case BOOLEAN:System.out.println(cel.getBooleanCellValue());break;
		}
	  }	
	 
	 }

