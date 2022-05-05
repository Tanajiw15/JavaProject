package selenium.start;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdAndCheckb {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		/*WebElement ch=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[2]/label"));
		System.out.println(ch.isDisplayed());
		System.out.println(ch.isEnabled());
		System.out.println(ch.isSelected());
		ch.click();
		System.out.println(ch.isSelected());*/
		
		/*WebElement chh=driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/div[3]/label"));
		System.out.println(chh.isDisplayed());
		System.out.println(chh.isEnabled());
		System.out.println(chh.isSelected());
		chh.click();
		System.out.println(chh.isSelected());*/
		
		WebElement chd=driver.findElement(By.xpath("//*[@id='withOptGroup']"));
		chd.click();
		WebElement chd1=chd.findElement(By.xpath("//div[contains(text(),'Group 2, option 2')]"));
		chd1.click();
		
		WebElement chdd = driver.findElement(By.xpath("//div[@id='selectOne']"));
		chdd.click();
		WebElement chdd1=driver.findElement(By.xpath("//div[contains(text(),'Dr.')]"));
		chdd1.click();
	
	}

}
