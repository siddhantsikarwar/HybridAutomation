package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {

    @Test
    public void verifySuccessfulUserLogin(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToOrangeHRM("Admin","admin123");
        //Successful login takes us to Dashboard Page from Login Page
        DashboardPage dashboardPage=new DashboardPage(driver);
        String expectedUrl ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        String actualUrl= dashboardPage.getDashboardPageUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

}
