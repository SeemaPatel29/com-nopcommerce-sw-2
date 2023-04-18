package browserfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;



public class BaseTest {


    public static WebDriver driver;

    public void openBrowser(String baseurl){
        driver = new ChromeDriver();
        // launch Url
        driver.get(baseurl);
        driver.manage().window().maximize();
        //implicit Window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    public void CloseBrowser(){

        driver.close();
    }



}
