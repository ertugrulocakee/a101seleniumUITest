package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;


public class OrdersPageObjectModel extends  BasePageObjectModel{

    By addAdressButton = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a");
    By adressTitleInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[2]/div/div/label/input");
    By nameInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[1]/div/label/input");
    By surnameInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[3]/div[2]/div/label/input");
    By phoneInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[4]/div/div/label/input");
    By citiesList =  By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select");
    By istanbulOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]");
    By townShipList = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select");
    By kagithaneOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[25]");
    By districtList = By.xpath("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select");
    By gurselOption = By.xpath("/html/body/div[1]/div/div[2]/form/div[6]/label/div/select/option[6]");
    By adressInput = By.xpath("/html/body/div[1]/div/div[2]/form/div[7]/label/textarea");
    By saveAdressButton = By.xpath("/html/body/div[1]/div/div[2]/form/button[1]");

    By updateAdressButton = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[1]/li/label/div[1]/a");

    By closeAdressButton = By.xpath("/html/body/div[1]/div/div[2]/form/div[1]/div[1]/em[1]");

    By saveAndMoveButton = By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button");

    By garantiPayButton = By.xpath("/html/body/section/section/div/div[3]/div[1]/div[2]");

    By confirmAgreement = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[3]/div[3]/label/div[1]/input");

    By payWithGarantiPayButton = By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[3]/div[4]/a");

    By timeCounterGarantiPay = By.xpath("/html/body/div/div[2]/div[2]/div[2]/div[2]/div/form/div[2]/div/div[1]/div");

    public OrdersPageObjectModel(WebDriver webDriver) {
        super(webDriver);
    }

    public  void addAdress(){

        averageStop();
        select(addAdressButton);
        shortStop();
        findElement(adressTitleInput).sendKeys("Ertuğrul Ocak-EV");
        shortStop();
        findElement(nameInput).sendKeys("Ertuğrul");
        shortStop();
        findElement(surnameInput).sendKeys("Ocak");
        shortStop();
        findElement(phoneInput).sendKeys("5383227574");
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

        findElement(adressInput).sendKeys("İğdeli Bahçe Sokak - No:07 - Daire: 09");

        select(saveAdressButton);

        shortStop();

        findElement(adressInput).sendKeys(" 34400");

        shortStop();

        select(saveAdressButton);

        averageStop();

        select(saveAndMoveButton);

        longStop();

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
