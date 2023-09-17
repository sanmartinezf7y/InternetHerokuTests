package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    private WebDriver driver;

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    private By dropdownMenu = By.id("dropdown");
    public void clickDropdownMenu(){
        driver.findElement(dropdownMenu).click();
    }
    public void selectFromDropdown(String option){
        Select select = new Select(driver.findElement(dropdownMenu));
        select.selectByValue(option);
    }


}
