package com.upgenix.step_definitions;

import com.upgenix.pages.Login_Logout_Page;
import com.upgenix.utilities.ConfigurationReader;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinations {
    Login_Logout_Page loginLogoutPage =new Login_Logout_Page();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        String url= ConfigurationReader.getProperty("web.table.url");
        Driver.getDriver().get(url);
    }
    @When("user enters SalesManager username")
    public void user_enters_sales_manager_username() {
        loginLogoutPage.username.sendKeys("salesmanager15@info.com");

    }
    @When("user enters SalesManager password")
    public void user_enters_sales_manager_password() {
        loginLogoutPage.password.sendKeys("salesmanager");

    }


    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        Assert.assertEquals("SalesManager15", loginLogoutPage.usertext.getText());


    }

    @When("user enters PosManager username")
    public void user_enters_pos_manager_username() {
        loginLogoutPage.username.sendKeys("posmanager15@info.com");

    }
    @When("user enters PosManager password")
    public void user_enters_pos_manager_password() {
        loginLogoutPage.password.sendKeys("posmanager");

    }



}
