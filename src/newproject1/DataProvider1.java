package newproject1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;
	@Test(dataProvider="raj")
	public void data(String a,String b) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "D:\\Important File\\newchromedriverfile\\chrome-win64\\chrome-win64\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.saucedemo.com/");
	driver.findElement(By.id("user-name")).sendKeys(a);
	driver.findElement(By.id("password")).sendKeys(b);
	driver.findElement(By.id("login-button")).click();
		driver.quit();
	}
	@DataProvider(name="raj")
	public Object[][] data1() throws IOException {
		Object[][] object=new Object[2][2];
		object[0][0]="standard_user";
		object[0][1]="secret_sauce";
		object[1][0]="standard_user";
		object[1][1]="raj";
		
		return object;
	}
}
