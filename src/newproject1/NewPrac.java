package newproject1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewPrac {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "D:\\Important File\\newchromedriverfile\\chrome-win64\\chrome-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		List<WebElement> s=driver.findElements(By.xpath("//input[@name='gender'and contains(@value,'ale')]"));
	System.out.println(s.size());
	for(int i=0;i<s.size();i++) {
		String sr=s.get(i).getAttribute("id");
		s.get(i).click();
		if(s.get(0).isSelected()|| s.get(1).isSelected()){
		System.out.println(sr);
		s.get(i).click();
		Thread.sleep(5000);
		
	}
		else {
				System.out.println("element is not selected");
		
}
	
	}
	List<WebElement>link=driver.findElements(By.xpath("//aside[@id='nav_menu-1']//a"));
	System.out.println(link.size());
	for(int i=0;i<link.size();i++) {
		String linkstring=link.get(i).getText();
		if(linkstring.equals("Disclaimer")||linkstring.equals("Terms of Service")) {
		JavascriptExecutor script=(JavascriptExecutor)driver;
		script.executeScript("arguments[0].scrollIntoView", link.get(i));
			Thread.sleep(5000);
		link.get(i).click();
		driver.navigate().back();
		
		}
	}
	}
}