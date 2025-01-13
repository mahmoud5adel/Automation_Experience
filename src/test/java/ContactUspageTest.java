import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUspageTest extends PageBasetest{
    Homepage homepage;
    Loginpage loginpage;
    Rigisterpage rigisterpage;
    ContactUsPage contactUsPage;
    SoftAssert softAssert;
    @Test

    public void ContacsUS ()throws InterruptedException{
        homepage = new Homepage(driver);
        loginpage = new Loginpage(driver);
        rigisterpage = new Rigisterpage(driver);
        contactUsPage =new ContactUsPage(driver);
        softAssert = new SoftAssert();
        driver.get("https://automationexercise.com/");
        contactUsPage.ContactUsButton();
        contactUsPage.Name("Mahmoud");
        contactUsPage.EmailUs("Mahmoudadel@Gmail.com");
        contactUsPage.SupjectUs("Facingproplem");
        Thread.sleep(3000);
        contactUsPage.YRMsg("Urgent");
        Thread.sleep(3000);
        contactUsPage.UploadFile("C:\\Users\\mahmoud.elaadl\\Desktop\\NEW VERSION SI BETA TSC.csv");
        Thread.sleep(3000);
        contactUsPage.Submit();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        String SuccessYourdetailshavebeensubmittedsuccessfully = contactUsPage.Vliedmessage();
        softAssert.assertEquals(SuccessYourdetailshavebeensubmittedsuccessfully , "Success! Your details have been submitted successfully.");
        System.out.println(SuccessYourdetailshavebeensubmittedsuccessfully);


    }


}
