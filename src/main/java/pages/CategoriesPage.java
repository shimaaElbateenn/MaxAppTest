package pages;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CategoriesPage extends BaseTest {
    @AndroidFindBy(accessibility = "iScaledImage0") private MobileElement shopWomen;
    @AndroidFindBy(accessibility = "iScaledImage1") private MobileElement shopMen;
    @AndroidFindBy(accessibility = "iScaledImage2") private MobileElement shopKids;
    public HomePage clickWomenCategory() {
        click(shopWomen);
        return new HomePage();
    }
}
