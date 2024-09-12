package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_command {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\"
				+ "Selenim_Testing\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		driver.navigate().to("https://www.myntra.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
