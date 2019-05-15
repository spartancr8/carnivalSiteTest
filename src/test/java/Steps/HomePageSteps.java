package Steps;

import Pages.CarnivalHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class HomePageSteps {

    WebDriver driver;

    CarnivalHomePage objPage;


    @Given("^I am in the homepage$")
    public void startDriver(){

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.carnival.com");

    }

    @When("^I select cruises to Bahamas$")
    public void selectCruises(){

        objPage = new CarnivalHomePage(driver);
        objPage.clickSailTo();
        objPage.clickBahamasSailTo();
        objPage.clickDurationDropdown();
        objPage.clickSixToNineDaysButton();

    }

    @Then("^I can check the options sorted by price$")
    public void checkSortBuyPrice(){

        objPage.clickPriceDropDown();
        objPage.movePriceSlider();

    }

}
