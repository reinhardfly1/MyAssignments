package assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContacts {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Reinhard");
		driver.findElement(By.id("lastNameField")).sendKeys("Bonnkee");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		/*
		 * WebElement text=driver.findElement(By.id("ext-gen990")); String
		 * t=text.getText(); System.out.println("First Name :"+ t);
		 */
		/*
		 * WebElement code=driver.findElement(By.id("viewContact_firstName_sp")); String
		 * s=code.getText(); System.out.println("FirstName:"+ s);
		 */
		String title=driver.getTitle();
		System.out.println("Browser Name:" +title);
		
		
		/*
		 * String src=driver.getPageSource(); System.out.println("The source " + "is :"+
		 * driver.getPageSource());
		 * 
		 * String url=driver.getCurrentUrl(); System.out.println("The url is:"+
		 * driver.getCurrentUrl());
		 */
		 
		/*
		 * String te=driver.findElement(By.id("ext-gen11")).getAttribute("style");
		 * System.out.println(te);
		 */
		  
		
		
		  
		 
		
		
		
		
		
		
		

	}

}
