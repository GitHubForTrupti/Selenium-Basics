package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver,chrome.driver", "chromedriver.exe"); // initiate chrome browser
		WebDriver driver = new ChromeDriver(); //open chrome web browser
		driver.get("https://www.facebook.com/"); //Navigate to facebook
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook - log in or sign up";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Falied");
		}
		driver.close();
		

	}

}
