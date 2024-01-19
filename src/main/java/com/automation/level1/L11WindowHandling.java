package com.automation.level1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;

public class L11WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

        // Open new window by clicking the button
         driver.findElement(By.id("windowButton")).click();

         driver.findElement(By.id("windowButton")).click();
         String mainwindow = driver.getWindowHandle();
         Set<String> s1 = driver.getWindowHandles();
         Iterator<String> i1 = s1.iterator();
         
         while (i1.hasNext()) {
             String ChildWindow = i1.next();
                 if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
                 driver.switchTo().window(ChildWindow);
                 WebElement text = driver.findElement(By.id("sampleHeading"));
                 System.out.println("Heading of child window is " + text.getText());
                 driver.close();
                 System.out.println("Child window closed");
             }
         }    
   
         //  Switch back to the main window which is the parent window.
         driver.switchTo().window(mainwindow);
         driver.quit();
         System.out.println("Parent window closed");
     }
 }