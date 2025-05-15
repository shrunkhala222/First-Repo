package org.magnitia.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//Explicit wait Declaration
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
         driver.manage().window().maximize();

WebElement Normalalert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']")); 
Normalalert.click();

//utilization of explicit wait (Apply required condition here)

     wait.until(ExpectedConditions.alertIsPresent());
     driver.switchTo().alert().accept();
     
     String Text = driver.findElement(By.xpath("p[text()='You successfully clicked an alert']")).getText();
     if (Text.equals("You successfully clicked an alert"))
    		 {
    	      System.out.println("Test is pass");
    		 }
     else
     {
    	 System.out.println("Test is fail");
    	 
     }


	}

}
