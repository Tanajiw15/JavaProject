package selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.w3.org/TR/wai-aria-practices-1.1/examples/checkbox/checkbox-1/checkbox-1.html");	
       WebElement web= driver.findElement(By.xpath("//div[@id='ex1']/div/ul/li[1]/div"));
       web.click();
       WebElement web1= driver.findElement(By.xpath("//*[@id='ex1']/div/ul/li[2]/div"));
       web1.click();
       System.out.println(web1.isDisplayed());
       System.out.println(web1.isEnabled());
       System.out.println(web1.isSelected());
       web1.click();
       System.out.println(web1.isSelected());
       WebElement web2= driver.findElement(By.xpath("//div[@id='ex1']/div/ul/li[3]/div"));
       web2.click();
       web2.click();
       WebElement web3= driver.findElement(By.xpath("//div[@id='ex1']/div/ul/li[4]/div"));
       web3.click();
       web3.click();
        
	}

}
