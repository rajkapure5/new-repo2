package newproject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetriveDataFromTextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "D:\\Important File\\newchromedriverfile\\chrome-win64\\chrome-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		String s=driver.findElement(By.id("user-name")).getAttribute("value");
	System.out.println(s);
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	}

}
