package org.kis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Javascript_Sendkeys {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing\\Driver3\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement email=driver.findElement(By.name("email"));
	js.executeScript("arguments[0].value='kishore';", email);
	WebElement pass=driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].value='1234567';",pass);
	WebElement login=driver.findElement(By.name("login"));
	js.executeScript("arguments[0].click();",login);
	js.executeScript("alert('hiii...');");
	js.executeScript("window.location='https://www.amazon.in/';");
	js.executeScript("history.go(1);");
}
}
