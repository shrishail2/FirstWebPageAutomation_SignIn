import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");// window level scrolling

		List<WebElement> value = driver.findElements(By.cssSelector("table[class ='table-display'] td:nth-child(3)"));
		int sum = 0;
		for (int i = 0; i < value.size(); i++) {
			sum = sum + Integer.parseInt(value.get(i).getText());
			System.out.println(Integer.parseInt(value.get(i).getText()));

		}
		System.out.println("total sum is" + sum);

	}

}
