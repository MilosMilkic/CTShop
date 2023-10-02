
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

    @Test
    public void createAccountWithoutFirstName()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackPearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Niste uneli ime!");
    }

    @Test
    public void createAccountWithoutLastName()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackPearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Niste uneli prezime!");
    }

    @Test
    public void createAccountWithoutEmailAddress()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackPearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Niste uneli email!");
    }

    @Test
    public void createAccountWithInvalidEmailAddressMissingSymbol()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonasgmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackPearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "The email must be a valid email address.");
    }

    @Test
    public void createAccountWithoutPassword()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("");
        accountPage.setConfirmPassword("");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Niste uneli šifru!");
    }

    @Test
    public void createAccountWithoutPasswordConfirmation()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Razlikuju se lozinka i potvrda lozinke!");
    }

    @Test
    public void createAccountWithDifferentPasswordConfirmation()
    {
        homePage.acceptCookies();
        homePage.clickOpenAccount();
        accountPage.setFirstName("Jonas");
        accountPage.setLastName("Schmedtmann");
        accountPage.setEmailAddress("jonas@gmail.com");
        accountPage.setPassword("blackPearl");
        accountPage.setConfirmPassword("blackpearl");
        accountPage.uncheckRememberMe();
        accountPage.unsubscribeNews();
        accountPage.clickSubmit();
        Assert.assertEquals(accountPage.alertMessage(), "Razlikuju se lozinka i potvrda lozinke!");
    }

}
