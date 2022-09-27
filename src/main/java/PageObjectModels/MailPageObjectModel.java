package PageObjectModels;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MailPageObjectModel extends  BasePageObjectModel{

    By inputEmail = By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input");

    By moveWithEmailButton = By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button");


    public MailPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public void writeEmailAndMove(){

        Faker faker = new Faker();

        shortStop();
        findElement(inputEmail).sendKeys(faker.internet().emailAddress());
        shortStop();
        select(moveWithEmailButton);

    }

}
