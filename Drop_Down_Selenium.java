package org.kis;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Selenium {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing\\Driver_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement b= driver.findElement(By.id("cars"));
		Select c=new Select(b);
		c.selectByIndex(0);
		c.selectByVisibleText("Saab");
		c.selectByValue("audi");
		List<WebElement> op=c.getOptions();
		for(int i=0;i<op.size();i++) {
			System.out.println(op.get(i).getText());
		}
		for(WebElement p:op) {
			System.out.println(p.getText());
		}
		List<WebElement> d=c.getAllSelectedOptions();
		for(WebElement t:d) {
			System.out.println(t.getText());
		}
		WebElement h =c.getFirstSelectedOption();
		System.out.println(h.getText());
		System.out.println(c.isMultiple());
		c.deselectAll();
	}

}
