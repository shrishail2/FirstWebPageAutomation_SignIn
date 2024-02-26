import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Assertion is used in this locators code 
		String Name =" rahul";
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this line is for waiting for the object to show on the page
		driver.findElement(By.xpath("//div[2]/form/input[1]")).sendKeys("rahul");//parent to child traverse by XPATH
		driver.findElement(By.xpath("//div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type*='chec']")).click();//normalize css path 
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//div[1]/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[1]/h2")).getText(), "Hello" +Name+",");
		
		System.out.println(driver.findElement(By.xpath("//div[1]/h1")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[1]/h1")).getText(), "Welcome to Rahul Shetty Academy");
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		 driver.findElement(By.cssSelector("div button")).click();//CSS path parentTraverse method
		 
	}

}
