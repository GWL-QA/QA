package Percy_TMU;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.percy.selenium.Percy;

public class visual_testing {

public static WebDriver driver = null;

public static void main( String[] args )
{
	
    System.out.println( "Hello World!" );
    Percy pp = new Percy(driver);
    
    ChromeOptions option = new ChromeOptions();
//    option.setHeadless(true);
    
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver(option);
    
    driver.get("https://dev-wev.pantheonsite.io/wev-classes/");
    pp.snapshot("https://dev-wev.pantheonsite.io/wev-classes/", Arrays.asList(375,834, 1366,1600, 1440, 1280));
    
    
    driver.close();
}
}
	
