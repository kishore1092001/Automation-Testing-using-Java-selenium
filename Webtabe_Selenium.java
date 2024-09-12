package org.kis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabe_Selenium {
public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-wor"
			+ "kspace\\Selenim_Testing\\Driver_2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	List<WebElement>table=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
	for(int i=0;i<table.size();i++) {
		System.out.println(table.get(i).getText());
	}
	for(WebElement f : table) {
		System.out.println(f.getText());
	}
	List<WebElement>row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
	for(WebElement h:row) {
		System.out.println(h.getText());
	}
	WebElement particular=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[2]/td[2]"));
	System.out.println(particular.getText());
	
}
}
