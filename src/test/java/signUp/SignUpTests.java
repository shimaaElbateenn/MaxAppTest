package signUp;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class SignUpTests extends BaseTest {

    public StartPage startPage;
    CategoriesPage categoriesPage;
    HomePage homePage;
    MyAccountPage myAccountPage;
    public SignUpPage signUpPage;
    private String errorMessage;

    @BeforeMethod
    public void beforeMethod() {
        startPage = new StartPage();
//        categoriesPage = new CategoriesPage();
//        homePage = new HomePage();
//        myAccountPage = new MyAccountPage();
//        signUpPage = new SignUpPage();
    }

    @Test
    public void invalidPassword() {
        startPage.clickContinue();

       // startPage.clickEgyptCounty();

//
//        categoriesPage.clickWomenCategory();
//
//        homePage.clickMyAccount();
//
//        myAccountPage.clickSignUp();

//        signUpPage.enterFullName("Shimaa Ahmed");
//        signUpPage.enterEmail("shimaa@gmail.com");
//        signUpPage.enterPassword("12345");
//        signUpPage.enterPassword("01025059664");
//        signUpPage.clickCheckBox();
//        signUpPage.clickSubmitBtn();
//        errorMessage = signUpPage.getPaswdErrorMessage();
//        Assert.assertEquals(errorMessage, "Mobile Number should be 10 digit long", "Invalid Error Message");
    }
}
