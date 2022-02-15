package pages;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonCartPageObject extends WebComponent {
    public enum Locators {
        PRICE_FROM_CART ("//span[contains(@class, 'sc-product-price')]");

        private String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return this.locator;
        }
    }

    public String getPriceFromCart() {
        List<WebElement> priceFromCart = controller().findElements(Locators.PRICE_FROM_CART.get());
        return priceFromCart.get(0).getText();
    }
}
