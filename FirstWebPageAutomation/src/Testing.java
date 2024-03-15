import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {

		Sample();
		// TODO Auto-generated method stub

	}

	public static void Sample() throws InterruptedException {
		int j = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("li[class ='nav-item active'] a")).click();
		Thread.sleep(2000);
		List<WebElement> store1 = driver.findElements(By.cssSelector("a[class ='hrefch']"));
		String[] hey = { "Nexus 6", "Samsung galaxy s7" };
		for (int i = 0; i < store1.size(); i++) {

			String Converted = store1.get(i).getText();
			List<String> set = Arrays.asList(hey);
			if (set.contains(Converted)) {
				j++;
				driver.findElements(By.cssSelector("h4[class ='card-title'] a")).get(i).click();
				driver.findElement(By.cssSelector("a[class ='btn btn-success btn-lg']")).click();
				Thread.sleep(2000);
				driver.switchTo().alert().accept();
				Thread.sleep(1000);
				driver.navigate().back();
				driver.navigate().back();

				if (j == hey.length) {
					break;
				}

			}

		}

	}

}
