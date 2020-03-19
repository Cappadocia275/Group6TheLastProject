package pageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class wishListPage extends Abstract {

    WebDriver driver = Driver.getDriver();

    public wishListPage() {

        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")
    private WebElement buttonDesktops;

    public void hoverOverOnbuttonDesktops() {
        hoverOver(buttonDesktops);
    }

    @FindBy(xpath = "//a[contains(text(),'Mac (1)')]")
    private WebElement buttonMac;

    public void clickOnButtonMac(){

        clickFunctionality( buttonMac );
    }

    @FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//button[2]")

    private WebElement buttonAddToWishList;

    public void addToWishListButton(){
        clickFunctionality(buttonAddToWishList);
    }

    @FindBy(xpath = "//div[contains(text(), ' Success: You have added ')]")

    private WebElement successfullyAded;


    public void verifyItemAddedSuccessfully() throws InterruptedException {

        Thread.sleep( 3000 );
        String actualMessage = successfullyAded.getText();
        //        String expectedMessage = "Success: You have added iMac to your wish list!";
        if (actualMessage.contains("Success")){
            System.out.println("Success: You have added iMac to your wish list!");
        }

    }

    @FindBy(xpath = "//span[contains(text(),'Wish List (1)')]")

       private WebElement buttonWishList;

       public void clickOnWishListButton(){
              clickFunctionality(buttonWishList);
              }


    @FindBy(xpath = "//i[@class='fa fa-times']")

    private WebElement buttonRemove;

    public void clickOnRemoveButton(){
        clickFunctionality(buttonRemove);
    }

    @FindBy(xpath = "//div[contains(text(),'Success: You have modified your wish list!')]")

    private WebElement successfullyRemoved;


    public void verifyItemRemovedSuccessfully() throws InterruptedException {

        Thread.sleep(3000);
        String actualMessage = successfullyRemoved.getText();
        //        String expectedMessage = "Success: You have added iMac to your wish list!";
        if (actualMessage.contains("Success")) {
            System.out.println("Success: You have removed item from your wish list!");
        }
    }
}