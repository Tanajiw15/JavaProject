package selenium.start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		WebElement drop=driver.findElement(By.xpath("//select[@id='first']"));
		Select dp=new Select(drop);
		//By Select Class
	    dp.selectByIndex(3);
	    dp.selectByValue("Google");
	    dp.selectByVisibleText("Yahoo");
	    
	    List<WebElement> option = dp.getOptions();
	    for(WebElement each:option) 
	    {
	    	if(each.getText().equals("Iphone")) 
	    	{
	    	each.click();
	    	}
	    }
	}

}
