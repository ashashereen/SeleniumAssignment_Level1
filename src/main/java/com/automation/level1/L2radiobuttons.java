package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L2radiobuttons {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/radio-buttons");
			
			WebElement radio1 = driver.findElement(By.id("black"));
			
	        WebElement radio2 = driver.findElement(By.id("football"));							
	        		
	        //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button black is Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button football is Selected");
	        
	        
}
}