import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage extends Pagebase
  {

    public Loginpage(WebDriver driver) {
      super(driver);
    }


    //sign in

    By SighnName = By.xpath("/html/body/section/div/div/div[3]/div/form/input[2]");
    WebElement SighnNameelment;

    public void SendtextnSighnName (String Name ){
      SighnNameelment = driver.findElement(SighnName);
      Sendtext(SighnNameelment , Name );
    }



    By EmailAdreess = By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    WebElement EmailAdreessElment;

    public void SendtextEMPEmailAdreess  (String mail  ) {
      EmailAdreessElment  =driver.findElement(EmailAdreess);
      Sendtext(EmailAdreessElment  , mail );

    }


    By SignButton = By.xpath("/html/body/section/div/div/div[3]/div/form/button");
    WebElement SignButtonelment ;

    public void ClickingSignButton  () {
      SignButtonelment  = driver.findElement(SignButton);
      Clicking(SignButtonelment);
    }

    //login

    By Login  = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    WebElement Loginelment;

    public void SendtextLoginelment (String EMAIL ){
      Loginelment = driver.findElement(Login);
      Sendtext(Loginelment , EMAIL );
    }

    By PasswordLog = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]");
    WebElement PasswordLogElment;

    public void SendtextPasswordLog  (String Pass  ) {
      PasswordLogElment  =driver.findElement(PasswordLog);
      Sendtext(PasswordLogElment  , Pass );

    }

    By LoginButton = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    WebElement LoginButtonnelment ;


public void ClickingLoginButton  () {
  LoginButtonnelment  = driver.findElement(LoginButton);
  Clicking(LoginButtonnelment);
}
  }
