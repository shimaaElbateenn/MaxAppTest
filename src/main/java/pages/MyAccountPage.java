package pages;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyAccountPage extends BaseTest {
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"txtSignUp\"])[2]") private MobileElement btnSignUp;

    public SignUpPage clickSignUp() {
        click(btnSignUp);
        return new SignUpPage();
    }

}
