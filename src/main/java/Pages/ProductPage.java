package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage {
    WebDriver driver;
    private By sizeOfOption = By.xpath("//div[@class='size-buttons-size-buttons']/div");
    private By addToBagButton = By.xpath("//div[contains(text(),'ADD TO BAG')]");
    private By goToBagButton = By.xpath("//span[contains(text(), 'GO TO BAG')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSize() {
        List<WebElement> productsElement = driver.findElements(sizeOfOption);
        //for S
        productsElement.get(0).click();
    }

    public void addToBag() {
        WebElement addToBagButtonElement = driver.findElement(addToBagButton);
        addToBagButtonElement.click();
        WebElement goToBagElement = driver.findElement(goToBagButton);
        goToBagElement.click();
    }
}
