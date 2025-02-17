package browser;

import org.openqa.selenium.WebDriver;

public class Browser {
    public static WebDriver getWebDriver(){
        return getDriver(getBrowser());
    }

    private static IBrowser getBrowser(){
        String browser = "chrome";

        if(browser.equalsIgnoreCase("chrome")) return new GoogleChrome();
        else if(browser.equalsIgnoreCase("firefox")) return new Firefox();
        else if(browser.equalsIgnoreCase("edge")) return new Edge();
        else if(browser.equalsIgnoreCase("ie")) return new InternetExplorer();
            
        else throw new RuntimeException("Informe um browser válido");
    }

    private static WebDriver getDriver(IBrowser browser){
        return browser.getDriver();
    }
}