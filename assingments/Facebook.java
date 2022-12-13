package assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Rein");
		driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Bonnkee");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9876543210");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Itachi");
		
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//span/select[1]"));
		Select day = new Select (date);
		day.selectByIndex(22);
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.xpath("//span/select[2]"));
		Select mon = new Select (Month);
		mon.selectByValue("10");
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//span/select[3]"));
		Select yr= new Select (year);
		yr.selectByVisibleText("1994");
		
		
		
		driver.findElement(By.xpath("//span/span[2]/input")).click();
		

	}

}
