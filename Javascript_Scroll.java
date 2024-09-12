package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Scroll {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing"
			+ "\\Driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement help=driver.findElement(By.xpath("//a[text()='Help']"));
	js.executeScript("arguments[0].scrollIntoView();",help);
	Thread.sleep(5000);
	js.executeScript("window.scrollBy(0,-3000);");
	js.executeScript("window.scrollBy(0,3000);");
}
}
