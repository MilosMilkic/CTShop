import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


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
    @FindBy(xpath = "//*[@id=\"products-list\"]/div[1]/div/div[2]/h4/a")
    WebElement lenovoProduct;
    @FindBy(xpath = "//*[@id=\"products-list\"]/div[3]/div/div[2]/h4/a")
    WebElement samsungProduct;
    @FindBy(css = ".product-name h1")
    WebElement productInfo;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public void acceptCookies() {cookiesButton.click();}
    public void clickOpenAccount() {openAccount.click();}
    public void clickLogin() {login.click();}
    public void inputField(String name){input.sendKeys(name);}
    public void keyEnter(){input.sendKeys(Keys.ENTER);}
    public String inputInfo(){return input.getText();}
    public void removeInput(){resetButton.click();}
    public void clickSearch(){searchButton.click();}
    public void clickLenovo(){lenovoProduct.click();}
    public String productName(){return productInfo.getText();}
    public void clickSamsung(){ samsungProduct.click();}

}
