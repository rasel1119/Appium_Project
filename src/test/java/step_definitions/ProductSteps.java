package step_definitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page_objects.Login;
import page_objects.Products;

public class ProductSteps {
    AppiumDriver driver = Hooks.driver;
    @Given("^the user is on the product page upon successful login$")
    public void theUserIsOnTheProductPageUponSuccessfulLogin() {
        new Login(driver)
                .enterUserName("problem_user")
                .enterPassword("secret_sauce")
                .clickOnLoginButton();
    }

    @Then("^validate the product is listed with title \"(.+?)\" and price \"(.+?)\"$")
    public void validateTheProductIsListedWithTittleAndPrice(String title, String price) {
        new Products(driver)
                .tShirtText(title)
                .tShirtPrice(price);
    }

    @When("^user clicks on product title \"(.+?)\"$")
    public void userClicksOnProductTitle(String title) {
        new Products(driver)
                .backPackTitle(title);
    }

    @Then("^user should be on product details page with title \"(.+?)\", price\"(.+?)\" and description \"(.+?)\"$")
    public void userShouldBeOnProductDetailsPageWithTitlePriceAnd(String title, String price, String description) {
        new Products(driver)
                .backPackTitle(title)
                .backPackPrice(price)
                .backpackDescription(description);
    }
}
