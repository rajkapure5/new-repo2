package newproject1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9304071%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9LG25M2R_QIVV5lmAh3xJg13EAAYASAAEgL5WfD_BwE");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Already have an account?")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7507949702");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Raj2151kapure");
		driver.findElement(By.id("loginbutton")).click();
		List<WebElement> web= driver.findElements(By.tagName("img"));
		System.out.println(web.size());
		for(WebElement ele:web) {
			 String s=ele.getAttribute("src");
			 System.out.println(s);
			 if(s==null||s.isEmpty()) {
				 System.out.println("url is empaty");
				 continue;
			 }
			try {
				HttpURLConnection huc=(HttpURLConnection)(new URL(s).openConnection());
			    huc.connect();
				if(huc.getResponseCode()!=200) {
						System.out.println("broken image:"+s);
						
				}
						else {
							System.out.println("fine image:"+s);
							
						}
						
			} catch (Exception e) {
				
			
			}

		}

	}

}
