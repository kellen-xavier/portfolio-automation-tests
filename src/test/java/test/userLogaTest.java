package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import pages.HomeLogin;
import pages.LoginPage;
import utils.BaseTest;

public class userLogaTest extends BaseTest {

    public HomeLogin homeLogin;
    private LoginPage loginPage;
    @BeforeMethod
    public void initialize(){

        homeLogin = new HomeLogin(driver);

    }

    @Test
    public void setLoginPage() {
        driver.get(BASE_URL_TEST);
        driver.findElement(By.id("username")).click();
        loginPage username = new loginPage(driver);
        driver.findElement(By.id("password")).click();
        loginPage password = new loginPage(driver);
    }
}


