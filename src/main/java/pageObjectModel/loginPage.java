package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.readProperties;

public class loginPage extends Abstract{

    WebDriver driver = Driver.getDriver();

    public loginPage(){

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement inputEmail;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement inputPassword;


    @FindBy(xpath = "//input[@class='btn btn-primary']")
    private WebElement buttonLogin;

    public void typEmail(){
        sendKeysFunctionality(inputEmail, readProperties.getData("Email"));

    }

    public void typPassword() {
        sendKeysFunctionality(inputPassword, readProperties.getData("Password"));
    }

    public void clickonbuttonLogin() {
        clickFunctionality(buttonLogin);
    }


}
