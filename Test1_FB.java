package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_FB {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenim_Testing\\Driver3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("KISHORE");
		WebElement d=driver.findElement(By.id("pass"));
		d.sendKeys("1234567");
		driver.findElement(By.name("login")).click();
	}
	
}
