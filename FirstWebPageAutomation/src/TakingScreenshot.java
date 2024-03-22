import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   WebDriver driver =new ChromeDriver();
   driver.get("https://google.com");
        File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("E:\\New folder (2)\\googlepic2.png"));
        driver.close();
        
        //FileUtils() is a method to copy file from src to our local; machine
      //  C:\\Users\\screenshot.png
	}
	//"E:\\New folder (2)\\screenshot.png"
}
