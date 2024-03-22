import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcertificateHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options =new ChromeOptions();
		 options.setAcceptInsecureCerts(true);
		// options.addExtensions("provide path here") this is for adding extensions to the automation browser
		 /*sometimes in real time  if our  websites requires   proxy follow steps below
		  *  Proxy proxy =new Proxy(); and import package of selenium 
		  *  proxy.(here despend upon requirement we can select the proxy)ex::proxy.setHttpProxy("ipaddress:4444");
		 *options.setCapability("Proxy", proxy);
		  * 
		  */
		 
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
	
		System.out.println(driver.getTitle());
	}

}
