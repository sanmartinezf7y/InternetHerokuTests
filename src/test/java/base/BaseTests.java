package base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import java.util.List;

public class BaseTests {

    private static WebDriver driver;
    protected static HomePage homePage;


    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public static void quit(){
//        driver.quit();
//    }
}
