package browser;

import org.openqa.selenium.WebDriver;

public interface IBrowser {
    default String getDriverPathByOS(String driverName){
        String path = System.getProperty("user.dir");
        String driverPath = path + "\\src\\test\\resources\\drivers\\";
        String osName = System.getProperty("os.name", "windows").toLowerCase();

        if(osName.contains("windows")) {
            return driverPath + driverName + ".exe";
        }
        else return driverPath + driverName; //Linux
        
    }

    WebDriver getDriver();
}
