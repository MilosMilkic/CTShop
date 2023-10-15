
import org.testng.Assert;
import org.testng.annotations.Test;


public class SearchTest extends BaseTest{

    @Test
    public void verifySearchItems()
    {
        homePage.acceptCookies();
        homePage.inputField("lenovo");
        homePage.clickSearch();
        Assert.assertEquals(homePage.searchResults(), "Lenovo");
    }

    @Test
    public void verifySearchItemsUsingEnterOnKeyboard()
    {
        homePage.acceptCookies();
        homePage.inputField("lenovo");
        homePage.keyEnter();
        Assert.assertEquals(homePage.searchResults(), "Lenovo");
    }

    @Test
    public void verifySearchItemAndRemoveTypedUsingXButton()
    {
        homePage.acceptCookies();
        homePage.inputField("Panasonic SC-TMAX40 audio sistem 1200W");
        homePage.removeInput();
        Assert.assertEquals(homePage.inputInfo(), "");

    }

    @Test
    public void verifySearchingResultOfTwoProducts()
    {
        homePage.acceptCookies();
        homePage.inputField("lenovo thinkpad x1");
        homePage.clickSearch();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ctshop.rs/search?pretrazi=lenovo%20thinkpad%20x1");
        homePage.clickLenovo();
        Assert.assertEquals(homePage.productName(), "Lenovo ThinkPad X1 Carbon G10 (21CB005YCX) laptop Intel® Deca Core™ i7 1255U 14\" WQUXGA 16GB 1TB SSD Intel® Iris Xe Win11 Pro crni");
        homePage.inputField("samsung galaxy flip 5");
        homePage.keyEnter();
        homePage.clickSamsung();
        Assert.assertEquals(homePage.productName(), "Samsung Galaxy Flip 5 8GB/512GB mint mobilni 6.7\" Octa Core Snapdragon 8 Gen 2 8GB 512GB 12Mpx+12Mpx");
    }
}
