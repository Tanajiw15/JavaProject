package selenium.start;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {

	private XSSFSheet sh;
	public ExcelReader1(String fileName, String sheetName) {
		try {
			File f = new File(System.getProperty("user.dir") + "\\"+fileName);

			FileInputStream fis = new FileInputStream(f);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			 sh = wb.getSheet(sheetName);

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ArrayList<String> getKeysList()
	{
		ArrayList<String> keys = new ArrayList<>();
		for (int i = 1; i <=4; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			String ss1 = printCellValueAccordingToCellType(cel);
			keys.add(ss1);

		}
		return keys;
		
	}
	
	public ArrayList<String> getValuesList()
	{
		ArrayList<String> values = new ArrayList<>();
		for (int i = 1; i <=4; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			String ss1 = printCellValueAccordingToCellType(cel);
			values.add(ss1);

		}
		return values;
		
	}
	
	private static String printCellValueAccordingToCellType(XSSFCell cel) {
		CellType celTp = cel.getCellType();
	Object dd = "";
		switch (celTp) {
		case STRING:
			dd = cel.getStringCellValue();
			break;

		case NUMERIC:
			dd = cel.getNumericCellValue();
			break;

		case BOOLEAN:
			dd = cel.getBooleanCellValue();
			break;
		default:
			System.out.println("This is invalid cell type");
			break;
	}
		
		return dd.toString();
		
		
	}

}