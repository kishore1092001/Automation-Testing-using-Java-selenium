package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenim_Testing\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().sendKeys("love");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().getText();
	}

}
