package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L5DownloadFile {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/download");
			//Download the first element
			driver.findElement(By.linkText("1694679385387_monkey-4187960_1280.png")).click();
	}
}
