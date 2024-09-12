package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {
	public static void main(String args[]) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing"
	 		+ "\\Driver\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
   	System.out.println(driver.getTitle());
    driver.findElement(By.name("email")).sendKeys("kishore2001@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("6382765362");
    driver.findElement(By.xpath("//button[@value='1']")).click();
    }
}
 