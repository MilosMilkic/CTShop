import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    //    accept cookies button
    @FindBy(xpath = "//button[normalize-space()='Prihvatam']")
    WebElement cookiesButton;

    @FindBy(linkText = "Otvori nalog")
    WebElement openAccount;
    @FindBy(linkText = "Prijavi se")
    WebElement login;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {cookiesButton.click();}

    public void clickOpenAccount() {openAccount.click();}
    public void clickLogin() {login.click();}


}
