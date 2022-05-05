package selenium.start;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Tanaji Waghmode\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/s?i=electronics&bbn=1389401031&rh=n%3A1389401031%2Cp_n_is_private_label%3A16184648031%2Cp_36%3A50000-100000&dc&qid=1651586504&rnid=1318502031&ref=sr_nr_p_36_2");
        WebElement low = driver.findElement(By.id("low-price"));
        low.clear();
        low.sendKeys("500");
        WebElement high = driver.findElement(By.id("high-price"));
        high.clear();
        high.sendKeys("1000");
        driver.findElement(By.className("a-button-input")).click();
        Actions act=new Actions(driver);
        WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        act.moveToElement(price).build().perform();
        String p = price.getText();
        WebElement p1 = driver.findElement(By.xpath("//span[@class='a-price-whole' and contains(text(),'581')]"));
        act.moveToElement(p1).build().perform();
        System.out.println(p1.getText());
        System.out.println(p);
	}
}