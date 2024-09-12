package org.kis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_Selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenim_Testing\\Driver_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("kishore");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("1123455678");
		WebDriverWait wait =new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(pass));
	}
}
