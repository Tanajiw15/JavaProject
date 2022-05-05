package selenium.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVarification {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.javatpoint.com/java-tutorial");
		String str="Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language.";
		String text = driver.findElement(By.xpath("//p[contains(text(),'Java is a ')]")).getText();
	    if(str.equals(text)) 
	    {
	    System.out.println("Pass");	
	    }
	    else 
	    {
	    	System.out.println("Fail");
	    }
	
    }
}