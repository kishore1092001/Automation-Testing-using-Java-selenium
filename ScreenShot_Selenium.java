
package org.kis;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class ScreenShot_Selenium {
public static void main(String argsp[]) throws IOException{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\KISHORE\\eclipse-workspace\\S"
			+ "elenim_Testing\\Driver_2\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	TakesScreenshot screen=(TakesScreenshot)driver;
	File b=screen.getScreenshotAs(OutputType.FILE);
	File c=new File("C:\\Users\\KISHORE\\eclipse-workspace\\Selenim_Testing\\ScreenShot\\face.png");
	FileHandler.copy(b, c);	
}
}
