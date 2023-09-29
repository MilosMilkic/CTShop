import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    //    accept cookies button
    @FindBy(xpath = "//button[normalize-space()='Prihvatam']")
    WebElement cookiesButton;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {cookiesButton.click();}
}
