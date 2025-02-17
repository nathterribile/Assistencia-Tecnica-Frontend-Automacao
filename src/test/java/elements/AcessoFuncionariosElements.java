package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcessoFuncionariosElements extends BasePage {

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[1]/input")
public static WebElement inputUsuario;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[2]/input")
public static WebElement inputSenha;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[3]/button")
public static WebElement botaoAcessoPaginaOrdemServico;

@FindBy(xpath = "/html/body/header/div[1]/h3/i")
public static WebElement logo;

@FindBy(xpath = "/html/body/header/div[1]/h3")
public static WebElement nomeEmpresa;

@FindBy(xpath = "/html/body/header/div[2]/div/h6[1]")
public static WebElement textoCumprimento;

@FindBy(xpath = "/html/body/header/div[2]/div/h6[2]/a")
public static WebElement linkOnboarding;

@FindBy(xpath = "/html/body/main/section[1]/h2")
public static WebElement textoHeaderFormulario;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[1]/label")
public static WebElement textoInputProprietario;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[2]/label")
public static WebElement textoSelectEquipamento;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[3]/label")
public static WebElement textoSelectDataEntrada;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[4]/label")
public static WebElement textoTextareaDefeito;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[5]/label")
public static WebElement textoSelectDataEntrega;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[6]/label")
public static WebElement textoSelectStatus;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[7]/label")
public static WebElement textoTextareaObs;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[1]/input")
public static WebElement inputProprietario;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[2]/select")
public static WebElement selectEquipamto;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[4]/textarea")
public static WebElement textareaDefeito;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[6]/select")
public static WebElement selectStatus;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[7]/textarea")
public static WebElement textareaObs;

@FindBy(xpath = "/html/body/main/section[1]/form/div/div[8]/div[1]/button")
public static WebElement botaoCadastroEquipamto;

@FindBy(xpath = "/html/body/main/section[2]/h2[1]")
public static WebElement textoInputBusca;

@FindBy(xpath = "/html/body/main/section[2]/form/div[1]/input")
public static WebElement inputBusca;

@FindBy(xpath = "/html/body/main/section[2]/form/div[1]/button")
public static WebElement botaoBusca;

@FindBy(xpath = "/html/body/main/section[2]/h2[2]")
public static WebElement textoNomeTabelaBusca;

@FindBy(xpath = "/html/body/main/section[2]/div/table/thead/tr")
public static WebElement textoHeaderTabelaBusca;


}
