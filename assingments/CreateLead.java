package assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("UCHIHA");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Reinhard");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Bonnkee");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Itachi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Ninjutsu");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Life is Beautiful");
		driver.findElement(By.id("ext-gen142")).sendKeys("reinhardclan@gmail.com");
		driver.findElement(By.className("smallSubmit")).click();


		String title=driver.getTitle();
		//	System.out.println("Page Title :" +driver.getTitle());

		System.out.println(title);















	}

}
