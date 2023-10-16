package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L1draganddropsquares {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/drag-and-drop");
			
			//Element which needs to drag.
			WebElement from = driver.findElement(By.id("column-a"));
			
			//Element on which need to drop.
			WebElement to = driver.findElement(By.id("column-b"));
			
			//Using Action class for drag and drop.		
	         Actions act=new Actions(driver);
	         
	       //Dragged and dropped.		
	         act.dragAndDrop(from, to).build().perform();	
						
				}

}
