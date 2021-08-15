package testbase;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import excel.ExcelReader;

public class TestBase {
	
	public static WebDriver driver;
	
	public static WebDriver setup() {
		
		//ExcelReader excelReader;

		//excelReader = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\java\\excel\\InputDataForTestCases2.xlsx");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//driver.close();
		return driver;
		
	}
	
}
