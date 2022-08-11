package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame(driver.findElement(By.id("frame1")));
		//driver.switchTo().frame(1);
		driver.close();

	}

}
