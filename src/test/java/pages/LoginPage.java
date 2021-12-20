package pages;

import org.openqa.selenium.By;


public class LoginPage extends BasePage {

    private String user;
    private String pass;

    //public LoginPage(WebDriver driver){
      //  super(driver);
    //}

    //Inputs Pagina-de-Teste-Login//
    public By userInputBy = By.id("username");
    public By passInputBy = By.id("password");
    public By buttonLogin = By.xpath("//*[@id=\"login\"]/button");

    public LoginPage() {
        //super(driver);
    }

    // Methods Logar //
    public void setLoginPage(String user, String pass){
        type(user, userInputBy);
        type(pass, passInputBy);
        clickOnElement(buttonLogin);
        //driver.findElement(buttonLogin).click();
    }
}
