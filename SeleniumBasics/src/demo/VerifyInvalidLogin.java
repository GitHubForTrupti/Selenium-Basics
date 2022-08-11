package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidLogin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("tryfacebook@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("tryfacebook");
		
		driver.findElement(By.name("login")).click();
		
		String actualMessaget = driver.findElement(By.cssSelector("#loginform > div:nth-child(12) > div._9ay7")).getText();
		String ExpectedMessage ="The password you’ve entered is incorrect. Forgot Password?";
		
		if( actualMessaget.equals(ExpectedMessage)) {
			System.out.println("Teas Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
	}

}


