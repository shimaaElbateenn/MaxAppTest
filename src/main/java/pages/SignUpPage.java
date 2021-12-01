package pages;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignUpPage extends BaseTest {
    @AndroidFindBy(accessibility = "txtFullName") private MobileElement fullNameEditTest;
    @AndroidFindBy(accessibility = "txtEmail") private MobileElement emailEditText;
    @AndroidFindBy(accessibility = "txtEnterPassword") private MobileElement passwordEditText;
    @AndroidFindBy(accessibility = "txtMobileNumber") private MobileElement mobileEditText;
    @AndroidFindBy(accessibility = "icoCheckbox") private MobileElement checkBox;
    @AndroidFindBy(accessibility = "btnIsSubmitButton") private MobileElement btnSubmit;
    @AndroidFindBy(accessibility = "lblMobilenumber") private MobileElement paswdErrorMessage;

    public void enterFullName(String name) {
        sendKeys(fullNameEditTest, name);
    }
    public void enterEmail(String email) {
        sendKeys(emailEditText, email);
    }
    public void enterPassword(String password) {
        sendKeys(passwordEditText, password);
    }
    public void enterPhoneNumber(String phone) {
        sendKeys(mobileEditText, phone);
    }

    public void clickCheckBox() {
        click(checkBox);
    }

    public void clickSubmitBtn() {
        click(btnSubmit);
    }

    public String getPaswdErrorMessage() {
        return getAttribute(paswdErrorMessage, "text");
    }

}
