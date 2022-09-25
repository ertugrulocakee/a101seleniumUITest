package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjectModel extends  BasePageObjectModel{

    By moveWithoutIdentityButton = By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a");


    public LoginPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void  scrollDownAndMoveWithoutIdentity(){

        scrollDown();
        longStop();
        select(moveWithoutIdentityButton);

    }



}
