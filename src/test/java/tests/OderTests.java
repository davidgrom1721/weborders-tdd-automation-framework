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

public class OderTests extends TestBase{



    @Test
    public void verifyDeleteSelectedButton(){

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        String username = "Tester";
        String pass = "test";
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys(username, Keys.TAB, pass, Keys.ENTER);

        driver.findElement(By.linkText("Order")).click();
        WebElement element = driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton"));
        Assert.assertTrue(element.isDisplayed());
    }

}
