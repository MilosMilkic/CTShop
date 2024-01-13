import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;


public class SearchTest extends BaseTest{

    public final String lenovoSearch = "lenovo thinkpad";
    public final String samsungSearch = "samsung";

    @Test
    public void verifySearchItems()
    {
        homePage.acceptCookies();
        homePage.inputField(lenovoSearch);
        homePage.keyEnter();

        List<String> actualItems = searchResultPage.searchResultItemsActualText();
        List<String> expectedItems = searchResultPage.searchResultItemsExpectedText(lenovoSearch);

        Assert.assertEquals(expectedItems, actualItems);
        System.out.println("Expected:" + expectedItems.size());
        System.out.println("Actual:" + actualItems.size());

    }

    @Test
    public void verifySearchItemsUsingEnterOnKeyboard()
    {
        homePage.acceptCookies();
        homePage.inputField(samsungSearch);
        homePage.keyEnter();

        List<String> actualItems = searchResultPage.searchResultItemsActualText();
        List<String> expectedItems = searchResultPage.searchResultItemsExpectedText(samsungSearch);

        Assert.assertEquals(expectedItems, actualItems);
        System.out.println("Expected:" + expectedItems);
        System.out.println("Actual:" + actualItems);

    }

    @Test
    public void verifySearchItemAndRemoveTypedUsingXButton()
    {
        homePage.acceptCookies();
        homePage.inputField(lenovoSearch);
        homePage.removeInput();
        Assert.assertEquals(homePage.inputInfo(), "");

    }

    @Test
    public void verifySearchingResultOfTwoProducts()
    {
        homePage.acceptCookies();
        homePage.inputField("lenovo thinkpad x1");
        homePage.clickSearch();
        homePage.clickLenovo();
        Assert.assertEquals(homePage.productName(), "Lenovo ThinkPad X1 Yoga Gen 8 (21HQ0055YA) 2u1 laptop Intel® Deca Core™ i7 1355U 14\" WUXGA touch 32GB 1TB SSD Intel® Iris Xe Win11 Pro sivi");
        homePage.inputField("samsung galaxy flip 5");
        homePage.keyEnter();
        homePage.clickSamsung();
        Assert.assertEquals(homePage.productName(), "Samsung Galaxy Flip 5 8GB/512GB lavanda mobilni 6.7\" Octa Core Snapdragon 8 Gen 2 8GB 512GB 12Mpx+12Mpx");
    }
}
