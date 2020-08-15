package smoke;

import org.junit.Test;
import pageObject.LandingPage;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class HomePageTest extends FunctionalTest {

    LandingPage landingPage = new LandingPage(driver);

    @Test
    public void sampleTest() {
        assertThat(landingPage.getPageTitle(), is("Argos Logo - Load homepage"));
    }
}
