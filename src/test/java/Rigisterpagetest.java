import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Rigisterpagetest extends PageBasetest{

    Homepage homepage;
    Loginpage loginpage;
    Rigisterpage rigisterpage;
    JavascriptExecutor js;
    SoftAssert softAssert ;
    @Test
    public void Rigister () throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        rigisterpage = new Rigisterpage(driver);
        softAssert = new SoftAssert();
        driver.get("https://automationexercise.com/");
        homepage.Clickingsigninbutton();
        loginpage.SendtextnSighnName("Mahhmoud adel");
        loginpage.SendtextEMPEmailAdreess("mmm500@Gmail.com");
        loginpage.ClickingSignButton();
        rigisterpage.Clickingbuttongender();
        rigisterpage.sendtextpassword("1234567890");
        rigisterpage.ClickingDay();
        rigisterpage.Clickingmonth();
        rigisterpage.ClickingYear();
        rigisterpage.ClickingSignupselect();
        rigisterpage.ReciveButton();
        rigisterpage.Fname("Mahmoud");
        rigisterpage.Lname("Adel");
        rigisterpage.Company("Egypt");
        rigisterpage.Address("benha");
        rigisterpage.Address2(" 11 HASSAM SAPRY STREET ");
        rigisterpage.State("Cairo");
        rigisterpage.City("Qalyobia");
        rigisterpage.zipcode("123");
        rigisterpage.Phonenum("012881249909");
        rigisterpage.Country();
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(2000);
        rigisterpage.Createaccbutton();
      //  driver.switchTo().alert().accept();
        Thread.sleep(3000);
        rigisterpage.Contbutton();
        Thread.sleep(3000);
        rigisterpage.DeletAcc();
        String AccountDeleted = rigisterpage.ValiedDeeleacc();
        softAssert.assertEquals(AccountDeleted , "Account Deleted ");
        System.out.println(AccountDeleted);
        //softAssert.assertAll();
    }
}
