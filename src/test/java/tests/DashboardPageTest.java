package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;

public class DashboardPageTest extends BaseTest {

    @Test
    public void verifyHeaderVisibilityAndText(){
        DashboardPage dashboardPage=new DashboardPage(driver);
        String actualText=dashboardPage.getHeaderText();
        String expectedText="Dashboard";
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void verifyUserDropDownVisibility(){
        DashboardPage dashboardPage=new DashboardPage(driver);
        Assert.assertTrue(dashboardPage.isUserDropDownVisible(),"User DropDown is not visible");
    }
}
