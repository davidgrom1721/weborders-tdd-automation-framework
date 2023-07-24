package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class OrderPage {


    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;
    @FindBy(name = "ctl00$MainContent$fmwOrder$txtName")
    private WebElement name;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement streetAddress;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement city;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement state;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zip;


    @FindBy(xpath = "//input[@type='radio']")
    private List<WebElement> radioButtons;


    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement card;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private WebElement expiry;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;


    public WebElement getQuantity() {
        return quantity;
    }

    public WebElement getName() {
        return name;
    }

    public WebElement getStreetAddress() {
        return streetAddress;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getState() {
        return state;
    }

    public WebElement getZip() {
        return zip;
    }

    public List<WebElement> getRadioButtons() {
        return radioButtons;
    }

    public WebElement getCard() {
        return card;
    }

    public WebElement getExpiry() {
        return expiry;
    }

    public WebElement getProcessButton() {
        return processButton;
    }


    public void enterText(String text, WebElement element){
        element.sendKeys(text);
    }


}
