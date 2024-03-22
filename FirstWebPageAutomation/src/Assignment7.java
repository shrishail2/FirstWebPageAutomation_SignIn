import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//scenario1: print total number of rows in a given table
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");// window level scrolling
		//SCENARIO1: PRINT TOTAL NUMBER OF ROWS IN A GIVEN TABLE
		List<WebElement> totalRows = driver.findElements(By.cssSelector("table[class='table-display'] tr"));
		System.out.println("Total Number Of Rows From Given Table "+totalRows.size());
		
		
		//SCENARIO2: PRINT TOTAL NUMBER OF COLOUMN IN A GIVEN TABLE
		List<WebElement> totalColoumn = driver.findElements(By.cssSelector("table[class='table-display'] th"));
		System.out.println("Total Number Of Rows From Given Table "+totalColoumn.size());
		
		//SCENARIO3: PRINT SECOND ROW
		System.out.println(totalRows.get(1).getText());
		
         
	}

}
