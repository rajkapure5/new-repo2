package newproject1;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "D:\\Important File\\newchromedriverfile\\chrome-win64\\chrome-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")));
		s.selectByVisibleText("Account Assistant");
	//driver.findElement(By.xpath("//div[@id='app']/div[1]/div[1]/header/div[2]/nav/ul/li[3]")).click();
	//List<WebElement> p=driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']//a"));
		//System.out.println(p.size());
		//for(WebElement r:p) {
		//	String s=r.getText();
			//r.click();
			//System.out.println(s);
			//Thread.sleep(4000);
			//p=driver.findElements(By.xpath("//nav[@aria-label='Topbar Menu']//a"));
		//}
	
			}
		}
		
	


