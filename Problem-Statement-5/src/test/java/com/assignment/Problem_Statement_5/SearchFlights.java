package com.assignment.Problem_Statement_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchFlights {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com/");
		Thread.sleep(10000);
	}

	@Test
	public void oneWayFlightSearch() throws InterruptedException {

		WebElement flights = driver
				.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[1]/div/a/span[2]"));
		flights.click();
		Thread.sleep(3000);

		WebElement oneWay = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[1]/ul/li[1]"));
		oneWay.click();

		WebElement from = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/label/span"));
		from.click();
		Thread.sleep(3000);

		WebElement fromText = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		fromText.sendKeys("Pune");
		Thread.sleep(3000);

		WebElement fromLocation = driver
				.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
		fromLocation.click();
		Thread.sleep(3000);

		WebElement to = driver
				.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/label/span"));
		to.click();
		Thread.sleep(3000);

		WebElement toText = driver.findElement(
				By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/input"));
		toText.sendKeys("Chennai");
		Thread.sleep(3000);

		WebElement toLocation = driver
				.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]"));
		toLocation.click();
		Thread.sleep(10000);

		WebElement search = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/p/a"));
		search.click();
		Thread.sleep(10000);

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
