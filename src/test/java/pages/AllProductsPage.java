package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class AllProductsPage {



    public AllProductsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public List<WebElement> getHeaderCells() {
        return headerCells;
    }

    @FindBy(xpath = "//table[@class='ProductsTable']//th")
    private List<WebElement> headerCells;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr//td[1]")
    private List<WebElement> productNameCells;

    public List<WebElement> getProductNameCells() {
        return productNameCells;
    }


}
