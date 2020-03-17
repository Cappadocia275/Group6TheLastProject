package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModel.homePage;
import pageObjectModel.loginPage;
import utilities.Driver;
import utilities.readProperties;

public class signInSteps {

    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();
    loginPage loginPage = new loginPage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {
        driver.get(readProperties.getData("URL"));
        driver.manage().window().maximize();

    }

    @And("^Click on My Account$")
    public void click_on_My_Account() {
        homePage.clickOnMyAccount();

    }

    @And("^Click on Login$")
    public void click_on_Login() {
        homePage.clickOnLogin();

    }

    @And("^Type the email address and password and click on login button$")
    public void type_the_email_address_and_password_and_click_on_login_button() {
        loginPage.typEmail();
        loginPage.typPassword();
        loginPage.clickonbuttonLogin();

    }

    @Then("^Verify I am in the account page$")
    public void verify_I_am_in_the_account_page() {

        loginPage.verifyTheTitle();

    }

}
