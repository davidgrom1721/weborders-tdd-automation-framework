package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.Driver;

import java.time.Duration;

public class TestBase {


    // TestBase class is a super class of all test classes that offer benefits such as maintainability, readability,





    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){

        Driver.quitDriver();
    }


}
