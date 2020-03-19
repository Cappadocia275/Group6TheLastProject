package pageObjectModel;


import org.junit.Assert;
import org.jsoup.select.Evaluator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Driver;

public class Abstract {


    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait( driver , 10 );

    public void clickFunctionality(WebElement clickButton) {

        wait.until(ExpectedConditions.elementToBeClickable(clickButton));
        clickButton.click();
    }

    public void sendKeysFunctionality(WebElement sendKeysButton , String value){

        wait.until( ExpectedConditions.visibilityOf( sendKeysButton ) );
        sendKeysButton.sendKeys( value );
    }

    public void verifyTheTitle (){

        String actualTitle = driver.getTitle();
        String expectedTitle = "My Account";
        Assert.assertEquals(actualTitle, expectedTitle);


    }
// handle the hover over
    public void hoverOver(WebElement hoveroverElement){
        Actions actions = new Actions( driver );
        actions.moveToElement( hoveroverElement ).build().perform();
    }



}
