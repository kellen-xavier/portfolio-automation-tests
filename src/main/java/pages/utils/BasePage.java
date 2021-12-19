package pages.utils;

//import javafx.scene.web.WebEngine;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public WebDriverWait waitError;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 500);
        this.waitError = new WebDriverWait(driver,500);
    }

    protected void visit(String url){
        driver.get(url);
    }

    protected WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    protected List<WebElement> findElements(By locator){
        return driver.findElements(locator);
    }

    protected void type(String inputText,By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    protected void clickOnElement(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    protected WebElement waitVisibilityOf(By locator) {
        return wait.until(visibilityOfElementLocated(locator));
    }

    protected WebElement elementBeClickeable (By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected WebElement webElementisClieckeable ( WebElement locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    protected boolean waitInvisibilityOf(By locator) {
        try {
            wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
            return true;
        }
        catch(TimeoutException e) {
            return false;
        }
    }

    protected boolean isElementVisible(By locator) {
        try {
            waitVisibilityOf(locator);
            return true;
        }
        catch (TimeoutException e) {
            return false;
        }
    }

    protected boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    protected boolean isTextInElementLocated (By elementLoc, String message){
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(elementLoc, message));
            return true;
        }
        catch (TimeoutException e){
            return false;
        }
    }

    protected void scrolldown(By locator){
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

}
