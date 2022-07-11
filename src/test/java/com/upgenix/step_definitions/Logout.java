package com.upgenix.step_definitions;

import com.upgenix.pages.Login_Logout_Page;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Set;

public class Logout {
    Login_Logout_Page loginLogoutPage =new Login_Logout_Page();

    @When("User click on the username")
    public void userClickOnTheUsername() {
        loginLogoutPage.usertext.click();
    }

    @And("User click Log out")
    public void userClickLogOut() {
        loginLogoutPage.logout.click();
    }


    @And("User verify logout link available")
    public void userVerifyLogoutLinkAvailable() {
            Assert.assertTrue(loginLogoutPage.logverify.isDisplayed());
        }


    @When("verify page after logout and see login page")
    public void verifyPageAfterLogoutAndSeeLoginPage() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Login"));
    }

    @Then("verify {string} message")
    public void verifyMessage(String arg0) {
        Assert.assertTrue(loginLogoutPage.alert.isDisplayed());
    }

    @When("user click step back icon")
    public void userClickStepBackIcon() {
        Driver.getDriver().navigate().back();

    }
}
