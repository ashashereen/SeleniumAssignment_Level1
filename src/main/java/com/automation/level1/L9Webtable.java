package com.automation.level1;

import java.util.Scanner;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class L9Webtable {
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();

    // Initialize the WebDriver
    WebDriver driver = new ChromeDriver();
    
    // Maximize the screen
    driver.manage().window().maximize();
    
    // Open the URL
    driver.get("https://cosmocode.io/automation-practice-webtable/");
    //No. of Columns
    java.util.List<WebElement>  col = driver.findElements(By.xpath("//*[@id=\"countries\"]/tbody/tr/td/h3/strong"));
    System.out.println("Total No of columns are : " + col.size());
    int columns_count = col.size();
    
    //No.of rows
    java.util.List<WebElement>  rows = driver.findElements(By.xpath ("//*[@id=\"countries\"]/tbody/tr/td/strong"));
    System.out.println("Total No of rows are : " + rows.size());
    int rows_count = rows.size();
    
    //To get the country name dynamically
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the country : ");
    String country = in.nextLine();
    in.close();
    //list the checkbox
    
    //java.util.List<WebElement> chkboxes=driver.findElements(By.cssSelector("input[type='checkbox']"));
   // int size=chkboxes.size();
    //for (int i=0; i<size; i++) {
    //	chkboxes.get(i).click();
    //}
    
    //Loop will execute till the last cell of that specific row.
    for (int column = 0; column < rows_count; column++) {
        // To retrieve text from that specific cell.
      String celtext = rows.get(column).getText();
       if (country.equals(celtext)){
    	   String count = country;
    	   driver.findElement(By.xpath("//td[text()= 'count']//preceding-sibling::td//input")).click();
        //System.out.println("Countries exist  : " + celtext);
        }
        // System.out.println("Countries are  : " + celtext);

       //driver.close();
	}
	}
}

