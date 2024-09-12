package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspa"
				+ "ce\\Selenim_Testing\\Driver_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("singleframe");
		WebElement a=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		a.sendKeys("java");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys("kk");
		driver.findElement(By.xpath("(//input[@type='text'])")).clear();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//input[@type='text'])")).sendKeys(" I LOVE U");
		System.out.println(driver.findElement(By.tagName("iframe")).getSize());
		Thread.sleep(4000);
		driver.quit();
		
	}

}
