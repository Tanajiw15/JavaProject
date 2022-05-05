package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	    System.out.println(rows.size());
	    int no=rows.size();
	    for(int r=1;r<=no;r++) 
	    {
	    	String Company=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td[1]")).getText();
		    String Group=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td[2]")).getText();
		    String PrevClose=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td[3]")).getText();
		    String Current_Price= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td[4]")).getText();
		    String percchange=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+r+"]/td[5]")).getText();
		    
		    System.out.println(Company+"                 "+Group+"     "+PrevClose+"      "+Current_Price+"       "+percchange);;
		    
		  /*  if(Company.contains("Bank"))
		    {
		    	System.out.println(Company+"              "+Group+"     "+PrevClose+"      "+Current_Price+"       "+percchange);
		    }*/
		  }
				 
		}
	}
