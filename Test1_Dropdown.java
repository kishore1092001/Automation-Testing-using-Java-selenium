package org.kis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Dropdown {
public static void main(String[] args) {
	System.setProperty("wedriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_"
			+ "Testing\\Driver3\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	
}
}
