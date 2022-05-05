package selenium.start;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbAccountCreation {

	public static void main(String[] args) {
				
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement fd = driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]"));
		fd.click();
		driver.findElement(By.name("firstname")).sendKeys("Ta");
		driver.findElement(By.name("lastname")).sendKeys("wag");
		driver.findElement(By.name("reg_email__")).sendKeys("9970");
		driver.findElement(By.id("password_step_input")).sendKeys("abcd");
		/*WebElement wd=driver.findElement(By.id("day"));
		Select s1=new Select(wd);
		s1.selectByVisibleText("18");
		WebElement wd1=driver.findElement(By.id("month"));
		Select s2=new Select(wd1);
		s2.selectByVisibleText("May");
		WebElement wd2=driver.findElement(By.id("year"));
		Select s3=new Select(wd2);
		s3.selectByVisibleText("1998");
		WebElement find = driver.findElement(By.name("sex"));
		System.out.println(find.isDisplayed());
		System.out.println(find.isEnabled());
		System.out.println(find.isSelected());
	    find.click();*/
		WebElement wd=driver.findElement(By.id("day"));
		selectoption (wd,"19");
		WebElement wd1=driver.findElement(By.id("month"));
		selectoption (wd1,"Jun");
		WebElement wd2=driver.findElement(By.id("year"));
		selectoption (wd2,"1999");
		WebElement find = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		find.click();
	    }
     public static void selectoption (WebElement ele,String value) 
         {
    	 Select sel=new Select(ele);
    	 List<WebElement> option = sel.getOptions();
    	 for(WebElement each:option) 
    	  {
    		if(each.getText().equals(value)) 
    		{
    		each.click();
    		break;
    		} 
    	 }
    }
}
