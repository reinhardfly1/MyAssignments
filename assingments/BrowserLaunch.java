package assingments;

import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserLaunch {

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
	//	String driverpath=SeleniumManager.getInstance().getDriverPath("chromedriver");
		ChromeDriver driver=new ChromeDriver();
		//System.out.println(driverpath);
		System.out.println(driver);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();










	}


}
