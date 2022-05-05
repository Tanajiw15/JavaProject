package selenium.start;

import java.util.ArrayList;

public class Excelread {

	public static void main(String[] args) {
		
			//String[][] arr= {{"Name","Sanket"},{"add","Pune"}, {"Phonenumber","4567898767"}, {"Indian", "True"}};
	    	ExcelReader1 exHelp = new ExcelReader1("Book1.xlsx", "Oct");
	    	ArrayList<String> keys = exHelp.getKeysList();
	    	ArrayList<String> values = exHelp.getValuesList();
	    	
	    	String [][] arr1 = new String[keys.size()][2];
	    	
	    	for (int i=0;i<keys.size();i++)
	    	{
	    		arr1[i][0] = keys.get(i);
	        	
	        	arr1[i][1] = values.get(i);
	        	
	    	}

		}

	}

	
