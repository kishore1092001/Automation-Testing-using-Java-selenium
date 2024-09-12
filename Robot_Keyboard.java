package org.kis;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot_Keyboard {
public static void main(String args[]) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenim_Testing\\Driver_2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://amazon.in/");
	driver.manage().window().maximize();
	WebElement mob=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	Actions ac=new Actions(driver);
	ac.contextClick(mob).build().perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	driver.close();
	
}
}
