import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        //driver.findElement(By.id("hrefIncAdt")).;
        //by using for loop
      /*  for (int i =1 ;i <=3;i++)
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
          
        	
       
        }*/
      //by using while loop
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//befor clicking on adults

        int i =1;
        while(i<5) 
        {
        	driver.findElement(By.id("hrefIncAdt")).click();
        	i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());//after clicking 5 times on adult
      //*[@id = 'divpaxinfo']
      //  Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id = 'divpaxinfo']")).getText();

       
		 
	}

}
