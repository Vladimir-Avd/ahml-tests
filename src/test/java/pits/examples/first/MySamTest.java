package pits.examples.first;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test; org.testng.
//import org.testng
//import org.testng.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertFalse;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;


/**
 * Created by
 */
public class MySamTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private FirefoxBinary bin;

    @BeforeMethod
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 30);
        driver.manage().window().maximize();
    }

    @Test
    public void mySamTest() throws Exception {
// comm

//        driver.get("https://market.yandex.ru");
        // на основной странице верхнее меню открывается в разных стилях пока "костылем" перехожу стразу к "Компьютерная техника"
        driver.get("https://new.ahml.test");
        // Процессоры (CPU)->Процессоры Intel
       // driver.findElements(By.cssSelector("[class='link catalog-menu__list-item metrika i-bem metrika_js_inited']")).get(8).click();
        driver.findElements(By.cssSelector(".row-date__day")).get(5).click();
        //element.send_keys(" and some", Keys.ARROW_DOWN)
        //for (int j = 0; j <4 ;j++) {
        WebElement myElem =  driver.findElements(By.cssSelector(".row-date__day")).get(4);
        Actions actions = new Actions(driver);
        actions.moveToElement(myElem).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();

    }

    @AfterMethod
    public void tearDown() throws Exception {
//        driver.quit();

    }
}
