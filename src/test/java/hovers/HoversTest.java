package hovers;

import base.BaseTests;
import org.junit.Test;
import pages.HoversPage;

import static org.junit.jupiter.api.Assertions.*;



public class HoversTest extends BaseTests {

    @Test
    public void hoversTest(){
        int index = 0;
        HoversPage hoversPage = homePage.clickHoversLink();
        HoversPage.FigureCaption figureCaption = hoversPage.hoverByIndex(index);
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption is not properly displayed");
        assertEquals(figureCaption.getUsername(), "name: user1");

    }
}
