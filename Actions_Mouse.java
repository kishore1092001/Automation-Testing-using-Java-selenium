package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Mouse {
public static void main(String args[]) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
			+ "\\Selenim_Testing\\Driver_2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/buttons");
	Actions a=new Actions(driver);
	WebElement dou=driver.findElement(By.id("doubleClickBtn"));
	a.doubleClick(dou).build().perform();
	WebElement rig=driver.findElement(By.id("rightClickBtn"));
	a.contextClick(rig).build().perform();
	driver.navigate().to("https://www.leafground.com/drag.xhtml");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement drag=driver.findElement(By.xpath("//p[text()='Drag to target']"));
	WebElement drop=driver.findElement(By.xpath("//span[text()='Droppable Target']"));
	a.dragAndDrop(drag, drop).build().perform();
	WebElement move= driver.findElement(By.xpath("//span[text()='Drag me around']"));
	a.clickAndHold(move).build().perform();
	a.moveToElement(move, 400, 0).build().perform();
	
}
}
