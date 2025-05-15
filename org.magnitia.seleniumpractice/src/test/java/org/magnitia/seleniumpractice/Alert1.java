package org.magnitia.seleniumpractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 
driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
Thread.sleep(5000); 

//method-1
Alert Normalalert = driver.switchTo().alert();
Normalalert.accept();

//method-2
 //driver.switchTo().alert().accept();


	}

}
