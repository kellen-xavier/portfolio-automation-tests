package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BaseTest {

    protected static WebDriver driver;
    protected static String BASE_URL_TEST = "https://the-internet.herokuapp.com/login";
    protected static String BASE_URL_TEST_LOGIN = "https://the-internet.herokuapp.com/login";
    private static Object browser;

    // this method set the web driver
    @BeforeSuite
    @Parameters({"browser", "url"})
    public static WebDriver setUp(String browser, String url) throws Exception {
        if(browser.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("web-driver.chrome.driver", "chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(false);
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            if(url.equalsIgnoreCase("https://the-internet.herokuapp.com/login")){
                driver.get(BASE_URL_TEST);}
            else{driver.get(BASE_URL_TEST_LOGIN);
            }
        } return driver;
    } //This method close the browser after tests
    @AfterSuite
    public void tearDown(){
        driver.quit();
    }

    //This method delete all cookies
    public void cleanCookies() {
        driver.manage().deleteAllCookies();
    }
}