import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions option =new Actions(driver);
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement move = driver.findElement(By.cssSelector("a[id ='nav-link-accountList']"));
		

		option.moveToElement(driver.findElement(By.cssSelector("input[id ='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		option.moveToElement(move).build().perform();//moves to specific element
		option.moveToElement(move).contextClick().build().perform();//perform right click operation
		
        
		
	}

}
