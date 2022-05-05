package selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");
		
		WebElement al = driver.findElement(By.xpath("//button[@id='alertButton']"));
		al.click();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		ele.click();
		WebDriverWait wt=new WebDriverWait(driver,10);
		Alert timealt=wt.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert();
		timealt.accept();
		
		WebElement diss = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		diss.click();
		Alert altt=driver.switchTo().alert();
		altt.dismiss();
		
		WebElement inputalt = driver.findElement(By.xpath("//button[@id='promtButton']"));
		inputalt.click();
		Alert altin=driver.switchTo().alert();
		inputalt.sendKeys("ok");
		altin.accept();	
		
    }
	
}