package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.cssSelector("#email");
    public void setEmail(){
        driver.findElement(emailField).sendKeys("tau@example.com");
    }
    private By submitButton = By.cssSelector("#form_submit");
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }

}
