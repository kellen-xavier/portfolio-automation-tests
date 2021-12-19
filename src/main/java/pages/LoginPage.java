package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.utils.BasePage;

public class LoginPage extends BasePage {

    private String user;
    private String pass;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    //Inputs Pagina-de-Teste-Login//
    public By userInputBy = By.id("username");
    public By passInputBy = By.id("password");
    public By buttonLogin = By.id("submit");


    // Methods Logar //
    public void setLoginPage(String user, String pass){
        type(user, userInputBy);
        type(pass, passInputBy);
        driver.findElement(buttonLogin).click();
    }
}
