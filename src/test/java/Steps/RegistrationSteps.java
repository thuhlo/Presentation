package Steps;

import com.PageObjects.NavigationObject;
import com.PageObjects.RegistrationPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegistrationSteps
{

    private WebDriver driver;
   // private StringBuffer verificationErrors = new StringBuffer();
   NavigationObject navObj;
   RegistrationPage registrationObj;


    @Given("^I go to the homepage$")
    public void i_go_to_the_homepage() throws Throwable
    {
        System.setProperty("webdriver.chrome.driver","C://Users//7200//Downloads//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        //navObj = PageFactory.initElements(driver, NavigationObject.class);
       // registrationObj = PageFactory.initElements(driver, RegistrationPage.class);


        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @When("^I click Register$")
    public void i_click_Register() throws Throwable
    {
        navObj = new NavigationObject(driver);
        registrationObj = new RegistrationPage(driver);
        navObj.linkRegister();
        Thread.sleep(3000);

        // throw new PendingException();
    }

    @When("^Enter the correct details \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"" +
            " \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void enter_the_correct_details(String gender, String firstname, String lastname, String day, String month, String year,
                                          String email, String password, String confirmPassword) throws Throwable
    {
        if(gender.equalsIgnoreCase("male"))
        {
            registrationObj.rdoMaleClick();
        }
        else
        {
            registrationObj.rdoFemaleClick();
        }

        registrationObj.txtFisrtname(firstname);
        registrationObj.txtLastname(lastname);
        registrationObj.drpDayOfBirth(day);
        registrationObj.drpMonthOfBirth(month);
        registrationObj.drpYearOfBirth(year);
        registrationObj.txtEmail(email);
        registrationObj.chkNewsLetter(true);
        registrationObj.txtPAssword(password);
        registrationObj.txtConPassword(confirmPassword);


        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
    }

    @Then("^I should be directed to the homepage with user details displayed$")
    public void i_should_be_directed_to_the_homepage_with_user_details_displayed() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
       // driver.navigate().back();
        driver.close();

    }

    @Then("^I should be informed that I cannot register twice$")
    public void iShouldBeInformedThatICannotRegisterTwice()
    {
        driver.close();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////Logging IN////////////////////////////////////////////////////////////////

   /* @Given("^Click on login$")
    public void click_on_login() throws Throwable
    {
        navObj.linkLogInOrOut();
        // Write code here that turns the phrase above into concrete actions    throw new PendingException();
    }

    @When("^I enter correct details$")
    public void i_enter_correct_details() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable
    {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
    }
*/


}
