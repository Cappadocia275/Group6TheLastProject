package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class homePage extends Abstract {

       WebDriver driver = Driver.getDriver();

       public homePage(){

           PageFactory.initElements(driver, this);
       }

       @FindBy(xpath = "//i[@class='fa fa-user']")
    private WebElement myAccountButton;

       @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Login')]")

    private WebElement loginButton;

       public void clickOnMyAccount(){
           clickFunctionality(myAccountButton);
       }

    public void clickOnLogin() {
        clickFunctionality(loginButton);
    }
}
