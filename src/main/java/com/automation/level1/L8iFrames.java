package com.automation.level1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L8iFrames {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Maximize the screen
        driver.manage().window().maximize();
        
        // Open the URL
        driver.get("https://demo.automationtesting.in/Frames.html");
        
        //find the single iframe and store it in webelement
        WebElement Frame1 = driver.findElement(By.id("singleframe"));
        //switch to single iframe
        driver.switchTo().frame(Frame1);
        WebElement input = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
        input.sendKeys("ABCD");
        
	}
}
