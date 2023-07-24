package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class AllOrdersPage {


    public AllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Order")
    private WebElement orderLink;



    @FindBy(linkText = "View all orders")
    private WebElement viewAllOrderLink;

    @FindBy(linkText = "View all products")
    private WebElement viewAllProductsLink;

    @FindBy(xpath = "//table[@class='SampleTable']//tr[2]//td")
    private List<WebElement> cells;

    public String getCellText(int cellNumber){
        return cells.get(cellNumber-1).getText();
    }



    public WebElement getOrderLink() {
        return orderLink;
    }


        public WebElement getViewAllOrderLink() {
            return viewAllOrderLink;
        }


    public WebElement getViewAllProductsLink() {
        return viewAllProductsLink;
    }
}
