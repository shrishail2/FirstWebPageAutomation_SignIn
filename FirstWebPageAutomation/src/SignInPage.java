import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInPage {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//this line is for waiting for the object to show on the page
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
		//Thread.sleep(1000);//this line is for if the page is bufering it will wait 1 sec till to ge the page in stable state to show on the page
		
		System.out.println("hey");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("shrishail");
		//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("shrishail@gmail.com");
		/*{note:: another way of writing XAPATH its by using tagname fromparent to the child //div[2]/form/input[1]}*/
		driver.findElement(By.xpath("//div[1]/form/input[2]")).sendKeys("shrishail@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("100");
		driver.findElement(By.xpath("//form/div/button[2]")).click();
		//System.out.println(driver.findElement(By.xpath("//form/p")).getText());//writing xpath from parent to child Traverse
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //writing Csslocator path from parent to child Traverse
		driver.findElement(By.xpath("//button[@class ='go-to-login-btn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[2]/form/input[1]")).sendKeys("rahul");//parent to child traverse by XPATH
		driver.findElement(By.xpath("//div[2]/form/input[2]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[type*='chec']")).click();//normalize css path 
		driver.findElement(By.xpath("//button[contains(@class,'submit signInBtn')]")).click();
		
		
		System.out.println(driver.findElement(By.xpath("//div/h2")).getText());//parent to child traverse by XPATH
		System.out.println(driver.findElement(By.xpath("//div/h1")).getText());//parent to child traverse by XPATH
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());//parent to child traverse by XPATH
		
		driver.findElement(By.cssSelector("div button")).click();//CSS path parentTraverse method

		
		

		}
		else
		{
			System.out.println("you");
			System.out.println("hee");
				
		}
			
		
		
		
		
	}

}
