package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;

public class LoginPage {


    // Page Object Model is used for maintainability of the WebElements


    // Constructor
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


//        private WebElement usernameField = Driver.getDriver().findElement(By.id("ctl00_MainContent_username"));
    // Non-Page Factory style POM
    @FindBy(id = "ctl00_MainContent_username")
    private WebElement usernameField;




    public WebElement getUsernameField() {
        return usernameField;
    }

    public void loginWithValidCredentials(){
        login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
    }

    public void login(String username, String password){
        usernameField.sendKeys(username, Keys.TAB, password, Keys.ENTER);
    }




}
