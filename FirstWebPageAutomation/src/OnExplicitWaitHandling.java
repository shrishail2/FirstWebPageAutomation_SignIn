import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnExplicitWaitHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String[] mobilesneeded = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.impl
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		/*
		 * String[] Statement=
		 * driver.findElement(By.cssSelector("p[class ='text-center text-white']")).
		 * getText().split("and"); String[] username =Statement[0].trim().split("is");
		 * System.out.println(username[1]); String[] value
		 * =Statement[1].trim().split("is"); String[] password = value[1].split(")");
		 * System.out.println(password[0]);
		 */
		String username = driver.findElement(By.xpath("//i[text()='rahulshettyacademy']")).getText();
		String password = driver.findElement(By.xpath("//i[text()='learning']")).getText();
		driver.findElement(By.cssSelector("input#username")).sendKeys(username);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);

		driver.findElement(By.cssSelector("input[value = 'user']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[id ='okayBtn']")));
		driver.findElement(By.cssSelector("button[id ='okayBtn']")).click();
		WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select hey = new Select(dropdown);
		hey.selectByIndex(1);
		driver.findElement(By.cssSelector("input[type ='checkbox']")).click();
		driver.findElement(By.cssSelector("input[name='signin']")).click();

		AddingToCarts(driver, mobilesneeded, w);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector("div[class ='checkbox checkbox-primary'] input"))).click()
				.perform();
		driver.findElement(By.cssSelector("input[value ='Purchase']")).click();

		System.out.println(
				driver.findElement(By.cssSelector("div[class ='alert alert-success alert-dismissible']")).getText());

	}

	public static void AddingToCarts(WebDriver driver, String[] mobilesneeded, WebDriverWait w) {
		int j = 0;
		List<WebElement> cart = driver.findElements(By.cssSelector("app-card-list[class='row'] h4 a"));
		for (int i = 0; i < cart.size(); i++) {

			String Converted = cart.get(i).getText();
			System.out.println(cart.get(i).getText());
			List<String> neededList = Arrays.asList(mobilesneeded);
			if (neededList.contains(Converted)) {
				j++;

				driver.findElements(By.cssSelector("button[class ='btn btn-info']")).get(i).click();
				if (j == mobilesneeded.length) {
					break;

				}

			}
		}

		driver.findElement(By.cssSelector("a[class ='nav-link btn btn-primary']")).click();
		driver.findElement(By.cssSelector("button[class ='btn btn-success']")).click();

		driver.findElement(By.cssSelector("input[id ='country']")).sendKeys("ind");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class ='suggestions'] li a")));

		List<WebElement> currentItem = driver.findElements(By.cssSelector("div[class ='suggestions'] li a"));
		for (int k = 0; k < currentItem.size(); k++) {
			if (currentItem.get(k).getText().equalsIgnoreCase("india")) {
				currentItem.get(k).click();

				break;
			}
		}
	}
}

//ROUGHWORK//
/*List<WebElement> cart = driver.findElements(By.cssSelector("app-card-list[class='row'] h4 a"));
for (int i = 0; i < cart.size(); i++) {

	String Converted = cart.get(i).getText();
	System.out.println(cart.get(i).getText());
	List<String> neededList = Arrays.asList(mobilesneeded);
	if (neededList.contains(Converted)) {
		j++;

		driver.findElements(By.cssSelector("button[class ='btn btn-info']")).get(i).click();
		if (j == mobilesneeded.length) {
			break;

		}

	}
}

driver.findElement(By.cssSelector("a[class ='nav-link btn btn-primary']")).click();
driver.findElement(By.cssSelector("button[class ='btn btn-success']")).click();

driver.findElement(By.cssSelector("input[id ='country']")).sendKeys("ind");
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class ='suggestions'] li a")));

List<WebElement> currentItem = driver.findElements(By.cssSelector("div[class ='suggestions'] li a"));
for (int k = 0; k < currentItem.size(); k++) {
	if (currentItem.get(k).getText().equalsIgnoreCase("india")) {
		currentItem.get(k).click();

		break;
	}
}*/
