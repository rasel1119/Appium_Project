package page_objects;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class Products {
    private static final Logger LOGGER = LogManager.getLogger(Login.class);

    private static final String SauceLabsBackpackLocator = "(//android.view.ViewGroup[@content-desc='test-Item'])[1]/android.view.ViewGroup/android.widget.ImageView";
    private static final String TShirtPriceLocator = "(//android.widget.TextView[@content-desc='test-Price'])[3]";
    private static final String SauceLabsTShirtLocator = "(//android.view.ViewGroup[@content-desc='test-Item'])[3]/android.view.ViewGroup/android.widget.ImageView";
    private static final String BackpackPriceLocator = "(//android.widget.TextView[@content-desc='test-Price'])[1]";
    private static final String BackpackDescriptionLocator = "'//android.view.ViewGroup[@content-desc='test-Description']/android.widget.TextView[2]'";

    private AppiumDriver driver;

    public Products(AppiumDriver driver) {
        this.driver = driver;
    }

    public Products tShirtPrice(String expected) {
        String actual = driver.findElementByXPath(TShirtPriceLocator).getText();
        Assert.assertEquals(expected, actual);
        LOGGER.debug("Entered T-Shirt Price is: " + actual);
        return this;
    }

    public Products tShirtText(String expected) {
        String actual = driver.findElementByXPath(SauceLabsTShirtLocator).getText();
        Assert.assertEquals(expected, actual);
        LOGGER.debug("Entered T-Shirt Title: " + actual);
        return this;
    }

    public Products backPackTitle(String expected) {
        String actual = driver.findElementByXPath(SauceLabsBackpackLocator).getText();
        Assert.assertEquals(expected, actual);
        LOGGER.debug("Backpack text is: " + actual);
        return this;
    }

    public Products backPackPrice(String expected) {
        String actual = driver.findElementByXPath(BackpackPriceLocator).getText();
        Assert.assertEquals(expected, actual);
        LOGGER.debug("Entered Backpack price: " + actual);
        return this;
    }

    public Products navigateToTheBackpack(String expected) {
        driver.findElementByXPath(SauceLabsBackpackLocator).click();
        return this;
    }

    public Products backpackDescription(String expected) {
        String actual = driver.findElementByAccessibilityId(BackpackDescriptionLocator).getText();
        Assert.assertEquals(expected, actual);
        LOGGER.debug("Validating Description: " + actual);
        return this;
    }

}