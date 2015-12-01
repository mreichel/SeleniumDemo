import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author milena
 * Selenium Test using Page Objects and @link{org.openqa.selenium.support.PageFactory}
 */
public class SearchPageTest {


    private SearchPage page;

    @Before
    public void openTheBrowser() {
        page = PageFactory.initElements(new HtmlUnitDriver(), SearchPage.class);
        page.open("http://www.google.de/");
    }

    @After
    public void closeTheBrowser() {
        page.close();
    }

    @Test
    public void userSearchForFlensburgTest() {
        page.searchForTerm("flensburg");
        assertThat(page.getTitle(), containsString("flensburg") );

    }

}
