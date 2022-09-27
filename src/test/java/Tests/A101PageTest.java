package Tests;

import PageObjectModels.*;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


public class A101PageTest  extends  BaseTest{

    HomePageObjectModel homePage;
    SocksPageObjectModel socksPage;

    SockDetailPageObjectModel sockDetailPage;

    BasketPageObjectModel basketPage;

    LoginPageObjectModel loginPage;

    MailPageObjectModel mailPage;

    OrdersPageObjectModel ordersPage;


    @Test
    @Order(1)
    public void openA101(){

        homePage = new HomePageObjectModel(driver);

        homePage.allowPopup();

        homePage.isOnHomePage();

        homePage.goToProductsList();

    }

    @Test
    @Order(2)
    public  void socksPage(){

        socksPage = new SocksPageObjectModel(driver);

        socksPage.isOnSocksPage();

        socksPage.selectSock();

    }

    @Test
    @Order(3)
    public  void sockDetailPage(){

        sockDetailPage = new SockDetailPageObjectModel(driver);

        sockDetailPage.isSelectedSockBlack();

        sockDetailPage.addBasket();

        sockDetailPage.showBasket();

    }

    @Test
    @Order(4)
    public void basketPage(){

        basketPage = new BasketPageObjectModel(driver);

        basketPage.scrollDownAndConfirmBasket();

    }

    @Test
    @Order(5)
    public  void loginPage(){

        loginPage = new LoginPageObjectModel(driver);

        loginPage.scrollDownAndMoveWithoutIdentity();

    }

    @Test
    @Order(6)
    public void mailPage(){

        mailPage = new MailPageObjectModel(driver);

        mailPage.writeEmailAndMove();

    }

    @Test
    @Order(7)
    public  void  ordersPage(){

        ordersPage = new OrdersPageObjectModel(driver);

        ordersPage.addAdress();

        ordersPage.isOnGarantiPayPage();


    }


}
