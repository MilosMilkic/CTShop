import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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

    public AccountPage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
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
        Select select =new Select(legalEntity);
        select.selectByVisibleText("Da");
    }
    public void setTaxID(String pib) {taxID.sendKeys(pib);}
    public void clickBack() {back.click();}
    public void clickSubmit(){submit.submit();}

}
