/**
 * This is the test used for Jenkins Job demo.
 */
package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * @author Kundana
 *
 */
public class NewTest {

	/**
	 * @param none presently
	 */
	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\"+"geckodriver.exe");
		    WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.gmail.com");
		    driver.quit();
		}

	}


