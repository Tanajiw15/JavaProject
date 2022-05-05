package selenium.start;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/bus-tickets");
		WebElement ele = driver.findElement(By.xpath("//input[@id='txtOnwardCalendar']"));
		ele.click();
		String str="28-Apr-2022";
		ele.sendKeys(str);
	    WebElement el = driver.findElement(By.xpath("//h2[contains(text(),' Book Bus Tickets in India ')]"));
		el.click();
		
	/*	//for finding current Date
	    Date date=new Date();
	    SimpleDateFormat formt=new SimpleDateFormat("dd-yyyy");
	    String cdate = formt.format(date);
	    System.out.println(cdate);
	    //or
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String formatted = df.format(new Date());
		System.out.println(formatted);   */

	}

}
