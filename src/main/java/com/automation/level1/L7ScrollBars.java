package com.automation.level1;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L7ScrollBars {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException, IOException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/scrollbars");
			
			WebElement playground_link = driver.findElement(By.xpath("/html/body/main/div/div/div/div/div"));
            playground_link.click();
         
            Actions act = new Actions(driver);
            act.sendKeys(Keys.PAGE_DOWN).build().perform(); //Page Down
            System.out.println("Scroll down perfomed");
            Thread.sleep(3000);
                                 
           //act.sendKeys(Keys.PAGE_UP).build().perform(); //Page Up
            //System.out.println("Scroll up perfomed");
            //Thread.sleep(3000);
            //act.sendKeys(Keys.ARROW_LEFT).build().perform(); //Left
            //System.out.println("Scroll Left perfomed");
            //Thread.sleep(3000);
                              
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();  //Right
            System.out.println("Scroll Right perfomed");
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();  //Right
            System.out.println("Scroll Right perfomed");
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();  //Right
            System.out.println("Scroll Right perfomed");
            Thread.sleep(3000);
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();  //Right
            System.out.println("Scroll Right perfomed");
            Thread.sleep(3000);
            
            
            
	}
}
