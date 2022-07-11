package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Logout_Page {
    public Login_Logout_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "login")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;
    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongText;
    @FindBy(xpath = "//input[@type='hidden']")
    public WebElement hidden;
    @FindBy(xpath = "//a[@class='btn btn-link pull-right']")
    public WebElement resetBtn;
    @FindBy(linkText = "SalesManager15")
    public WebElement usertext;
    @FindBy(xpath = "//a[@data-menu='logout']")
    public WebElement logout;
    @FindBy(xpath = "//span[@class='oe_topbar_name']")
    public WebElement actualusername;
    @FindBy(linkText = "Log out")
    public static WebElement logverify;
    @FindBy(className = "modal-title")
    public WebElement alert;


}
