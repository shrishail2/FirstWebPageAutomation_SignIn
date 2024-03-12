import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice_E2E_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
           WebDriver driver =new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
           driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
          // Thread.sleep(1000);
           driver.findElement(By.cssSelector("input[id='autosuggest']")).sendKeys("IND");//autosuggestive dropbox
           Thread.sleep(3000);
           List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
           for(WebElement autodropdown:options)
           {
        	   if(autodropdown.getText().equalsIgnoreCase("India"))
        	   {
        		   autodropdown.click();
        		   break;
        		   
        	   }
           }
   		
           driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //departure		
   		driver.findElement(By.xpath("//a[@value ='BLR']")).click();//select bangalore
   		Thread.sleep(1000);
   		driver.findElement(By.xpath("//div[@id ='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();//select chaennai
   		driver.findElement(By.cssSelector("a[class ='ui-state-default ui-state-highlight ui-state-hover']")).click();//selec current date as departdate
         driver.findElement(By.xpath("//div[@id='flightSearchContainer']//div[@id ='divpaxinfo']")).click();  //click on passenger
         for(int i =1; i<4;i++)
         {
        	 driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();//clcick on the adult passenger till loop ends
         }
           driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();//close option done
           WebElement Hey =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")); //because it is a static dropdown using select class create a object and select thge required currency 
          Select Currency =new Select(Hey);
          Currency.selectByIndex(2);// //option[@value ='INR']
          driver.findElement(By.xpath("//input[@name ='ctl00$mainContent$btn_FindFlights']")).click();//click on search option
          
          
	}

}

/*import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;



public class Practice_E2E_Test {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub



//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

driver.findElement(By.id("autosuggest")).sendKeys("ind");

Thread.sleep(3000);

List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

for(WebElement option :options)

{

if(option.getText().equalsIgnoreCase("India"))

{

option.click();

break;

}

}

}



}


*/