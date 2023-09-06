package problem_statement_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogoCheck {

	public static void main(String args[]) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shweta\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		if(element != null) {
			System.out.println("Logo is Present...");
		}else {
			System.out.println("Logo is Not Present...");
		}
		driver.quit();
	}
}
