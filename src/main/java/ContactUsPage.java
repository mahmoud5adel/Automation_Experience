import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends Pagebase{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    By ContactUsButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a");
    WebElement ContactUsButtonelment;

    By Name = By.xpath("//*[@id=\"contact-us-form\"]/div[1]/input");
    WebElement Nameelement;

    By EmailUs = By.xpath("//*[@id=\"contact-us-form\"]/div[2]/input");
    WebElement EmailUselement;

    By Supject  = By.xpath("//*[@id=\"contact-us-form\"]/div[3]/input");
    WebElement Supjectelement;

    By YRMsg = By.xpath("//*[@id=\"message\"]");
    WebElement YRMsgelement;

    By UploadFile = By.xpath("//*[@id=\"contact-us-form\"]/div[5]/input");
    WebElement UploadFileelement;

    By Submit = By.xpath("//*[@id=\"contact-us-form\"]/div[6]/input");
    WebElement Submitelment;

    By Vliedmessage = By.xpath("//*[@id=\"contact-page\"]/div[2]/div[1]/div/div[2]");
    WebElement Vliedmessageelment;



    public void ContactUsButton () {
        ContactUsButtonelment = driver.findElement(ContactUsButton);
        Clicking(ContactUsButtonelment);
    }
    public void Name (String RName) {
        Nameelement = driver.findElement(Name);
        Sendtext(Nameelement , RName);
    }

    public void EmailUs (String Email) {
        EmailUselement = driver.findElement(EmailUs);
        Sendtext(EmailUselement, Email);
    }
    public void SupjectUs (String RSupject) {
        Supjectelement = driver.findElement(Supject);
        Sendtext(Supjectelement, RSupject);
    }

    public void YRMsg (String Message) {
        YRMsgelement = driver.findElement(YRMsg);
        Sendtext(YRMsgelement, Message);
    }
    public void UploadFile (String Filepath) {
        UploadFileelement = driver.findElement(UploadFile);
        Sendtext(UploadFileelement, Filepath);
    }
    public void Submit () {
        Submitelment = driver.findElement(Submit);
        Clicking(Submitelment);
    }
    public String Vliedmessage()
    {
        Vliedmessageelment = driver.findElement(Vliedmessage);

        return Getext(Vliedmessageelment);
    }
}
