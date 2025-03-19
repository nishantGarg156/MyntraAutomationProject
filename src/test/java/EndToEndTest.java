import Pages.BagPage;
import Pages.BasePage;
import Pages.HomePage;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends BasePage {
    HomePage homePage;
    ProductPage productPage;
    BagPage bagPage;

    @Test
    public void verifyProductsAddedToCart() {
        getDriver().get("https://www.flipkart.com/");
        homePage = new HomePage(getDriver());
        productPage = new ProductPage(getDriver());
        bagPage = new BagPage(getDriver());
        homePage.serachForProduct("Nike Shoes");
        homePage.selectFirstProducts();
        productPage.selectColour("Aqua");
        productPage.selectSize("M");
        productPage.addToBag();
        Assert.assertEquals(bagPage.bagItemCount(), 1, "Expected 1 item in the cart!");
    }
}
