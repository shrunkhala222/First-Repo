package org.magnitia.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes3 {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.manage().window().maximize();
	  
	 //Enhanced for loop to click all Checkboxes
	  List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"css-label_c t_c\"]"));
	  System.out.println(checkboxes.size());
	  
	 
	  
	  
 for ( WebElement CB:checkboxes)
 {
	 CB.click();
	 if(CB.getText().equals("Person With Disability Concession") || CB.getText().equals("Railway Pass Concession")) 
	 {
		 WebElement btn = driver.findElement(By.xpath("//span [@class = 'ui-button-text ui-clickable']"));
		 btn.click(); 
	 }
	 
}
 
 for ( WebElement CB:checkboxes)
 {
	 CB.click();
	 if(CB.getText().equals("Person With Disability Concession") || CB.getText().equals("Railway Pass Concession")) 
	 {
		 WebElement btn = driver.findElement(By.xpath("//span [@class = 'ui-button-text ui-clickable']"));
		 btn.click(); 
	 }
	 
}
 
 

  }

}
