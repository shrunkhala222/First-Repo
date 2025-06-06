package org.magnitia.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox1 {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.irctc.co.in/nget/train-search");
  driver.manage().window().maximize();
  
  //identify all checkboxes by using common xpath and Select all checkboxes
 List<WebElement> cbxs = driver.findElements(By.xpath("//*[@class=\"css-label_c t_c\"]"));
 System.out.println(cbxs.size());
 
 for(WebElement wb:cbxs)
 {
	 if(wb.getText().equals("Flexible With Date") || wb.getText().equals("Train with Available Berth"))
	 {
		 wb.click();
	 } 
 }
 
 //identify all checkboxes by using common xpath and Select all checkboxes

 
 
 
 
  

	}

}
