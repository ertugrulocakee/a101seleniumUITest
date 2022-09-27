package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SockDetailPageObjectModel extends BasePageObjectModel{

    By color = By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/span");

    By addBasket = By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button");

    By showBasket  = By.xpath("/html/body/div[2]/div/div[1]/div/div[3]/a[3]");

    public SockDetailPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  boolean isSelectedSockBlack(){

        System.out.println(findElement(color).getText());

        if(findElement(color).getText().contains("SİYAH")){

            return true;


        }

        return  false;

    }

    public  void addBasket(){


        select(addBasket);

    }

    public  void showBasket(){

        averageStop();

        select(showBasket);

    }



}
