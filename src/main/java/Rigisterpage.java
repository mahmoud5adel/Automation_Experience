import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.w3c.dom.Text;

public class Rigisterpage extends Pagebase {


    public Rigisterpage(WebDriver driver) {
        super(driver);
    }


    By Buttongender = By.xpath("//*[@id=\"id_gender1\"]");
    WebElement Buttongenderelment;


    By RPassword = By.xpath("//*[@id=\"password\"]");
    WebElement Rpasswordelment;


    By Day = By.xpath("//*[@id=\"days\"]/option[2]");
    WebElement Dayelment;

    By Month = By.xpath("//*[@id=\"months\"]/option[11]");
    WebElement Monthelment;


    By Year = By.xpath("//*[@id=\"years\"]/option[25]");
    WebElement Yearelment;


    By SignupSelect = (By.xpath("//*[@id=\"newsletter\"]"));
    WebElement Signupselectelment;

    By ReciveButton = (By.xpath("//*[@id=\"optin\"]"));
    WebElement Reciveselectelment;

    //ADressimfromation


    By Fname = (By.xpath("//*[@id=\"first_name\"]"));
    WebElement Firstnameelement;

    By Lname = (By.xpath("//*[@id=\"last_name\"]"));
    WebElement Lastnameelement;

    By Company = (By.xpath("//*[@id=\"company\"]"));
    WebElement Companyelement;


    By Address = (By.xpath("//*[@id=\"address1\"]"));
    WebElement Addresselement;

    By Adress2 = (By.xpath("//*[@id=\"address2\"]"));
    WebElement Address2element;

    By Country = (By.xpath("//*[@id=\"country\"]/option[2]"));
    WebElement Countryelment;

    By State = (By.xpath("//*[@id=\"state\"]"));
    WebElement Stateelement;

    By City = (By.xpath("//*[@id=\"city\"]"));
    WebElement Cityelement;

    By zipcode = (By.xpath("//*[@id=\"zipcode\"]"));
    WebElement Zipcodeelement;

    By Phonenum = (By.xpath("//*[@id=\"mobile_number\"]"));
    WebElement PhoneNumelement;

    By Createaccbutton = By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button");
    WebElement CreatAccelement;


    By Contbutton = By.xpath("//*[@id=\"form\"]/div/div/div/div/a");
    WebElement Contbuttonelement;

    By DeletAcc = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a");
    WebElement DeletAccelement;

    By ValiedDeeleacc = By.xpath("//*[@id=\"form\"]/div/div/div/h2/b");
    WebElement ValiedDeeleaccelement;


    public void Clickingbuttongender() {
        Buttongenderelment = driver.findElement(Buttongender);
        Clicking(Buttongenderelment);
    }

    public void sendtextpassword(String password) {
        Rpasswordelment = driver.findElement(RPassword);
        Sendtext(Rpasswordelment, password);
    }

    public void ClickingDay() {
        Dayelment = driver.findElement(Day);
        Clicking(Dayelment);

    }

    public void Clickingmonth() {
        Monthelment = driver.findElement(Month);
        Clicking(Monthelment);

    }

    public void ClickingYear() {
        Yearelment = driver.findElement(Year);
        Clicking(Yearelment);

    }


    public void ClickingSignupselect() {
        Signupselectelment = driver.findElement(SignupSelect);
        Clicking(Signupselectelment);
    }

    public void ReciveButton() {
        Reciveselectelment = driver.findElement(ReciveButton);
        Clicking(Reciveselectelment);
    }

    public void Fname(String name) {
        Firstnameelement = driver.findElement(Fname);
        Sendtext(Firstnameelement, name);
    }

    public void Lname(String LAname) {
        Lastnameelement = driver.findElement(Lname);
        Sendtext(Lastnameelement, LAname);
    }

    public void Company(String CompanyNAME) {
        Companyelement = driver.findElement(Company);
        Sendtext(Companyelement, CompanyNAME);
    }

    public void Address(String AddressName) {
        Addresselement = driver.findElement(Address);
        Sendtext(Addresselement, AddressName);
    }

    public void Address2(String Address2Name) {
        Address2element = driver.findElement(Adress2);
        Clicking(Address2element);
    }

    public void State(String Statename) {
        Stateelement = driver.findElement(State);
        Sendtext(Stateelement, Statename);
    }

    public void City(String CityName) {
        Cityelement = driver.findElement(City);
        Sendtext(Cityelement, CityName);
    }

    public void zipcode(String zipcodeNum) {
        Zipcodeelement = driver.findElement(zipcode);
        Sendtext(Zipcodeelement, zipcodeNum);
    }

    public void Phonenum(String PhomeNumber) {
        PhoneNumelement = driver.findElement(Phonenum);
        Sendtext(PhoneNumelement, PhomeNumber);
    }

    public void Country() {
        Countryelment = driver.findElement(Day);
        Clicking(Countryelment);

    }

    public void Createaccbutton() {
        CreatAccelement = driver.findElement(Createaccbutton);
        Clicking(CreatAccelement);
    }

    public void Contbutton() {
        Contbuttonelement = driver.findElement(Contbutton);
        Clicking(Contbuttonelement);
    }

    public void DeletAcc() {
        DeletAccelement = driver.findElement(DeletAcc);
        Clicking(DeletAccelement);
    }

    public String ValiedDeeleacc()
    {
        ValiedDeeleaccelement = driver.findElement(ValiedDeeleacc);

        return Getext(ValiedDeeleaccelement);
    }
}

