import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {
    HomePage homePage;
    AccountPage accountPage;
    SearchResultPage searchResultPage;

    WebDriver driver;
    public WebDriver openBrowser()
    {
        driver = new ChromeDriver();
        driver.navigate().to("https://www.ctshop.rs/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }

    @BeforeMethod
    public void setUp()
    {
        driver = openBrowser();
        homePage = new HomePage(driver);
        accountPage = new AccountPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @AfterMethod
    public void after() {driver.quit();}

}
