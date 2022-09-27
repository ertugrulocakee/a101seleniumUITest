package PageObjectModels;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class OrdersPageObjectModel extends  BasePageObjectModel{

    By addAdressButton = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
    By adressTitleInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input");
    By nameInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input");
    By surnameInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input");
    By phoneInput = new By.ByCssSelector("input.js-phone-number");
    By citiesList =  By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select");
    By istanbulOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]");
    By townShipList = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select");
    By kagithaneOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[25]");
    By districtList = By.xpath("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select");
    By gurselOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select/option[6]");
    By adressInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea");

    By saveAdressButton = new By.ByCssSelector("button.button.green.js-set-country.js-prevent-emoji");

    By saveAndMoveButton = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");

    By garantiPayButton = By.xpath("/html/body/section/section/div/div[3]/div[1]/div[2]");

    By confirmAgreement = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[3]/div[3]/label/div[1]/input");

    By payWithGarantiPayButton = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[3]/div[4]/a");

    By timeCounterGarantiPay = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/form/div[2]/div/div[1]/div");

    public OrdersPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void addAdress(){

        Faker faker = new Faker();

        averageStop();
        select(addAdressButton);
        shortStop();
        findElement(adressTitleInput).sendKeys("Ev Adresim");
        shortStop();
        findElement(nameInput).sendKeys(faker.name().firstName());
        shortStop();
        findElement(surnameInput).sendKeys(faker.name().lastName());
        shortStop();
        findElement(phoneInput).sendKeys(faker.phoneNumber().subscriberNumber(11));
        shortStop();
        select(citiesList);
        shortStop();
        select(istanbulOption);
        shortStop();
        select(townShipList);
        shortStop();
        select(kagithaneOption);
        shortStop();
        select(districtList);
        shortStop();
        select(gurselOption);
        shortStop();

        findElement(adressInput).sendKeys(faker.address().fullAddress());

        shortStop();

        findElement(saveAdressButton).sendKeys(Keys.ENTER);

        averageStop();

        select(saveAndMoveButton);

        averageStop();

        select(garantiPayButton);

        averageStop();

        select(confirmAgreement);

        averageStop();

        select(payWithGarantiPayButton);


    }

    public  boolean isOnGarantiPayPage(){

        longStop();

        return  isDisplayed(timeCounterGarantiPay);

    }

}
