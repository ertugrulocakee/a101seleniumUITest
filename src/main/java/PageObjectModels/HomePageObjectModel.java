package PageObjectModels;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePageObjectModel  extends  BasePageObjectModel{


    By popupCookie = By.id("CybotCookiebotDialog");

    By allowCookieButton = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    By slider = new By.ByCssSelector("img.slider-image.slider-image-big");

    By clothes =  By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a");

    By underKneeSocks = By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/div/div[2]/div/div/div[1]/ul[2]/li[8]/a");

    By aboutUs = By.xpath("/html/body/section/header/div/div[2]/div[1]/div/a[1]");

    public HomePageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void allowPopup(){


        if (isDisplayed(popupCookie)){

            select(allowCookieButton);

        }

    }


    public boolean isOnHomePage(){

        return  isDisplayed(slider);

    }


    public  void goToProductsList(){

        moveToElement(clothes);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(underKneeSocks)).click();

        select(aboutUs);

        driver.get("https://www.a101.com.tr/");

        moveToElement(clothes);

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(underKneeSocks)).click();


    }

}
