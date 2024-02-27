import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//PARSE THE STRING WITH JAVA METHODS TO GET THE PASSWORD DYNAMICALLY FROM THE PAGE
public class SignInPage2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name =" rahul";
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this line is for waiting for the object to show on the page
		String account_password = getPassword(driver);
		System.out.println(account_password);
		driver.findElement(By.xpath("//button[@class ='go-to-login-btn']")).click();
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//div[2]/form/input[1]")).sendKeys("rahul");//parent to child traverse by XPATH
		driver.findElement(By.xpath("//div[2]/form/input[2]")).sendKeys(account_password);
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
	public static  String getPassword (WebDriver driver) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this line is for waiting for the object to show on the page
		driver.get("https://rahulshettyacademy.com/locatorspractice/");//url
		driver.findElement(By.linkText("Forgot your password?")).click();//click on forgot password
		Thread.sleep(1000);
		driver.findElement(By.xpath("//form/div/button[2]")).click();// click reset login button
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());//get text
		//Please use temporary password 'rahulshettyacademy' to Login.
		String PasswordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = PasswordText.split("'");
		/*passwordArray[0]  =Please use temporary password
		 * passwordArray[1] =rahulshettyacademy' to Login.
		 */
		
		String password = passwordArray[1].split("'")[0];
		return password;

	}

}
