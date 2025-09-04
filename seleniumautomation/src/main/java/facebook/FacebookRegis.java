package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookRegis {
	//aceessmodifier returntype methodname();
	
	
	public void facebookRegis() throws InterruptedException {
		
    WebDriverManager.chromedriver().setup();
    
	//ClassName obj=new ClassName()
    
    ChromeDriver driver=new ChromeDriver();
    
    driver.get("https://www.facebook.com/reg/");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.name("firstname")).sendKeys("Gokila");
	
	driver.findElement(By.name("lastname")).sendKeys("Arulraj");
	WebElement daySelectWebEle =driver.findElement(By.id("day"));
	
	Select selDay=new Select(daySelectWebEle);
	
	//selDay.selectByIndex(3);
	//selDay.selectByValue("10");
	selDay.selectByVisibleText("5");
	Thread.sleep(4000);
	driver.findElement(By.name("reg_email__")).sendKeys("gokilakannan@gmail.com");
	Thread.sleep(4000);
	driver.findElement(By.name("websubmit")).click();
	Thread.sleep(4000);
    
    driver.close();
    
	} 

}
