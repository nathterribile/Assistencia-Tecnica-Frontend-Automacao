package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.io.File;
import java.io.IOException;
import java.time.Duration;


public class BasePage extends BaseSteps {

    static Duration timeoutInSeconds = Duration.ofSeconds(200);

    public BasePage(){}

    public static void moveToElement(WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    protected static void clickAndHold(WebElement element){
        Actions action = new Actions(driver);
        action.clickAndHold(element).build().perform();
    }

    public static void openBrowser(String url){
        driver.manage().window().maximize();
        driver.navigate().to(url);
    }    

    public static void waitVisibilityOf(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitElementToBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    
    public static byte[] getByteScreenshot(WebDriver driver) {
        byte[] image = null;
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            image = FileUtils.readFileToByteArray(src);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }    
}