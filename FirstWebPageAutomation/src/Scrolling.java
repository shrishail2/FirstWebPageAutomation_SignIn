import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
	
		js.executeScript("window.scrollBy(0,500)");//window level scrolling
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//table level scrolling
		
		List<WebElement> value =driver.findElements(By.cssSelector("div[class ='tableFixHead'] td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < value.size(); i++) {
			sum = sum + Integer.parseInt(value.get(i).getText());
		}
		System.out.println(sum);
        //driver.findElement(By.cssSelector("div[class ='totalAmount']"));
        driver.findElement(By.cssSelector("div[class ='totalAmount']")).getText().split(":")[1].trim();
		System.out.println(Integer.parseInt(driver.findElement(By.cssSelector("div[class ='totalAmount']")).getText().split(":")[1].trim()) );
		int total = Integer.parseInt(driver.findElement(By.cssSelector("div[class ='totalAmount']")).getText().split(":")[1].trim()) ;
		Assert.assertEquals(sum, total);
		
		
		
	}

}
