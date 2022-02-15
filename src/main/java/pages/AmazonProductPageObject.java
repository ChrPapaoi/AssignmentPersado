package pages;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AmazonProductPageObject extends WebComponent {
    public enum Locators {
        POP_UP ("//*[@id='a-popover-gc-design-picker']"),
        CLOSE_BTN ("//*[@id='gc-ciu-close-popover-button']"),
        STD_DESIGN ("//*[@id='gc-customization-type-button-Designs']"),
        CARD_LIST ("//li[contains(@class, 'gc-mini-designs')]"),
        PRICE ("//*[@id='gc-amount-mini-picker']//span[contains(@class, 'a-button-selected')]//button"),
        ADD_TO_CART ("//*[@id='gc-buy-box-atc']");

        private final String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return this.locator;
        }
    }

    public enum Design {
        STANDARD
    }

    public void selectGiftCardDesign(Design design) {
        if (popUpExists()) {
            popUpDismiss();
        }

        if (design == Design.STANDARD) {
            controller().click(Locators.STD_DESIGN.get());
        }
    }

    private boolean popUpExists() {
        controller().isComponentPresent(Locators.POP_UP.get());
        return false;
    }

    private void popUpDismiss() {
        controller().click(Locators.CLOSE_BTN.get());
    }

    public void selectGiftCard(int cardIndex) {
        List<WebElement> cardList = controller().findElements(Locators.CARD_LIST.get());

        WebElement selectedCard = cardList.get(cardIndex);
        selectedCard.click();
    }

    public String getPrice() {
        List<WebElement> prices = controller().findElements(Locators.PRICE.get());
        return prices.get(0).getText();
    }

    public void addToCart() {
        controller().click(Locators.ADD_TO_CART.get());
    }
}
