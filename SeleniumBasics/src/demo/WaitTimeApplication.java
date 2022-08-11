package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTimeApplication {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.findElement(By.partialLinkText("Example 1")).click();
		driver.findElement(By.cssSelector("#start > button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		String ActualMessage =driver.findElement(By.cssSelector("#finish > h4")).getText();
		String ExpectedMessage ="Hello World!";
		
		if(ActualMessage.equals(ExpectedMessage)) {
			System.out.println("Test Case passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		Thread.sleep(1000);
		
		driver.close();
		
	}

}
