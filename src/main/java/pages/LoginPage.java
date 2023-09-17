package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.xpath("//input[@id='username']");
    private By passwordlField = By.xpath("//input[@id='password']");
    private By loginBoutton = By.xpath("//i[contains(text(),'Login')]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordlField).sendKeys(password);
    }



    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginBoutton).click();
        return new SecureAreaPage(driver);
    }


}
