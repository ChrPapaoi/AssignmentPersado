import com.persado.oss.quality.stevia.spring.SteviaTestBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.*;
import utils.Utils;

public class AddGiftCardToCartTest extends SteviaTestBase {

    @Autowired
    protected AmazonHomePageObject amazonHomePageObject;

    @Autowired
    protected AmazonGiftCardsPageObject amazonGiftCardsPageObject;

    @Autowired
    protected AmazonProductPageObject amazonProductPageObject;

    @Autowired
    protected AmazonProductAddedPageObject amazonProductAddedPageObject;

    @Autowired
    protected AmazonCartPageObject amazonCartPageObject;

    @Autowired
    protected Utils utils;

    @Test
    public void testIfSelectedPriceIsEqualToPriceInCart() {
        amazonHomePageObject.clickOnGiftCardNav();
        amazonGiftCardsPageObject.clickOnPrintAtHome();
        amazonProductPageObject.selectGiftCardDesign(AmazonProductPageObject.Design.STANDARD);
        amazonProductPageObject.selectGiftCard(3);
        String productPrice = amazonProductPageObject.getPrice();
        amazonProductPageObject.addToCart();
        amazonProductAddedPageObject.goToCart();
        String productPriceFromCart = amazonCartPageObject.getPriceFromCart();

        AssertJUnit.assertEquals("Card price on Cart list is NOT equal to selected price.\n", utils.sanitizePrice(productPrice), utils.sanitizePrice(productPriceFromCart));
    }
}
