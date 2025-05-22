package org.magnitia.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes4 {

	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.irctc.co.in/nget/train-search");
	  driver.manage().window().maximize();
	  
	  List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@class=\"css-label_c t_c\"]"));
	  System.out.println(checkboxes.size());
	
	  //loop to check last three checkboxes
	  for(int i=1;i<checkboxes.size();i++)
	  {
		  checkboxes.get(i).click();
	  }

	}

}
