package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class SocksPageObjectModel extends  BasePageObjectModel{

    By favIcon = By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/div[1]");

    By count = By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/div[2]/div[2]");


    public SocksPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  boolean isOnSocksPage(){

        return  isDisplayed(favIcon);

    }

    private List<WebElement> getAllSocks(){

        return  findAllElements(count);

    }

    public void selectSock(){

        Random r=new Random();
        int number =r.nextInt(getAllSocks().size());

        getAllSocks().get(number).click();

    }



}
