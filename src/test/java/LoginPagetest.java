import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPagetest extends PageBasetest {


    Homepage homepage;
    Loginpage loginpage;
    Rigisterpage rigisterpage;
    JavascriptExecutor js;

    @Test
            (priority = 1)
    public void Emptysign() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        driver.get("https://automationexercise.com/");
        loginpage = homepage.Clickingsigninbutton();
        loginpage.SendtextEMPEmailAdreess("");
        loginpage.SendtextnSighnName("");
        loginpage.ClickingSignButton();
        Thread.sleep(3000);

    }

    @Test
            (priority = 2)

    public void invalid() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        //driver.get("https://automationexercise.com/");
        loginpage = homepage.Clickingsigninbutton();
        loginpage.SendtextEMPEmailAdreess("Mahmoudadel");
        loginpage.SendtextnSighnName("");
        loginpage.ClickingSignButton();
        Thread.sleep(3000);
    }

    @Test
            (priority = 3)

    public void Valid() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        //driver.get("https://automationexercise.com/");
        loginpage = homepage.Clickingsigninbutton();
        loginpage.SendtextEMPEmailAdreess("M.Adel97@gmail.com");
        loginpage.SendtextnSighnName("Mahhmoud adel");
        loginpage.ClickingSignButton();
        Thread.sleep(3000);
    }

    @Test
            (priority = 4)
    public void Rigister() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        rigisterpage = new Rigisterpage(driver);
        //driver.get("https://automationexercise.com/");
        homepage.Clickingsigninbutton();
        loginpage.SendtextnSighnName("Mahhmoud adel");
        loginpage.SendtextEMPEmailAdreess("M.Adel97@gmail.com");
        loginpage.ClickingSignButton();
        rigisterpage.Clickingbuttongender();
        rigisterpage.sendtextpassword("1234567890");
        rigisterpage.ClickingDay();
        rigisterpage.Clickingmonth();
        rigisterpage.ClickingYear();
        rigisterpage.ClickingSignupselect();
        rigisterpage.ReciveButton();
        rigisterpage.Fname("Mahmoud");
        rigisterpage.Lname("Attia");
        rigisterpage.Company("Egypt");
        rigisterpage.Address("benha");
        rigisterpage.Address2(" 11 HASSAM  STREET ");
        rigisterpage.State("Cairo");
        rigisterpage.City("Qalyobia");
        rigisterpage.zipcode("123");
        rigisterpage.Phonenum("012881249909");
        rigisterpage.Country();
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 700)");
        Thread.sleep(2000);
        rigisterpage.Createaccbutton();
        Thread.sleep(3000);
        rigisterpage.Contbutton();
        Thread.sleep(3000);
        homepage.LogoutButton();
    }
@Test
        (priority = 5)
    public void invalidLog() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        //driver.get("https://automationexercise.com/");
        loginpage = homepage.Clickingsigninbutton();
        loginpage.SendtextLoginelment("M.Adel97@gmail.com");
        loginpage.SendtextPasswordLog("");
        loginpage.ClickingLoginButton();
        Thread.sleep(3000);
    }
    @Test
            (priority = 6)
    public void validLog() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        //driver.get("https://automationexercise.com/");
        loginpage = homepage.Clickingsigninbutton();
        loginpage.SendtextLoginelment("M.Adel97@gmail.com");
        loginpage.SendtextPasswordLog("1234567890");
        loginpage.ClickingLoginButton();
        Thread.sleep(3000);
    }
}

