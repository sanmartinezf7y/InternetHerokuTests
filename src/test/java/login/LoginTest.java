package login;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import base.BaseTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest extends BaseTests {
    private WebDriver driver;

    @Test
    public void logInTest(){
    LoginPage loginPage = homePage.clickFormAuthentication();
    loginPage.setUsername("tomsmith");
    loginPage.setPassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"));

    }
}
