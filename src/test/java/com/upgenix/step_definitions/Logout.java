package com.upgenix.step_definitions;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class Logout {
    LoginPage loginPage=new LoginPage();

    @When("User click on the username")
    public void userClickOnTheUsername() {
        loginPage.usertext.click();
    }

    @And("User click Log out")
    public void userClickLogOut() {
        loginPage.logout.click();
    }

    @When("verify page after logout click back")
    public void verifyPageAfterLogoutClickBack() {
        String firstwindowHandle= Driver.getDriver().getWindowHandle(); //bulundugun ana ekranin stringi
        Set<String> windowHandles = Driver.getDriver().getWindowHandles(); // 2 penceriyi bilgi olarak icine saklar
        for (String windowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(windowHandle);

        }
        Assert.assertTrue(loginPage.back.equals("https://qa.upgenix.net/web/login/"));
    }
}
