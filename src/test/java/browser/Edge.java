package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Edge implements IBrowser{
    @Override
    public WebDriver getDriver() {
        String driverPath = getDriverPathByOS("msedgedriver");
        System.setProperty("webdriver.edge.driver", driverPath);

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("start-maximized");

        return new EdgeDriver(edgeOptions);
    }
}
