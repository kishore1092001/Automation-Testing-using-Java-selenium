package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Frame {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_"
			+ "Testing\\Driver3\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.manage().window().maximize();
	driver.switchTo().frame("singleframe");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kishore");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	Thread.sleep(5000);
	driver.switchTo().frame(1);
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");
	driver.switchTo().parentFrame();
	
}
}
