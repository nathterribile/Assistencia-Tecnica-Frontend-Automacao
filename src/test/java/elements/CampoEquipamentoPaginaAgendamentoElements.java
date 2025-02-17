package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CampoEquipamentoPaginaAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/section/form/div/div[2]/select")
public static WebElement inputEquipamento;

@FindBy(xpath = "/html/body/main/section/form/div/div[3]/select")
public static WebElement inputMarca;

}
