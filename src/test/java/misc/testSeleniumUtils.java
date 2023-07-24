package misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import utils.Driver;
import utils.SeleniumUtils;

public class testSeleniumUtils {

    public static void main(String[] args) {


        Driver.getDriver().get("https://www.amazon.com/");

        SeleniumUtils.scroll(0, 2000);


        SeleniumUtils.jsClick(Driver.getDriver().findElement(By.xpath("//a[@href='https://music.amazon.com?ref=nav_youraccount_cldplyr']")));


        SeleniumUtils.getScreenshot("target/screenshots/screenshotOfFailure.png");






    }
}
