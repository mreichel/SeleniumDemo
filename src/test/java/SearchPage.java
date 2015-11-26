import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author milena
 * Page Object model of Google's search page
 */

public class SearchPage {

    protected WebDriver driver;
    //Selenium sucht das Element mit passenden Namen bzw. passender ID. Braucht man
    //mehr Kontrolle kann man auch die Annotations verwenden oder per Methode suchen
    //WebElement element = driver.findElement(By.name("q"));
    //@FindBy(name="q")
    private WebElement q;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open(String url) {
        driver.get(url);
    }

    public void close() {
        driver.quit();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void searchForTerm(String searchTerm) {
        q.sendKeys(searchTerm);
        q.submit();
    }
}