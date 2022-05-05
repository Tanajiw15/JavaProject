package selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/upload/");
		
        WebElement upl = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        Actions act=new Actions(driver);
        Thread.sleep(5);
        act.moveToElement(upl).click();
        upl.sendKeys(System.getProperty("user.dir")+"\\Pfile.properties");
        
	}

}
