package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L3draganddropcircles {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/drag-and-drop-circles");
			
			//Element-Red Circle which needs to drag.
			WebElement from = driver.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));
			
			//Element on which need to drop.
			WebElement to = driver.findElement(By.id("target"));
			
			//Using Action class for drag and drop.		
	         Actions act=new Actions(driver);
	         
	       //Dragged and dropped.		
	         act.dragAndDrop(from, to).build().perform();
	         
	         //Element-Green Circle which needs to drag.
				WebElement from1 = driver.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));
				
				//Element on which need to drop.
				WebElement to1 = driver.findElement(By.id("target"));
				
				//Using Action class for drag and drop.		
		         Actions act1 =new Actions(driver);
		         
		       //Dragged and dropped.		
		         act.dragAndDrop(from1, to1).build().perform();
		         
		       //Element-Blue Circle which needs to drag.
					WebElement from2 = driver.findElement(By.xpath("//*[@id=\"source\"]/div[1]"));
					
					//Element on which need to drop.
					WebElement to2 = driver.findElement(By.id("target"));
					
					//Using Action class for drag and drop.		
			         Actions act2 =new Actions(driver);
			         
			       //Dragged and dropped.		
			         act.dragAndDrop(from2, to2).build().perform();
}
}
