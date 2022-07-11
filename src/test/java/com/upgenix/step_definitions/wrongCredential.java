package com.upgenix.step_definitions;

import com.upgenix.pages.Login_Logout_Page;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class wrongCredential {
    Login_Logout_Page loginLogoutPage =new Login_Logout_Page();



    @And("user click login button")
    public void userClickLoginButton() {
        loginLogoutPage.loginBtn.click();
    }
    @Then("User sees Wrong login, password text")
    public void user_sees_wrong_login_password_text() {
        Assert.assertTrue(loginLogoutPage.wrongText.getText().equals("Wrong login/password"));

    }





    @When("username empty")
    public void username_empty() {
        loginLogoutPage.username.sendKeys("");

    }
    @Then("User sees please fill out this field text")
    public void user_sees_please_fill_out_this_field_text() {
        Assert.assertTrue(!(loginLogoutPage.hidden.getText().equals("Please fill out this field.")));


    }

    @When("password empty")
    public void password_empty() {
        loginLogoutPage.password.sendKeys("");

    }


    @Given("write any text username")
    public void writeAnyTextUsername() {
        loginLogoutPage.username.sendKeys("qwe");
    }

    @When("click reset password button")
    public void clickResetPasswordButton() {
        loginLogoutPage.resetBtn.click();
    }

    @Then("User sees reset password page")
    public void userSeesResetPasswordPage() {
        Assert.assertEquals("Reset password | Best solution for startups" , Driver.getDriver().getTitle());
    }
    @And("write any text password")
    public void writeAnyTextPassword() {
        loginLogoutPage.password.sendKeys("abs");
    }
    @Then("User sees bullet sign in password line when text")
    public void userSeesBulletSignInPasswordLineWhenText() {
        Assert.assertTrue(loginLogoutPage.password.getAttribute("type").equals("password"));
    }


    @Then("user send key enter not click")
    public void userSendKeyEnterNotClick() {
        loginLogoutPage.loginBtn.sendKeys(Keys.ENTER);
    }

    @When("User gives email in the {string} input box")
    public void userGivesEmailInTheInputBox(String arg0) {
        loginLogoutPage.username.sendKeys(arg0);

    }

    @And("User gives password in the {string} input box")
    public void userGivesPasswordInTheInputBox(String arg0) {
        loginLogoutPage.password.sendKeys(arg0);

    }
}




