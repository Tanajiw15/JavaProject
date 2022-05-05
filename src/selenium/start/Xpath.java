package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver chDriver=new ChromeDriver();
		
		chDriver.get("https://www.facebook.com/");
		chDriver.manage().window().maximize();
		
        WebElement emailTextbox = chDriver.findElement(By.id("email"));
		
		emailTextbox.sendKeys("KTCTC email id");
		
		String dd = emailTextbox.getAttribute("value");
		System.out.println(dd);
		
		String val = emailTextbox.getAttribute("placeholder");
		
		System.out.println(val);

		
	}

}
