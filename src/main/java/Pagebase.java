import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pagebase {
    protected WebDriver driver;

    public Pagebase(WebDriver driver) {
        this.driver = driver;
    }

    public static void Clicking(WebElement element) {
        element.click();
    }

    public static void Sendtext(WebElement element, String text) {
        element.sendKeys(text);

    }
    public static String Getext(WebElement element){
        return   element.getText();

    }
}