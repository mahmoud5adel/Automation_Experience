import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasePage extends Pagebase {


    public TestCasePage(WebDriver driver) {
        super(driver);
    }

    By TSCValidPage = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    WebElement TSCValidPageelment;

    public void TSCValidPage() {
        TSCValidPageelment = driver.findElement(TSCValidPage);
        Clicking (TSCValidPageelment );

    }

    By getTSCValidPge =By.xpath("//*[@id=\"form\"]/div/div[1]/div/h2/b");
    WebElement getTSCValidPgeelement;


    public String getTSCValidPge()
    {
        getTSCValidPgeelement = driver.findElement(getTSCValidPge);

        return Getext(getTSCValidPgeelement);
    }
}




