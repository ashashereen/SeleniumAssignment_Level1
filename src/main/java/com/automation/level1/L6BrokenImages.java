package com.automation.level1;

import java.awt.AWTException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L6BrokenImages {
static WebDriver driver;
	
	public static void main(String[] args)throws InterruptedException,AWTException, IOException {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			//Launch the website
			driver.get("https://practice.expandtesting.com/broken-images");
			
			java.util.List<WebElement> image_list = driver.findElements(By.tagName("img"));
			System.out.println("The page under test has " + image_list.size() + " images");
			
			for (WebElement image :image_list) {
				String imagesrc = image.getAttribute("src");
				URL url = new URL(imagesrc);
				URLConnection urlconnection	= url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlconnection;
				httpURLConnection.setConnectTimeout(5000);
				httpURLConnection.connect();
			if (httpURLConnection.getResponseCode()==200)
				System.out.println(imagesrc +" >> " + httpURLConnection.getResponseCode()+" >> OK ");
				else
					System.err.println(imagesrc +" >> " + httpURLConnection.getResponseCode()+" >> Broken Image");
				
				httpURLConnection.disconnect();
				
			}
			}
	}		
	
