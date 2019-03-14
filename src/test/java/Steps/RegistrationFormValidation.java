package Steps;

import com.PageObjects.InitDriver;
import com.PageObjects.NavigationObject;
import com.PageObjects.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationFormValidation
{

    private WebDriver objDriver;
    private InitDriver initDriver;
    RegistrationPage regObj;
    NavigationObject navObj;

    @Given("^I launch the home page$")
    public void iLaunchTheHomePage()
    {
        System.setProperty("webdriver.chrome.driver","C://Users//7200//Downloads//chromedriver_win32/chromedriver.exe");
        objDriver = new ChromeDriver();
        objDriver.get("https://demo.nopcommerce.com");
        objDriver.manage().window().maximize();
        regObj = new RegistrationPage(objDriver);
        navObj = new NavigationObject(objDriver);
    }

    @And("^navigate to the registration page$")
    public void navigateToTheRegistrationPage()
    {

        navObj.linkRegister();
    }

    @When("^I enter numbers for the \"([^\"]*)\" and \"([^\"]*)\" field$")
    public void iEnterNumbersForTheAndField(String firstName, String lastName) throws Throwable
    {
        regObj = new RegistrationPage(objDriver);
        regObj.txtFisrtname("");
        regObj.txtLastname("");
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @And("^Enter correct \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void enterCorrect(String gender, String day, String month, String year, String
            email, String passWord, String confirmPassword) throws Throwable
    {
        regObj.selectGender(gender);
        regObj.drpDayOfBirth(day);
        regObj.drpMonthOfBirth(month);
        regObj.drpYearOfBirth(year);
        regObj.txtEmail(email);
        regObj.txtPAssword(passWord);
        regObj.txtConPassword(confirmPassword);

        regObj.btnRegister();
        Thread.sleep(3000);


        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }



    @Then("^I should be informed that fisrtname and lastname is not correct$")
    public void iShouldBeInformedThatFisrtnameAndLastnameIsNotCorrect()
    {
        Assert.assertEquals("First name is required.", regObj.firstNameValidation());
        Assert.assertEquals("Last name is required.", regObj.lastNameValidation());
        objDriver.close();
    }




    ////////////////////////////Second Scenario//////////////////////////////////////////
    @When("^I enter correct \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void iEnterCorrect(String gender, String firstname, String lastname, String day,
                              String month, String year, String password, String confirmPassword) throws Throwable
    {
        navObj.linkRegister();
        regObj.selectGender(gender);
        regObj.txtFisrtname(firstname);
        regObj.txtLastname(lastname);
        regObj.drpDayOfBirth(day);
        regObj.drpMonthOfBirth(month);
        regObj.drpYearOfBirth(year);
        regObj.txtPAssword(password);
        regObj.txtConPassword(confirmPassword);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }


    @And("^I enter invalid \"([^\"]*)\"$")
    public void iEnterInvalid(String email) throws Throwable
    {
        regObj.txtEmail(email);
        regObj.btnRegister();
        objDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    
    @Then("^I should be informed that my email is not correct$")
    public void iShouldBeInformedThatMyEmailIsNotCorrect()
    {
       // Assert.assertEquals("Wrong email", regObj.msgEmailValidation());
        objDriver.close();
    }



}
