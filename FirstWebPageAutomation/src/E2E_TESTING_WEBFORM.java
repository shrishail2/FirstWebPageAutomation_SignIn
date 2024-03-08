import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E_TESTING_WEBFORM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String Name ="shrishail";
		String Email ="shre123@gmail.com";
		String password ="H@#sgdh";
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys(Name);//giving name
		driver.findElement(By.cssSelector("input[name ='email']")).sendKeys(Email);//enter email
		driver.findElement(By.cssSelector("input[id ='exampleInputPassword1']")).sendKeys(password);//enter password
		
		driver.findElement(By.xpath("//input[@id ='exampleCheck1']")).click();//click on the Check me out if you Love IceCreams!
		System.out.println(driver.findElement(By.xpath("//input[@id ='exampleCheck1']")).isSelected());// check wether the check box is enabled or not
		
		WebElement SD = driver.findElement(By.id("exampleFormControlSelect1"));//select the gender from the select dropdown
		Select  DropDown =new Select(SD);
		DropDown.selectByIndex(0);
		System.out.println(DropDown.getFirstSelectedOption().getText());//get the text which selected from gender select dropdown
		
		System.out.println(driver.findElement(By.xpath("//input[@id ='inlineRadio1']")).isSelected()+"  check the Employment Status radio button selected or not befor clicking ");//check the Employment Status radio button selected or not befor clicking 
		driver.findElement(By.xpath("//input[@id ='inlineRadio1']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id ='inlineRadio1']")).isSelected()+"  check the Employment Status radio button selected or not after clicking");//check the Employment Status radio button selected or not after clicking
		
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("08/12/1999");// provide the date of birth
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class ='btn btn-success']")).click();// submit the form
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@class ='alert alert-success alert-dismissible']")).getText());//get the alert messaged after submit
	
		


		
	}

}
