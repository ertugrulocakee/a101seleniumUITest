package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPageObjectModel extends  BasePageObjectModel{

    By confirmBasket = By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a");

    public BasketPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void  scrollDownAndConfirmBasket(){

        scrollDown();
        select(confirmBasket);

    }

}
