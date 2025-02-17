package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleChrome implements IBrowser{
    @Override
    public WebDriver getDriver() {
        String driverPath = getDriverPathByOS("chromedriver");
        System.setProperty("webdriver.chrome.driver", driverPath);

        ChromeOptions chromeOpts = new ChromeOptions();
        chromeOpts.addArguments("--remote-allow-origins=*");

        return new ChromeDriver(chromeOpts);
    }
}
