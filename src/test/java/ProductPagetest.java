import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductPagetest extends PageBasetest{
    Homepage homepage;
    Rigisterpage rigisterpage;
    Loginpage loginpage;
    ProductPage productPage;
    SoftAssert softAssert;

    @Test
    public void Product() throws InterruptedException {
        homepage = new Homepage(driver);
        rigisterpage =new Rigisterpage(driver);
        loginpage = new Loginpage(driver);
        productPage =new ProductPage(driver);
        driver.get("https://automationexercise.com/");
        productPage.CProductButton();

        productPage.SearchBox("MEN");
        productPage.SearchButton();
        productPage.ViewProduct();
      //  driver.switchTo().alert().
        Thread.sleep(3000);
        productPage.Quantity("1");
        productPage.ADDCart();
        Thread.sleep(3000);
        productPage.YURNameReview("Mahmoud");
        productPage.MailReview("Mahmoudadel@gmail.com");
        productPage.AddReview("Its very good item");
        Thread.sleep(3000);
        productPage.AddedOK();
        productPage.SubmetReview();

    }
}
