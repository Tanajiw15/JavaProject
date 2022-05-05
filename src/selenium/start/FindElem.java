package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElem {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
	ChromeDriver chd =new ChromeDriver();
	
	chd.get("https://ecommtest.ktctc.co.in/login.php");
	
	chd.findElement(By.name("email")).sendKeys("9970107180");
	chd.findElement(By.name("password")).sendKeys("9970107180");
	chd.findElement(By.name("login")).click();

  }

}
