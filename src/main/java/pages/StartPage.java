package pages;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class StartPage extends BaseTest {

  //  @AndroidFindBy (accessibility = "twfButton_en_5") private MobileElement egyptCountry;
  //  @AndroidFindBy (accessibility = "btnContinue") private MobileElement btnContinue;

    MobileElement egyptCountry = (MobileElement) driver.findElementByAccessibilityId("twfButton_en_5");
    MobileElement btnContinue = (MobileElement) driver.findElementByAccessibilityId("btnContinue");


    public StartPage clickEgyptCounty() {
        waitForVisibility(egyptCountry);
        click(egyptCountry);
        return this;
    }

    public CategoriesPage clickContinue() {
        waitForVisibility(btnContinue);
        click(btnContinue);
        return new CategoriesPage();
    }

}
