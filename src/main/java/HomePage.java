import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    // accept cookies button
    @FindBy(xpath = "//button[normalize-space()='Prihvatam']")
    WebElement cookiesButton;
    @FindBy(linkText = "Otvori nalog")
    WebElement openAccount;
    @FindBy(linkText = "Prijavi se")
    WebElement login;

    @FindBy(id = "search-input-header")
    WebElement input;
    @FindBy(css = ".reset .fa-close")
    WebElement resetButton;
    @FindBy(id = "search-submit-header")
    WebElement searchButton;
    @FindBy(css = ".sharkskin-breadcrumb .active")
    WebElement info;
    @FindBy(xpath = "//*[@id=\"products-list\"]/div[1]/div/div[2]/h4/a")
    WebElement lenovoProduct;
    @FindBy(xpath = "//*[@id=\"products-list\"]/div[3]/div/div[2]/h4/a")
    WebElement samsungProduct;
    @FindBy(css = ".product-name h1")
    WebElement productInfo;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void acceptCookies() {cookiesButton.click();}
    public void clickOpenAccount() {openAccount.click();}
    public void clickLogin() {login.click();}
    public void inputField(String name){input.sendKeys(name);}
    public void keyEnter(){input.sendKeys(Keys.ENTER);}
    public String inputInfo(){return input.getText();}
    public void removeInput(){resetButton.click();}
    public void clickSearch(){searchButton.click();}
    public String searchResults(){return info.getText();}
    public void clickLenovo(){lenovoProduct.click();}
    public String productName(){return productInfo.getText();}
    public void clickSamsung(){ samsungProduct.click();}

}
