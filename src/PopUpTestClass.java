import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vishw\\Desktop\\Study Material\\SeleniumJar\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.aliexpress.com/?albbt=Google_7_fbrnd&src=google&acnt=347-178-5672&crea=399556437270&aff_platform=aaf&netw=g&albcp=2043897087&mtctp=e&aff_fcid=efa0df2d2fb949669a068029ed1d3cab-1626202979117-06858-UneMJZVf&gclid=EAIaIQobChMI1LqXlt7g8QIVw25vBB23igVzEAAYASAAEgIcFfD_BwE&albag=77948300611&aff_fsk=UneMJZVf&albch=fbrnd&isSmbActive=false&albagn=888888&isSmbAutoCall=false&sk=UneMJZVf&aff_trace_key=efa0df2d2fb949669a068029ed1d3cab-1626202979117-06858-UneMJZVf&trgt=kwd-17288322708&device=c&terminal_id=fd24ec30c51043d8874ae82221807e2b&needSmbHouyi=false");
		driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		
		// Initialize the popups list
		List<WebElement> popupsList =new ArrayList<WebElement>();
		popupsList.add(driver.findElementByXPath("//img[@class='btn-close']"));
		popupsList.add(driver.findElementByXPath("//img[@class='close-btn']"));
		popupsList.add(driver.findElementByXPath("//img[@class='_24EHh']"));
		
		/* for a single pop-up
		  
		 
		List<WebElement> popups = driver.findElementsByXPath("//img[@class='btn-close']");
		
		if(popups.size() >= 1) {
			for(WebElement popup : popups) {
				popup.click();
			}
		}
		
		*/
		
		if(popupsList.size() >= 1) {
			for(WebElement popup:popupsList) {
				popup.click();
			}
		}
		
	}

}
