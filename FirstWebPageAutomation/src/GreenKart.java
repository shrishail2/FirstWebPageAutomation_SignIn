import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String[] vegitablesNeeded = { "Cucumber", "Cauliflower", "Brocolli" };
		WebDriver driver = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait 
		
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit waitr
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Itemsadded(driver,vegitablesNeeded);
		
		/*List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		String[] vegitablesNeeded = { "Cucumber", "Cauliflower", "Brocolli" };
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String newName = name[0].trim();
			List vegitablesNeededAre = Arrays.asList(vegitablesNeeded);
			if (vegitablesNeededAre.contains(newName)) {
				j++;
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				Thread.sleep(1000);
				if (j == vegitablesNeeded.length) {
					break;
				}

			}

		}*/
		driver.findElement(By.xpath("//a[@class ='cart-icon']/img")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class ='cart-preview active']/div[2]/button")));
		driver.findElement(By.xpath("//div[@class ='cart-preview active']/div[2]/button")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class ='promoCode']")));
		driver.findElement(By.cssSelector("input[class ='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		//driver.findElement(By.cssSelector("span[class ='promoInfo']")).getText();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class ='promoInfo']")));
		
		System.out.println(driver.findElement(By.cssSelector("span[class ='promoInfo']")).getText());

	}
public static void Itemsadded(WebDriver driver ,String[] vegitablesNeeded) throws InterruptedException
{
	int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for (int i = 0; i < products.size(); i++) {
		String[] name = products.get(i).getText().split("-");
		String newName = name[0].trim();
		List vegitablesNeededAre = Arrays.asList(vegitablesNeeded);
		if (vegitablesNeededAre.contains(newName)) {
			j++;
			driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
			//Thread.sleep(1000);
			
			if (j == vegitablesNeeded.length) {
				break;
			}

		}

	}
}

}
