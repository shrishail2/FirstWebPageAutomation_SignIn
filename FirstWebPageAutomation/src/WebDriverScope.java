import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver =new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
       //1COUNTING THE NUMBER OF LINKS ON THE PAGE
        System.out.println( driver.findElements(By.tagName("a")).size());
        //2COUNTING HE NUMBER OF LNKS ONTHE FOOTER SECTION ONLY       
        /*1.fist select the entire footer sectionglobally by writing path
         * 2 then aiign it to some variabble of type WebElement
         * 3this variabble of type WebElement acts as subset of driver object which is spicfic to only fotter 
         */
       WebElement footerPart= driver.findElement(By.cssSelector("div[id ='gf-BIG']"));        
        System.out.println(footerPart.findElements(By.tagName("a")).size());
        
        //3COUNTING HE NUMBER OF LNKS ONTHE FOOTER SECTION OF THE FIRST COLOUMN ONLY       

        
        System.out.println(footerPart.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul")).getText());
        WebElement  DiscountCoupons =footerPart.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
        System.out.println(DiscountCoupons.findElements(By.tagName("a")).size());
        for(int i=0;i<DiscountCoupons.findElements(By.tagName("a")).size();i++)
        {
        	
        	String clickOperation = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	DiscountCoupons.findElements(By.tagName("a")).get(i).sendKeys(clickOperation);
        	//DiscountCoupons.getText()
        	Thread.sleep(10);
        }
        	Set<String> abc =driver.getWindowHandles();
        	Iterator<String> it=abc.iterator();
        	while(it.hasNext())
        	{
        		driver.switchTo().window(it.next());
            	System.out.println(driver.getTitle());

        	}
        	
        
        
        
        
	}

}
