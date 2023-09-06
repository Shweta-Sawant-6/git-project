package com.assignment.Problem_Statement_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoCheck {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
	}
	
	
  @Test
  public void isLogoPresent() throws InterruptedException {
		WebElement element = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		Assert.assertNotEquals(element, null);
  }
  
  @AfterMethod
  public void teardown() {
	  driver.quit();
  }
}
