import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraverseConceptInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Sibling and parents Traverse
		//siblings to siblings traverse 
		//child to parent traverse
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//header/div/button[1]/following-sibling::button[1] this xpath is mixture of parent to child +sibling traverse xpath
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
      //topic:47. How to Traverse from child element to parent element with xpath shown below
		//header/div/button[1]/parent::div/parent/header
		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText() ); //child element to parent
		
		

	}

}
