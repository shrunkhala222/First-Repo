package org.magnitia.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		//method-1
		Alert Confirmationalert = driver.switchTo().alert();
		Confirmationalert.dismiss();
		
		//method-2
		 driver.switchTo().alert().dismiss();
		 

	}

}
