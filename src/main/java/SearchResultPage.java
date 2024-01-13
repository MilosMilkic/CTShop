import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class SearchResultPage extends BasePage{
    @FindBy(className = "product-name")
    List<WebElement> searchResultItems;
    public SearchResultPage(WebDriver driver)
    {
        super(driver);
    }

    public List<String> searchResultItemsActualText()
    {
        return searchResultItems.stream()
                .map(element -> element.getText().toLowerCase())
                .collect(Collectors.toList());
    }

    public List<String> searchResultItemsExpectedText(String searchText)
    {
        return searchResultItemsActualText().stream()
                .filter(item -> item.contains(searchText))
                .collect(Collectors.toList());
    }
}
