package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateP {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.toponwardticket.com/?gclid=CjwKCAjw9qiTBhBbEiwAp-GE0V_Hxlrk5ArutNnNIECXQAHTM9j9_9-kOP3RWpXuiByXZuwyOXadARoCySMQAvD_BwE#booknow");
		
		/*Actions act=new Actions(driver);
		WebElement buttons = driver.findElement(By.xpath("//button[@id='submit']"));
		act.moveToElement(buttons);*/
		WebElement ele = driver.findElement(By.xpath("//input[@name='date-departure']"));
		ele.click();
		WebElement e1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("Apr");
		WebElement e2 = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(e2);
		s2.selectByVisibleText("2022");
		String date="30";
		List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement each:dates) 
		{
			String dt = each.getText();
		
			if(dt.equals(date)) 
			{
			each.click();
			break;
			}
		}
	
	    
	}
}

