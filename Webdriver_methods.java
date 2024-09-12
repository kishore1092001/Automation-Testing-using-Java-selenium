package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_methods {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace"
				+ "\\Selenim_Testing\\Driver_2\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/\r\n");
		String b=driver.getTitle();
		System.out.println(b);
	//	System.out.println(driver.getPageSource());
	//	System.out.println(driver.getCurrentUrl());
	//	driver.manage().window().maximize();
	//	driver.navigate().to("https://www.facebook.com/");
	//	driver.navigate().back();
	//	driver.navigate().forward();
	//	driver.navigate().refresh();
		
	}

}
