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

import java.time.Duration;

public class LoginTests extends TestBase{




    @Test
    public void positiveLogin(){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        String username = "Tester";
        String pass = "test";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB, pass, Keys.ENTER);

        Assert.assertEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }

    @Test
    public void negativeLoginInvalidUsername(){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        String username = "Invalid";
        String pass = "test";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB, pass, Keys.ENTER);

        Assert.assertNotEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }

    @Test
    public void negativeLoginInvalidPassword(){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        String username = "Tester";
        String pass = "invalid";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB, pass, Keys.ENTER);

        Assert.assertNotEquals(driver.getCurrentUrl(), "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

    }

}
