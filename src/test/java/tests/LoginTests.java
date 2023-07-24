package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;

public class LoginTests extends TestBase{




    @Test
    public void positiveLoginNonPage(){
        Driver.getDriver().findElement(By.id("ctl00_MainContent_username")).sendKeys(ConfigReader.getProperty("username"), Keys.TAB, ConfigReader.getProperty("password"), Keys.ENTER);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }

    @Test(groups = {"smoke"})
    public void positiveLoginUsingPageObjectModel(){
    //    LoginPage loginPage = new LoginPage();
        new LoginPage().loginWithValidCredentials();
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }


    @Test(groups = {"smoke"})
    public void negativeLoginInvalidUsername(){

        LoginPage loginPage = new LoginPage();
        loginPage.login("Invalid", ConfigReader.getProperty("password"));
        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }

    @Test
    public void negativeLoginInvalidPassword(){

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"), "Invalid");

        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }





    @Test
    public void negativeLoginNoPassword(){

        LoginPage loginPage = new LoginPage();
        loginPage.login(ConfigReader.getProperty("username"), "");

        Assert.assertNotEquals(Driver.getDriver().getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }



}
