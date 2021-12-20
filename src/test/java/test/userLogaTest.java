package test;

//import org.junit.jupiter.api.Test;

import org.testng.annotations.Test;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class userLogaTest  extends BasePage {

    public HomePage homeLogin;
    private LoginPage loginPage;
    //@BeforeMethod
    //public void initialize(){
      //  HomeLogin = new HomeLogin(driver);
    //}

    @Test
    public void efetuarLogin() {
        LoginPage loginPage = new LoginPage();
        loginPage.setLoginPage("tomsmith", "SuperSecretPassword!");

    }
}


