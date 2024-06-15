package newproject1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ScreenShot {
public static void main(String args[]) throws InterruptedException, IOException {
	System.setProperty("webdriver.gecko.driver","E:\\selenium project\\geckodriver\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Cfacebook%20%27%7C&placement=&creative=550525804791&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9304071%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI9LG25M2R_QIVV5lmAh3xJg13EAAYASAAEgL5WfD_BwE");
	Thread.sleep(3000);
	driver.findElement(By.linkText("Already have an account?")).click();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7507949702");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Raj2151kapure");
	driver.findElement(By.id("loginbutton")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='x1i10hfl x6umtig x1b1mbwd xaqea5y xav7gou x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r x16tdsg8 x1hl2dhg xggy1nq x87ps6o x1lku1pv x1a2a7pz x6s0dn4 x14yjl9h xudhj91 x18nykt9 xww2gxu x972fbf xcfux6l x1qhh985 xm0m39n x9f619 x78zum5 xl56j7k xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x1vqgdyp x100vrsf x1qhmfi1']")).click();	

	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f,new File("E:\\screenshot.jpg"));

}
}
