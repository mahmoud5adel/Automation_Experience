import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.w3c.dom.Text;

public class TestCasePageTest extends  PageBasetest{


    Homepage homepage;
    Loginpage loginpage;
    Rigisterpage rigisterpage;
    TestCasePage testCasePage;
    SoftAssert softAssert;
    @Test
            (priority = 1)
    public void VlidTSC() throws InterruptedException {
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        testCasePage = new TestCasePage(driver);
        softAssert = new SoftAssert();
        driver.get("https://automationexercise.com/");
        testCasePage.TSCValidPage();
//        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        String TestCase = testCasePage.getTSCValidPge();
        softAssert.assertEquals(TestCase , "TEST CASES");
        System.out.println(TestCase);
        softAssert.assertAll();

    }
    }

