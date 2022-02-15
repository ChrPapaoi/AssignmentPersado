package pages;

import com.persado.oss.quality.stevia.selenium.core.WebComponent;

public class AmazonHomePageObject extends WebComponent {
    public enum Locators {
        NAV_BAR_GIFT_CARDS ("//a[@data-csa-c-slot-id='nav_cs_3']"),
        TOASTER ("//*[@id='glow-toaster-body']"),
        TOASTER_DISMISS_BTN ("//input[@data-action-type='DISMISS' and contains(@data-action-params,'AIS_INGRESS')] ");

        private String locator;

        Locators(String locator) {
            this.locator = locator;
        }

        public String get() {
            return this.locator;
        }
    }

    public void clickOnGiftCardNav() {
        if (toasterExists()) {
            toasterDismiss();
        }
        controller().click(Locators.NAV_BAR_GIFT_CARDS.get());
    }

    private boolean toasterExists() {
        return controller().isComponentPresent(Locators.TOASTER.get());
    }

    private void toasterDismiss() {
        controller().click(Locators.TOASTER_DISMISS_BTN.get());
    }
}
