import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
// HANDLING STATIC DROPDOWNS WITH SELECT WEBDRIVER API
public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag::: means static dropdown
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select dropDown =new Select(staticDropDown);
          dropDown.selectByIndex(2);
         dropDown.getFirstSelectedOption().getText();//getFirstSelectedOption
         System.out.println( dropDown.getFirstSelectedOption().getText());
         dropDown.selectByVisibleText("USD");//selectByVisibleText
         System.out.println( dropDown.getFirstSelectedOption().getText());
         dropDown.selectByValue("INR");//selectByValue
         System.out.println( dropDown.getFirstSelectedOption().getText());

         
	}

}
