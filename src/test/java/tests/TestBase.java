package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {


    // TestBase class is a super class of all test classes that offer benefits such as maintainability, readability,


    protected WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }


}
