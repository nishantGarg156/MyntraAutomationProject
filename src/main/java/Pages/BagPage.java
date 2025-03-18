package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BagPage {
    WebDriver driver;

    private By cartItems = By.cssSelector(".itemContainer-base-item");

    public BagPage(WebDriver driver) {
        this.driver = driver;
    }

    public int bagItemCount() {
        return driver.findElements(cartItems).size();
    }

}

