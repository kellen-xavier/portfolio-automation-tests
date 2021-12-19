package test;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class loginPage {


    private loginPage login;

    public loginPage(WebDriver driver) {
        login.loginMethod("tomsmith", "SuperSecretPassword!");
    }

    private void loginMethod(String tomsmith, String s) {
    }
}
