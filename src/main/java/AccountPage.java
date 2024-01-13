import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountPage extends BasePage{
    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id = "lastname")
    WebElement lastName;
    @FindBy(id = "email_address")
    WebElement emailAddress;
    @FindBy(id = "is_subscribed")
    WebElement subscribedNews;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "confirmation")
    WebElement confirmPassword;
    @FindBy(id = "remember_meGgNW83udlh")
    WebElement checkboxRememberMe;
    @FindBy(id = "pravnolice")
    WebElement legalEntity;
    @FindBy(id = "pib")
    WebElement taxID;
    @FindBy(css = "button[title='Submit'] span span")
    WebElement submit;
    @FindBy(css = "a[class='back-link']")
    WebElement back;

    @FindBy(className = "alert-warning")
    WebElement accAlertMessage;
    @FindBy(className = "alert-danger")
    WebElement loginErrorMessage;

    @FindBy(id = "email")
    WebElement loginEmail;
    @FindBy(id = "pass")
    WebElement loginPass;
    @FindBy(id = "remember_mevN22iqxPF7")
    WebElement loginRememberMe;
    @FindBy(css = ".buttons-set a")
    WebElement forgotPassword;
    @FindBy(id = "send2")
    WebElement submitBtn;
    @FindBy(css = ".hello strong")
    WebElement welcomeMess;

    @FindBy(css = "button[class='btn btn-primary']")
    WebElement resetPass;
    @FindBy(css = ".help-block strong")
    WebElement errorResetMess;
    @FindBy(className = "alert-success")
    WebElement success;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public void setFirstName(String name) {firstName.sendKeys(name);}
    public void setLastName(String last) {lastName.sendKeys(last);}
    public void setEmailAddress(String email) {emailAddress.sendKeys(email);}
    public void setPassword(String pass) {password.sendKeys(pass);}
    public void setConfirmPassword(String conPass) {confirmPassword.sendKeys(conPass);}

    public void uncheckRememberMe() {checkboxRememberMe.click();}
    public void unsubscribeNews() {subscribedNews.click();}
    public void selectLegalEntityYes()
    {
        Select select = new Select(legalEntity);
        select.selectByVisibleText("Da");
    }
    public void setTaxID(String pib) {taxID.sendKeys(pib);}
    public void clickBack() {back.click();}
    public void clickSubmit(){submit.submit();}
    public String alertMessage() {return accAlertMessage.getText();}

    public void enterEmail(String email) {loginEmail.sendKeys(email);}
    public void enterPassword(String pass) {loginPass.sendKeys(pass);}
    public void uncheckLoginRememberMe() {loginRememberMe.click();}
    public void clickLogin() {submitBtn.submit();}
    public void clickForgotPassword() {forgotPassword.click();}
    public String welcomeMessage() {return welcomeMess.getText();}
    public String loginAlertMessage() {return loginErrorMessage.getText();}
    public void clickResetPassword() {resetPass.submit();}
    public String errorResetPassMessage() {return errorResetMess.getText();}
    public String successAlertMessage() {return success.getText();}

}
