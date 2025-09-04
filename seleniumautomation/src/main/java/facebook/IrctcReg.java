package facebook;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcReg {
	@Test
	
	public void irutcreg() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.irctc.co.in/nget/train-search");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//button[text()='OK']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'BUSES')]")).click();
	Thread.sleep(5000);
	
	String parentWindowRef =driver.getWindowHandle();
	
	Set <String> allWindows =driver.getWindowHandles();
	
	for(String winow:allWindows) {
		String title=driver.switchTo().window(winow).getTitle();
		
		if(title.equals("IRCTC Bus - Online Bus Ticket Booking | Bus Reservation")) {
			Thread.sleep(3000);
			driver.findElement(By.id("departFrom")).sendKeys("Hyderabad");
			 Thread.sleep(3000);
			driver.close();
		}else if(title.equals("IRCTC Hotels")) {
			//logic
		}
	}
	Thread.sleep(3000);
    driver.switchTo().window(parentWindowRef);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
    Thread.sleep(3000);
	driver.quit();
}

}
