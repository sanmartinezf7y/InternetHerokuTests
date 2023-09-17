package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class HoversPage {
    private WebDriver driver;
    public HoversPage(WebDriver driver) {
        this.driver = driver;
    }

    private By allUsers = By.className("figure");
    private By allUserNames = By.className("figcaption");

    public FigureCaption hoverByIndex(int index){
        Actions actions = new Actions(driver);
        List<WebElement> figures = driver.findElements(allUsers);
        WebElement item = figures.get(index);
        actions.moveToElement(item).perform();
        return new FigureCaption(driver.findElement(allUserNames));
    }

//   public String hoveredName(int index){
//        List<WebElement> names = driver.findElements(allUserNames);
//        WebElement name = names.get(index);
//        return name.getText();
//   }

    public class FigureCaption{
        private WebElement caption;
        private By header = By.tagName("h5");
        private By link = By.tagName("a");

        public FigureCaption(WebElement caption) {
            this.caption = caption;
        }

        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }
        public String getUsername(){
            return caption.findElement(header).getText();
        }
    }
}
