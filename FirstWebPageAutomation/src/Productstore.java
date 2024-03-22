import java.time.Duration;
//import java.util.Arrays;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productstore {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Simple();
		
	}

	public static void Simple() throws InterruptedException {
		String name = "test1";
		String country = "ind";
		String city = "xyz";
		String card = "abc";
		String month = "jan";
		String year = "1947";

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Thread.sleep(1000);
		driver.findElement(By.xpath("//h4[@class ='card-title']//a[@href='prod.html?idp_=1']")).click();

		driver.findElement(By.cssSelector("a[class ='btn btn-success btn-lg']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// Thread.sleep(1000);
		//driver.findElement(By.cssSelector("a[id='cartur']")).click();
		// System.out.println(driver.findElement(By.xpath("//td[text()='Samsung galaxy
		// s6']")).getText());

		String store1 = driver.findElement(By.xpath("//td[text()='Samsung galaxy s6']")).getText();

		if (store1.contains("Samsung galaxy s6")) {
			driver.findElement(By.cssSelector("button[class ='btn btn-success']")).click();
			driver.findElement(By.cssSelector("input[id ='name']")).sendKeys(name);
			driver.findElement(By.cssSelector("input[id ='country']")).sendKeys(country);
			driver.findElement(By.cssSelector("input[id ='city']")).sendKeys(city);
			driver.findElement(By.cssSelector("input[id ='card']")).sendKeys(card);
			driver.findElement(By.cssSelector("input[id ='month']")).sendKeys(month);
			driver.findElement(By.cssSelector("input[id ='year']")).sendKeys(year);
			driver.findElement(By.xpath("//button[@onclick ='purchaseOrder()']")).click();

		}

	}
}
