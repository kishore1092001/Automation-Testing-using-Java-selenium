package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenim_Testing\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("Kishore1092001@gamil.com");
	WebElement b=driver.findElement(By.id("pass"));
	b.sendKeys("1234567");
	driver.manage().window().maximize();
	driver.findElement(By.name("login")).click();
}
}
