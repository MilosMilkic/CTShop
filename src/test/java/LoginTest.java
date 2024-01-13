import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void loginOnApplication()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("jonas@gmail.com");
        accountPage.enterPassword("blackPearl");
        accountPage.uncheckLoginRememberMe();
        accountPage.clickLogin();
//      Assert.assertEquals(accountPage.welcomeMessage(), "Dobrodošli, Jonas Schmedtmann!");

//      Email:"jonas@gmail.com" and Password:"blackPearl" are just examples of this test.
    }

    @Test
    public void loginWithInvalidEmailAddress()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("jonasss@gmail.com");
        accountPage.enterPassword("blackPearl");
        accountPage.uncheckLoginRememberMe();
        accountPage.clickLogin();
        Assert.assertEquals(accountPage.loginAlertMessage(), "Uneta email adresa i lozinka se ne poklapaju.");
    }

    @Test
    public void loginWithOutEmailAddress()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("jonas@gmail.com");
        accountPage.enterPassword("");
        accountPage.uncheckLoginRememberMe();
        accountPage.clickLogin();
        Assert.assertEquals(accountPage.loginAlertMessage(), "Došlo je do greške. Proverite unete podatke.");
    }

    @Test
    public void loginWithInvalidPassword()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("jonas@gmail.com");
        accountPage.enterPassword("Pearl");
        accountPage.uncheckLoginRememberMe();
        accountPage.clickLogin();
        Assert.assertEquals(accountPage.loginAlertMessage(), "Uneta email adresa i lozinka se ne poklapaju.");
    }

    @Test
    public void loginWithoutPassword()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("jonas@gmail.com");
        accountPage.enterPassword("");
        accountPage.uncheckLoginRememberMe();
        accountPage.clickLogin();
        Assert.assertEquals(accountPage.loginAlertMessage(), "Došlo je do greške. Proverite unete podatke.");
    }

    @Test
    public void loginWithoutAnyData()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.enterEmail("");
        accountPage.enterPassword("");
        accountPage.clickLogin();
        Assert.assertEquals(accountPage.loginAlertMessage(), "Došlo je do greške. Proverite unete podatke.");
    }

    @Test
    public void verifyForgotPassWithValidEmail()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.clickForgotPassword();
        accountPage.enterEmail("jonas@gmail.com");
        accountPage.clickResetPassword();
//      Assert.assertEquals(accountPage.successAlertMessage(),"Poslali smo link za reset šifre na Vašu e-mail adresu!");

//      Email:"jonas@gmail.com" is just an example for this test; please enter your valid email address.
    }

    @Test
    public void verifyForgotPassWithInvalidEmail()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.clickForgotPassword();
        accountPage.enterEmail("jon@gmail.com");
        accountPage.clickResetPassword();
        Assert.assertEquals(accountPage.errorResetPassMessage(), "Nalog za navedenu E-mail adresu nije otvoren.");
    }

    @Test
    public void verifyForgotPassWithoutEmail()
    {
        homePage.acceptCookies();
        homePage.clickLogin();
        accountPage.clickForgotPassword();
        accountPage.enterEmail("");
        accountPage.clickResetPassword();
        Assert.assertEquals(accountPage.errorResetPassMessage(), "The email field is required.");
    }

}
