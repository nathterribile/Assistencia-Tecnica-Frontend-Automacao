package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ModalLoginElements extends BasePage {

@FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
public static WebElement botaoAcessoModalLogin;

@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/h1")
public static WebElement textoModalLogin;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[1]/label")
public static WebElement textoUsuario;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[1]/input")
public static WebElement inputUsuario;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[2]/label")
public static WebElement textoSenha;

@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[2]/input")
public static WebElement inputSenha;


@FindBy(xpath = "/html/body/div[1]/div/div/div[2]/form/div[3]/button")
public static WebElement botaoLogin;

@FindBy(xpath = "/html/body/div[1]/div/div/div[1]/button")
public static WebElement botaoFecharModalLogin;

}
