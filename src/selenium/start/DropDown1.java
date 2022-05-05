package selenium.start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		   driver.navigate().forward();
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.navigate().refresh();
		WebElement dr= driver.findElement(By.xpath("//select[@id='animals']"));
        Select drp=new Select(dr);
       /* drp.selectByIndex(1);
        drp.selectByValue("avatar");
        drp.deselectByVisibleText("Baby Cat");*/
        List<WebElement> option = drp.getOptions();
        
        for(WebElement each:option) 
        {
        	if(each.getText().equals("Baby Cat"))
        	{
        		each.click();
        	}
        }
	}

}
