package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinkTextEle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement webd = driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));//finding web element/attribute
		
			webd.sendKeys("Send");  //writing text/entering input in text box
			webd.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect')]"));//to find text web elements
			String dd = webd.getAttribute("value"); //to fetch value which is entered in text box
			System.out.println(dd);
			String df = webd.getAttribute("placeholder");//to fetch value of attribute
			System.out.println(df);
					
		WebElement web=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		    
		    web.sendKeys("fhfkhg");
		    String dh = web.getAttribute("value");
		    System.out.println(dh);
		    String dl = web.getAttribute("placeholder");
		    System.out.println(dl);
	        driver.findElement(By.xpath("//button[@name='login']")).click();
	
		}

	}


