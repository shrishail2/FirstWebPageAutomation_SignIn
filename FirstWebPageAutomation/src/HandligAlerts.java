import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandligAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String text = "Shrishail";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// TESTCASE1: INVOKE THE ABOVE URL PROVIDE THE NAME IN THE ALERTS INPUT AND
		// VALIDATE THE TEXT AND CLICK ON OK
		driver.findElement(By.cssSelector("input[placeholder ='Enter Your Name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[value ='Alert']")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText()); // this step is to get the alert message we got
		Thread.sleep(2000);
		driver.switchTo().alert().accept();// this is the step to accept any alerts in the browser

		// testcase2 give the input and click on cancel button in alert
		driver.findElement(By.cssSelector("input[placeholder ='Enter Your Name']")).sendKeys(text);
		driver.findElement(By.cssSelector("input[value ='Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

	}

}
