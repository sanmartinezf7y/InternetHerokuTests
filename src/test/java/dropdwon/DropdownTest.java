package dropdwon;

import base.BaseTests;
import org.junit.Test;
import pages.DropdownPage;

public class DropdownTest extends BaseTests {

    @Test
    public void dropdownTest(){
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.clickDropdownMenu();
        dropdownPage.selectFromDropdown("1");

    }
}
