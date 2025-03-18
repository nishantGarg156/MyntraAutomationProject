package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;
    private By serachBar = By.xpath("//input[@placeholder='Search for products, brands and more']");
    private By products = By.xpath("//li[@class='product-base']");
    //  private By serachBarButton = By.xpath("//a[@class='desktop-submit']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void serachForProduct(String productName) {
        WebElement serachBarElement = driver.findElement(serachBar);
        serachBarElement.sendKeys(productName);
        serachBarElement.sendKeys(Keys.ENTER);

    }

    public void selectFirstProducts() {
        WebElement productsElement = driver.findElement(products);
        String mainWindowHandle = driver.getWindowHandle();
        productsElement.click();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }

    }
}
