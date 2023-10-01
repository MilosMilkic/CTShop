import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


import java.time.Duration;

public class BaseTest {
    HomePage homePage;
    AccountPage accountPage;

    ChromeDriver driver;
    public ChromeDriver openBrowser()
    {
        ChromeDriver driver = new ChromeDriver();
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
    }


}
