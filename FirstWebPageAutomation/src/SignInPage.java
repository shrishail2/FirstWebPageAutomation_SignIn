import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("shrishailHiremath");
		driver.findElement(By.name("inputPassword")).sendKeys("Itachi@1234");
		//driver.findElement(By.id("chkboxOne")).click();
		//driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		String d = driver.findElement(By.cssSelector("p.error")).getText();		
		 //System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		System.out.println(d);
		
		 //String a ="* Incorrect username or password";
		if( d.contentEquals("* Incorrect username or password"))
		{
		driver.findElement(By.linkText("Forgot your password?")).click();
		System.out.println("hey");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("shrishail");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("shrishail@gmail.com");
		/*{note:: another way of writing XAPATH its by using tagname fromparent to the child //div[2]/form/input[1]}*/
		driver.findElement(By.xpath("//div[1]/form/input[2]")).sendKeys("shrishail@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("100");
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());//writing xpath from parent to child Traverse
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //writing Csslocator path from parent to child Traverse
		

		//form/div/button[2]
		

		}
		else
		{
			System.out.println("you");
			System.out.println("hee");
				
		}
			
		
		
		
		
	}

}
