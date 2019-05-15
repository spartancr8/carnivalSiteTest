package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarnivalHomePage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"cdc-destinations\"]/span/span[1]")
    WebElement sailTo;

    @FindBy(xpath = "//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[2]/ccl-cruise-search-bar/div/div[2]/div[1]/div/div/ccl-search-bar-expandable-filter/div/ul/li[2]/button")
    WebElement bahamasSailTo;

    @FindBy(xpath = "//*[@id=\"cdc-durations\"]/span/span[1]")
    WebElement durationDropdown;

    @FindBy(xpath = "//*[@id=\"ccl-cruise-search\"]/ccl-cruise-search/div[2]/ccl-cruise-search-bar/div/div[2]/div[1]/div/div/ul/li[2]/button")
    WebElement sixToNineDaysButton;

    @FindBy(xpath = "//*[@id=\"sfn-nav-pricing\"]/span[2]")
    WebElement priceDropDown;

    @FindBy(xpath = "//*[@id=\"sfc-xfilters\"]/ccl-cruise-search-bar-xfilters-pricing/div/div/div/div[2]/div/div/div/span[3]")
    WebElement priceSlider;

    public CarnivalHomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void clickSailTo(){
        sailTo.click();
    }

    public void clickBahamasSailTo(){
        bahamasSailTo.click();
    }

    public void clickDurationDropdown(){
        durationDropdown.click();
    }

    public void clickSixToNineDaysButton(){
        sixToNineDaysButton.click();
    }

    public void clickPriceDropDown(){
        priceDropDown.click();
    }
    public void movePriceSlider(){
        Actions moveSlider = new Actions(driver);
        Action action = (Action) moveSlider.dragAndDropBy(priceSlider, 100, 0).build();
        action.perform();
    }

}
