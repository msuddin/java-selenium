package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

public class LandingPage extends PageObject {

    @FindBy(id ="argos-logo")
    private WebElement pageTitle;

    public LandingPage(WebDriver driver) {
        super(driver);
        assertTrue(this.isInitialized());
    }

    public boolean isInitialized() {
        return this.pageTitle.isDisplayed();
    }

    public String getPageTitle() {
        return this.pageTitle.getText();
    }
}
