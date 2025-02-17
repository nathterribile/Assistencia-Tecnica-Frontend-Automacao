package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CampoMarcaPaginaAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/section/form/div/div[2]/select")
public static WebElement inputEquipamento;

@FindBy(xpath = "/html/body/main/section/form/div/div[3]/select")
public static WebElement inputMarca;

@FindBy(xpath = "/html/body/main/section/form/div/div[4]/select")
public static WebElement inputModelo;

@FindBy(xpath = "/html/body/main/section/form/div/div[4]/select/option[2]")
public static WebElement inputModelo2;

@FindBy(xpath = "/html/body/main/section/form/div/div[7]/button")
public static WebElement direcionamentoScreenshot;

}