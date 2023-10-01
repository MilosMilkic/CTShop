import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

    @Test
    public void createAccount()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackPearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
//        accountPage.clickSubmit();
//        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ctshop.rs/customer/account/login", "after click submit,the app takes you to the login page");
    }
}
