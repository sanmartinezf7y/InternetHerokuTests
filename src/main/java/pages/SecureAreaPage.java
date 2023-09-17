package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    private WebDriver driver;

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    private By statusAlert = By.cssSelector("#flash");
    private By logoutButton = By.xpath("//i[contains(text(),'Logout')]");

    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
