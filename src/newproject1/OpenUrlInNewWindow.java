package newproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OpenUrlInNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "D:\\Important File\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.nopcommerce.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://katalon-demo-cura.herokuapp.com");
	}

}
