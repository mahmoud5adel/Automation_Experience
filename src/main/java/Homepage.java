import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage extends Pagebase {


    public Homepage(WebDriver driver) {
        super(driver);
    }

    By signinbutton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    WebElement signinbuttonelment;

    public Loginpage Clickingsigninbutton() {
        signinbuttonelment = driver.findElement(signinbutton);
        Clicking(signinbuttonelment);
        return new Loginpage(driver);
    }

    By LogoutButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
    WebElement LogoutButtonelment;

    public void LogoutButton() {
        LogoutButtonelment = driver.findElement(LogoutButton);
        Clicking(LogoutButtonelment);

    }
}
