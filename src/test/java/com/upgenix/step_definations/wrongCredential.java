package com.upgenix.step_definations;

import com.upgenix.pages.LoginPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class wrongCredential {
    LoginPage loginPage=new LoginPage();
    @When("User gives invalid email in the email input box")
    public void user_gives_invalid_email_in_the_email_input_box() {
        loginPage.username.sendKeys("xyz");

    }
    @When("User gives valid password in the password input box")
    public void user_gives_valid_password_in_the_password_input_box() {
        loginPage.password.sendKeys("salesmanager");
    }
    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.loginBtn.click();
    }
    @Then("User sees Wrong login, password text")
    public void user_sees_wrong_login_password_text() {
        Assert.assertTrue(loginPage.wrongText.getText().equals("Wrong login/password"));

    }


    @When("User gives valid email in the email input box")
    public void user_gives_valid_email_in_the_email_input_box() {
        loginPage.username.sendKeys("salesmanager15@info.com");

    }
    @When("User gives invalid password in the password input box")
    public void user_gives_invalid_password_in_the_password_input_box() {
        loginPage.password.sendKeys("abc");

    }

    @When("username empty")
    public void username_empty() {
        loginPage.username.sendKeys("");

    }
    @Then("User sees please fill out this field text")
    public void user_sees_please_fill_out_this_field_text() {
        Assert.assertTrue(!(loginPage.hidden.getText().equals("Please fill out this field.")));


    }

    @When("password empty")
    public void password_empty() {
        loginPage.password.sendKeys("");

    }


    @Given("write any text username")
    public void writeAnyTextUsername() {
        loginPage.username.sendKeys("qwe");
    }

    @When("click reset password button")
    public void clickResetPasswordButton() {
        loginPage.resetBtn.click();
    }

    @Then("User sees reset password page")
    public void userSeesResetPasswordPage() {
        Assert.assertEquals("Reset password | Best solution for startups" , Driver.getDriver().getTitle());
    }
    @And("write any text password")
    public void writeAnyTextPassword() {
        loginPage.password.sendKeys("abs");
    }
    @Then("User sees bullet sign in password line when text")
    public void userSeesBulletSignInPasswordLineWhenText() {
        Assert.assertTrue(loginPage.password.getAttribute("type").equals("password"));
    }


    @Then("user send key enter not click")
    public void userSendKeyEnterNotClick() {
        loginPage.loginBtn.sendKeys(Keys.ENTER);
    }
}




