package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage
{
    @FindBy(how = How.ID, using = "gender-male")
    private WebElement rdoMale;
    @FindBy(how = How.ID, using = "gender-female")
    private WebElement rdoFemale;
    @FindBy(how = How.ID, using = "FirstName")
    private WebElement txtFirstname;
    @FindBy(how = How.ID, using = "LastName")
    private WebElement txtLastname;
    @FindBy(how = How.ID, using = "Email")
    private WebElement txtEmail;
    ///Set to find selected option by index in the method(local)
    @FindBy(how = How.NAME, using = "DateOfBirthDay")
    private WebElement drpDay;
    @FindBy(how = How.NAME, using = "DateOfBirthMonth")
    private WebElement drpMonth;
    @FindBy(how = How.NAME, using = "DateOfBirthYear")
    private WebElement drpYear;
    ///Set to find selected option by index in the method
    @FindBy(how = How.ID, using = "Company")
    private WebElement txtComapanyName;
    @FindBy(how = How.ID, using = "Newsletter")
    private WebElement chkNewsLetter;
    @FindBy(how = How.ID, using = "Password")
    private WebElement txtPassword;
    @FindBy(how = How.ID, using = "ConfirmPassword")
    private WebElement txtConPassword;
    @FindBy(how = How.ID, using = "register-button")
    private WebElement btnRegister;

    @FindBy(how = How.ID, using = "FirstName-error")
    private WebElement msgFirstname;

    @FindBy(how = How.ID, using = "LastName-error")
    private WebElement msgLastname;

    @FindBy(how = How.ID, using = "Email-error")
    private WebElement msgEmail;

    public String msgEmailValidation()
    {
        return msgEmail.getText();
    }

    public String lastNameValidation()
    {
        return msgLastname.getText();
    }

    public String firstNameValidation()
    {
        return msgFirstname.getText();
    }

    public RegistrationPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void rdoMaleClick()

    {
        rdoMale.click();
    }
    public void rdoFemaleClick()

    {
        rdoFemale.click();
    }

    public void selectGender(String gender)
    {
        if(gender.equalsIgnoreCase("male"))
        {
            rdoMaleClick();
        }
        else if(gender.equalsIgnoreCase("female"))
        {
            rdoFemaleClick();
        }
    }


    public void txtFisrtname(String fisrtname)
    {
        txtFirstname.clear();
        txtFirstname.sendKeys(fisrtname);
    }


    public void txtLastname(String lastname)
    {
        txtLastname.clear();
        txtLastname.sendKeys(lastname);
    }


    public void txtEmail(String email)
    {
        txtEmail.clear();
        txtEmail.sendKeys(email);
    }

    public void drpDayOfBirth(String dayOfBirth)
    {
        Select drpDayOfBirth = new Select(drpDay);
        drpDayOfBirth.selectByVisibleText(dayOfBirth);
    }

    public void drpMonthOfBirth(String monthOfBirth)
    {
        Select drpMonthBirth = new Select(drpMonth);
        drpMonthBirth.selectByVisibleText(monthOfBirth);
    }


    public void drpYearOfBirth(String yearOfBirth)
    {
        Select drpYearBirth = new Select(drpYear);
        drpYearBirth.selectByVisibleText(yearOfBirth);
    }


    public void txtCompanyName(String companyName)
    {
        txtComapanyName.clear();
        txtComapanyName.sendKeys(companyName);
    }


    public void chkNewsLetter(Boolean newsLetter)
    {
        if(chkNewsLetter.isSelected())
        {

        }
        else
        {
            chkNewsLetter.click();
        }
    }


    public void txtPAssword(String passWord)
    {
        txtPassword.clear();
        txtPassword.sendKeys(passWord);
    }


    public void txtConPassword(String password)
    {
        txtConPassword.clear();
        txtConPassword.sendKeys(password);
    }

    public void btnRegister()
    {
        btnRegister.click();
    }




}
