package facebook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertspractice {
	@Test
	public void alertPractice() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		//Simple Alert 
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("alertButton")).click();
	       
	       Alert alert=driver.switchTo().alert();
	       Thread.sleep(3000);
	       
	       String simpleAlertActualMsg= alert.getText();
	       
	       String simpleAlertExpectedMsg="You clicked a ";
	       
	       if(simpleAlertActualMsg.equals(simpleAlertExpectedMsg)) {
	    	   System.out.println("Both actual and expected simple alert messages are equal");
	       }else {
	    	   System.out.println("Both actual and expected simple alert messages are not equal");
	       }
	       Thread.sleep(3000);
		  alert.accept();
	       //Prompt 
		  
	       driver.findElement(By.id("promtButton")).click();
	       Alert alert1=driver.switchTo().alert();
	       Thread.sleep(3000);
	       
	       String promptAlertActualMsg= alert1.getText();
	       
	       String promptAlertExpectedMsg="You clicked a ";
	       
	       if(promptAlertActualMsg.equals(promptAlertExpectedMsg)) {
	    	   System.out.println("Both actual and expected simple alert messages are equal");
	       }else {
	    	   System.out.println("Both actual and expected simple alert messages are not equal");
	       }
	       Thread.sleep(3000);
	       
           alert1.sendKeys("yes");
       
           alert1.accept();
	       
	       driver.close();		   
		}
}