import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePagetest extends PageBasetest{
  Homepage homepage ;
  @Test
    public void SIGNIN(){
    homepage = new Homepage(driver);
    homepage.Clickingsigninbutton();

  }


}

