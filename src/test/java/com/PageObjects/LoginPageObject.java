package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPageObject
{
    @FindBy(how = How.ID, using = "Email")
    private WebElement txtEmailLogIn;

    @FindBy(how = How.ID, using = "Password")
    private WebElement txtPasswordLogIN;

    @FindBy(how = How.ID, using = "RememberMe")
    private WebElement rdoRemmberMe;

    @FindBy(how = How.XPATH, using = "//a[@href='/passwordrecovery']")
    private WebElement lnkForgotPassword;

    @FindBy(how = How.XPATH, using = "/html//div[@class='master-wrapper-page']/div[@class='master-wrapper-content']" +
            "/div[@class='master-column-wrapper']/div[@class='center-1']//form[@action='/login']//input[@value='Log in']")
    private WebElement btnLogIn;

    @FindBy(how = How.CSS, using= ".validation-summary-errors")
    private WebElement msgInvalidLogIn;

    public LoginPageObject(WebDriver objDriver)
    {
        PageFactory.initElements(objDriver, this);
    }

    public String msgInvalidLogIn()
    {
        return msgInvalidLogIn.getText().toString();
    }


    public void btnLogIn()
    {
        btnLogIn.click();
    }

    public void linkForgotPassword()
    {
        lnkForgotPassword.click();
    }

    public void remmemberMe()
    {
        rdoRemmberMe.click();
    }

    public void txtEmailLogIn(String email)
    {
        txtEmailLogIn.sendKeys(email);
    }

    public void txtPasswordLogIN(String password)
    {
        txtPasswordLogIN.sendKeys(password);
    }
}
