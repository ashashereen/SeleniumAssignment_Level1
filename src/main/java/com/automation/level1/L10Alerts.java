package com.automation.level1;

import java.awt.AWTException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L10Alerts {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://demo.automationtesting.in/Alerts.html");
			
			//Choose Alert with OK button
			driver.findElement(By.xpath("//a[@href='#OKTab']")).click();
			System.out.println("selected the Alert with OK button");
			
			driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
			System.out.println("click the button to display an alert box:");
			Alert alert = driver.switchTo().alert();
			Thread.sleep(1000);
			alert.accept();
			
			//Choose Alert with OK & Cancel button
			driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
			System.out.println("selected the Alert with OK & Cancel button");
			
			driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
			System.out.println("click the button to display an alert box:");
			
			Alert alert1 = driver.switchTo().alert();
			//Choose OK option
			Thread.sleep(1000);
			alert1.accept();
			
			//Choose Alert with OK & Cancel button
			driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
			System.out.println("selected the Alert with OK & Cancel button");
			
			driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
			System.out.println("click the button to display an alert box:");
			
			Alert alert2 = driver.switchTo().alert();
			//Choose Cancel option
			Thread.sleep(1000);
			alert2.dismiss();
			
			//Choose Alert with Textbox
			driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
			System.out.println("selected the Alert with Textbox button");
			
			driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			System.out.println("click the button to display an alert box:");
			
			Alert alert3 = driver.switchTo().alert();
			alert3.sendKeys("Welcome Automation Testing Learner");
			//Choose OK option
			Thread.sleep(1000);
			alert3.accept();
			
			//Choose Alert with OK & Cancel button
			driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
			System.out.println("selected the Alert with Textbox button");
			
			driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			System.out.println("click the button to display an alert box:");
			
			Alert alert4 = driver.switchTo().alert();
			alert4.sendKeys("Welcome Automation Testing Learner");
			//Choose Cancel option
			Thread.sleep(1000);
			alert4.dismiss();
			
	}

}
