import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends Pagebase{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By productButton = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a");
    WebElement productButtonelement ;

    By SearchBox = By.xpath("//*[@id=\"search_product\"]");
    WebElement SearchBoxelement ;

    By SearchButton = By.xpath("//*[@id=\"submit_search\"]");
    WebElement SearchButtonelement ;

    By ViewProduct = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[2]/ul/li/a");
    WebElement ViewProductelement ;

    By Quantity = By.xpath("//*[@id=\"quantity\"]");
    WebElement Quantityelement ;

    By ADDCart = By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button");
    WebElement ADDCartelement ;

    By YURNameReview = By.xpath("//*[@id=\"name\"]");
    WebElement YURNameReviewelement ;

    By MailReview = By.xpath("//*[@id=\"email\"]");
    WebElement MailReviewelement ;

    By AddReview = By.xpath("//*[@id=\"review\"]");
    WebElement AddReviewelement ;

    By AddedOK = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    WebElement AddedOKelement ;

    By SubmetReview = By.xpath("//*[@id=\"button-review\"]");
    WebElement SubmetReviewelement ;





    public void CProductButton(){
        ViewProductelement =driver.findElement(productButton);
        Clicking(ViewProductelement);

    }

    public void SearchBox(String Category) {
        SearchBoxelement = driver.findElement(SearchBox);
        Sendtext(SearchBoxelement , Category);
    }
    public void SearchButton (){
        SearchButtonelement =driver.findElement(SearchButton);
        Clicking(SearchButtonelement);
}

    public void ViewProduct(){
        productButtonelement =driver.findElement(ViewProduct);
        Clicking(productButtonelement);

    }

    public void Quantity(String QuantityA) {
        Quantityelement = driver.findElement(Quantity);
        Sendtext(Quantityelement , QuantityA);
    }
    public void ADDCart (){
        ADDCartelement =driver.findElement(ADDCart);
        Clicking(ADDCartelement);
    }
    public void YURNameReview(String Name){
        YURNameReviewelement =driver.findElement(YURNameReview);
        Sendtext(YURNameReviewelement , Name);

    }

    public void MailReview(String Mail) {
        MailReviewelement = driver.findElement(MailReview);
        Sendtext( MailReviewelement , Mail);
    }
    public void AddReview (String Review){
        AddReviewelement =driver.findElement(AddReview);
        Sendtext(AddReviewelement , Review);
    }

    public void AddedOK (){
        AddedOKelement =driver.findElement(AddedOK);
        Clicking(AddedOKelement );
    }
    public void SubmetReview (){
        SubmetReviewelement =driver.findElement(SubmetReview);
        Clicking(SubmetReviewelement);
    }
}

