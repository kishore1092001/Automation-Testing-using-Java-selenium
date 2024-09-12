package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Browser_commands {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing\\Driver3\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("TITLE OF THE PAGE:");
		System.out.println(driver.getTitle());
		System.out.println("CURRENT URL:");
		String c=driver.getCurrentUrl();
		System.out.println(c);
	//	System.out.println("PAGE SOURCE:");
	//	System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.myntra.com/");
		driver.navigate().back();
		driver.close();
		
		
	}
	

}
