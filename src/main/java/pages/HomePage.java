package pages;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BaseTest {
   // @AndroidFindBy(accessibility = "btnTabBarMyAccount") private MobileElement btnMyAccount;

    MobileElement btnMyAccount = (MobileElement) driver.findElementByAccessibilityId("btnTabBarMyAccount");

    public MyAccountPage clickMyAccount() {
        waitForVisibility(btnMyAccount);
        click(btnMyAccount);
        return new MyAccountPage();
    }
}
