package browser;

import org.openqa.selenium.WebDriver;

public interface IBrowser {
    default String getDriverPathByOS(String driverName){
        String driverPath = "C:/Users/Nathalia Terribile/Desktop/Documentos/Assistencia Tecnica - Frontend - Automacao/src/test/resources/drivers/";
        String osName = "windows";

        if(osName.contains("windows")) {
            return driverPath + driverName + ".exe";
        }
        else return driverPath + driverName; //Linux
        
    }

    WebDriver getDriver();
}
