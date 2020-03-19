package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.homePage;
import pageObjectModel.loginPage;
import pageObjectModel.wishListPage;
import utilities.Driver;

public class addToWishListSteps {

    WebDriver driver = Driver.getDriver();
    homePage homePage = new homePage();
    loginPage loginPage = new loginPage();
    wishListPage wishListPage = new wishListPage();

    @And("^Hover over on Desktops$")
    public void hover_over_on_Desktops() {
       wishListPage.hoverOverOnbuttonDesktops();

    }

    @And("^Click on Mac$")
    public void click_on_Mac() {
        wishListPage.clickOnButtonMac();

    }

    @When("^Click on Add to Wish List button$")
    public void click_on_Add_to_Wish_List_button() {
        wishListPage.addToWishListButton();

    }

    @Then("^Verify that item is in your wish list$")
    public void verify_that_item_is_in_your_wish_list() throws InterruptedException {
        wishListPage.verifyItemAddedSuccessfully();

    }

    @And("^Click on Wish List$")
    public void click_on_Wish_List() {
        wishListPage.clickOnWishListButton();

    }

    @And("^Remove that item in your wish list$")
    public void remove_that_item_in_your_wish_list() {
        wishListPage.clickOnRemoveButton();

    }

    @Then("^Verify that item is removed$")
    public void verify_that_item_is_removed() throws InterruptedException {
        wishListPage.verifyItemRemovedSuccessfully();

    }
}
