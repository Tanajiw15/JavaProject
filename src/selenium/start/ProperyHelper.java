package selenium.start;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProperyHelper {

	public static void main(String[] args) throws IOException {
		
		propertyhepl();
	}
		public static void propertyhepl() throws IOException {

		FileInputStream file=new FileInputStream("\\Users\\Tanaji Waghmode\\eclipse-workspace\\JavaProject\\Pfile.properties");
		Properties profile=new Properties();
        profile.load(file);
        
        String url=profile.getProperty("URL");
        String newurl=url;
        String uname=profile.getProperty("Username");
        String pass=profile.getProperty("Password");
        
     //   if(url.equalsIgnoreCase(newurl)) 
        //{
        	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
        	WebDriver driver =new ChromeDriver();
        	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        	driver.get(url);
        	driver.findElement(By.name("email")).sendKeys(uname);
        	driver.findElement(By.name("password")).sendKeys(pass);
        	driver.findElement(By.name("login")).click();
        //}
      }
    }
