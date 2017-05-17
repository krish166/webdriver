package com.krish;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\krish\\Downloads\\chromedriver.exe"); 
	   WebDriver driver = new ChromeDriver();
	  
		driver.get("https://www.wikipedia.org");
driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebElement link;
		link = driver.findElement(By.linkText("English"));
		link.click();
		driver.switchTo().frame("UWPIFrame");
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("Software");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
