package Steps;

import com.PageObjects.InitDriver;
import com.PageObjects.LoginPageObject;
import com.PageObjects.NavigationObject;
import com.PageObjects.RegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps
{
    private WebDriver objDriver;
    private NavigationObject navObj;
    private RegistrationPage regObj;
    private LoginPageObject loginOBJ;

    @Given("^I navigate to homepage$")
    public void iNavigateToHomepage()
    {

         objDriver = InitDriver.setUpDriver();
         objDriver.get("https://demo.nopcommerce.com");
         objDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         objDriver.manage().window().maximize();
         
    }

    @And("^click log-in$")
    public void clickLogIn()
    {
        regObj = new RegistrationPage(objDriver);
        navObj = new NavigationObject(objDriver);
        loginOBJ = new LoginPageObject(objDriver);
        navObj.linkLogInOrOut();
    }

    @When("^enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterValidAnd(String email, String passWord) throws Throwable
    {
        loginOBJ.txtEmailLogIn(email);
        loginOBJ.txtPasswordLogIN(passWord);
        loginOBJ.btnLogIn();
        Thread.sleep(3000);
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }

    @Then("^I should be logged into the system$")
    public void iShouldBeLoggedIntoTheSystem() throws InterruptedException
    {
       // Assert.assertEquals("nopCommerce demo store. Login", objDriver.getTitle());
        Thread.sleep(3000);
        objDriver.close();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //@WarningInsteadOfFailure
    @When("^enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void enterInvalidAnd(String email, String password) throws Throwable
    {
        loginOBJ.txtEmailLogIn(email);
        loginOBJ.txtPasswordLogIN(password);
        loginOBJ.btnLogIn();
        objDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be informed that I used wrong credentials$")
    public void iShouldBeInformedThatIUsedWrongCredentials()
    {
        //System.out.println(loginOBJ.msgInvalidLogIn());
        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", loginOBJ.msgInvalidLogIn());
        //objDriver.close();
    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
