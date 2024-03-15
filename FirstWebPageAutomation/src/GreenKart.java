import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int j = 0;
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] vegitablesNeeded = { "Cucumber", "Cauliflower", "Brocolli" };
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String newName = name[0].trim();
			List vegitablesNeededAre = Arrays.asList(vegitablesNeeded);
			if (vegitablesNeededAre.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				Thread.sleep(1000);
				if (j ==vegitablesNeeded.length) {
					break;
				}

			}

		}
		driver.findElement(By.xpath("//a[@class ='cart-icon']")).click();
		driver.findElement(By.xpath("//div[@class ='cart-preview active']/div[2]/button")).click();

	}

}
