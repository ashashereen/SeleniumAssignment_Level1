package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L4UploadFile {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/upload");
			
			WebElement uploadElement = driver.findElement(By.id("fileInput"));

	        // enter the file path onto the file-selection input field
	        uploadElement.sendKeys("C:\\Shereen\\Shereen Educ Certificates\\BShereenTheeba.jpeg");

	        // click the "UploadFile" button
	        driver.findElement(By.id("fileSubmit")).click();
	}
}
