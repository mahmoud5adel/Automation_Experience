import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class PageBasetest {

        protected WebDriver driver ;

        @BeforeClass
        public void setup(){

            driver = new ChromeDriver();
            driver.manage().window().maximize();
          //  driver.get("https://automationexercise.com/");
        }


        @AfterClass
        public void quit(){
            driver.quit();
        }
    }
