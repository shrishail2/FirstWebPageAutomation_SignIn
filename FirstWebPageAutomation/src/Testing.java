import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		String[] hey = { "Nexus 6", "Samsung galaxy s7" };
		String name = "test1";
		String country = "ind";
		String city = "xyz";
		String card = "abc";
		String month = "jan";
		String year = "1947";

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("li[class ='nav-item active'] a")).click();
		Thread.sleep(2000);
		Sample(driver,hey);
		driver.findElement(By.cssSelector("a[id='cartur']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class ='btn btn-success']")).click();
		driver.findElement(By.cssSelector("input[id ='name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[id ='country']")).sendKeys(country);
		driver.findElement(By.cssSelector("input[id ='city']")).sendKeys(city);
		driver.findElement(By.cssSelector("input[id ='card']")).sendKeys(card);
		driver.findElement(By.cssSelector("input[id ='month']")).sendKeys(month);
		driver.findElement(By.cssSelector("input[id ='year']")).sendKeys(year);
		driver.findElement(By.xpath("//button[@onclick ='purchaseOrder()']")).click();
		
		//driver.findElement(By.cssSelector("button[class ='confirm btn btn-lg btn-primary']")).click();
		
		// TODO Auto-generated method stub

	}  

	public static void Sample(WebDriver driver,String[] hey) throws InterruptedException {
		int j = 0;
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("li[class ='nav-item active'] a")).click();
		Thread.sleep(2000);*/
		List<WebElement> store1 = driver.findElements(By.cssSelector("a[class ='hrefch']"));
		//String[] hey = { "Nexus 6", "Samsung galaxy s7" };
		for (int i = 0; i < store1.size(); i++) {

			String Converted = store1.get(i).getText();
			List<String> set = Arrays.asList(hey);
			if (set.contains(Converted)) {
				j++;
				driver.findElements(By.cssSelector("h4[class ='card-title'] a")).get(i).click();
				driver.findElement(By.cssSelector("a[class ='btn btn-success btn-lg']")).click();
			    Thread.sleep(2000);
				driver.switchTo().alert().accept();				
				driver.navigate().back();
				driver.navigate().back();

				if (j == hey.length) {
					break;
				}

			}

		}

	}

}
