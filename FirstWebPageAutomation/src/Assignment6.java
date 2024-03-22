import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.cssSelector("input[value='option2']")).click();
		WebElement parameter = driver.findElement(By.cssSelector("div[id ='checkbox-example'] label[for ='benz']"));
		String text = parameter.getText();				
		WebElement value = driver.findElement(By.cssSelector("select[id='dropdown-class-example']"));
		Select option = new Select(value);
		option.selectByVisibleText(text);
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		if (driver.switchTo().alert().getText().contains(text)) {
			System.out.println(text + " present in the alert message");
			driver.switchTo().alert().accept();

		}

	}

}
