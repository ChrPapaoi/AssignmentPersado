package pages;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

import java.util.Random;

public class AmazonProductAddedPageObject extends WebComponent {
    public enum Locators {
        GO_TO_CART ("//*[@id='sw-gtc']"),
        CART ("//*[@id='nav-cart-text-container']");

        private String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return this.locator;
        }
    }

    public void goToCart() {
        boolean path = new Random().nextBoolean();
        if (path) {
            controller().click(Locators.GO_TO_CART.get());
        } else {
            controller().click(Locators.CART.get());
        }
    }
}
