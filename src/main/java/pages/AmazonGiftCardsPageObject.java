package pages;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

import java.util.Random;

public class AmazonGiftCardsPageObject extends WebComponent {
    enum Locators {
        PRINT_AT_HOME_IMG ("//a[@aria-label='Print at home']"),
        PRINT_AT_HOME_GET_STARTED ("//a[contains(text(),'Get started')]");

        private String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return this.locator = locator;
        }
    }

    public void clickOnPrintAtHome() {

        boolean path = new Random().nextBoolean();

        if (path)
            controller().click(Locators.PRINT_AT_HOME_IMG.get());
        else
            controller().click(Locators.PRINT_AT_HOME_GET_STARTED.get());
    }
}


