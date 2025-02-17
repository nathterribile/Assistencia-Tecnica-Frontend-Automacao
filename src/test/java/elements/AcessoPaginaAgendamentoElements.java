package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcessoPaginaAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[2]/div/button")
public static WebElement botaoAcessoAgendamento;

@FindBy(xpath = "/html/body/header/div/h3/i")
public static WebElement logo;

@FindBy(xpath = "/html/body/header/div/h3")
public static WebElement nomeEmpresa;

@FindBy(xpath = "/html/body/header/div/h5")
public static WebElement tituloHeader;

@FindBy(xpath = "/html/body/main/section/h2")
public static WebElement tituloBody;

@FindBy(xpath = "/html/body/main/section/form/div/div[1]/input")
public static WebElement inputProprietario;

@FindBy(xpath = "/html/body/main/section/form/div/div[2]/select")
public static WebElement selectEquipamento;

@FindBy(xpath = "/html/body/main/section/form/div/div[3]/select")
public static WebElement selectMarca;

@FindBy(xpath = "/html/body/main/section/form/div/div[4]/select")
public static WebElement selectModelo;

@FindBy(xpath = "/html/body/main/section/form/div/div[5]/select")
public static WebElement selectDataAgendamto;

@FindBy(xpath = "/html/body/main/section/form/div/div[6]/textarea")
public static WebElement inputDefeito;

@FindBy(xpath = "/html/body/main/section/form/div/div[1]/label")
public static WebElement textoInputProprietario;

@FindBy(xpath = "/html/body/main/section/form/div/div[2]/label")
public static WebElement textoSelectEquipamento;

@FindBy(xpath = "/html/body/main/section/form/div/div[3]/label")
public static WebElement textoSelectMarca;

@FindBy(xpath = "/html/body/main/section/form/div/div[4]/label")
public static WebElement textoSelectModelo;

@FindBy(xpath = "/html/body/main/section/form/div/div[5]/label")
public static WebElement textoSelectDataAgendamto;

@FindBy(xpath = "/html/body/main/section/form/div/div[6]/label")
public static WebElement textoInputDefeito;

@FindBy(xpath = "/html/body/main/section/form/div/div[7]/button")
public static WebElement botaoAgendarPaginaAgendamento;

}
