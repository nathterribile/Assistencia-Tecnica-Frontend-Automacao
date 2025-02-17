package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcessoOnboardingElements extends BasePage {

    

@FindBy(xpath = "/html/body/nav/div/div[1]/i")
public static WebElement logo;

@FindBy(xpath = "/html/body/nav/div/div[1]")
public static WebElement nomeEmpresa;

@FindBy(xpath = "/html/body/nav/div/div/ul/li[1]/a")
public static WebElement navServicos;

@FindBy(xpath = "/html/body/nav/div/div/ul/li[2]/a")
public static WebElement navLogin;

@FindBy(xpath = "/html/body/main/div[1]/div/h2")
public static WebElement textoApresentacaoHeader;

@FindBy(xpath = "/html/body/main/div[1]/div/p[1]")
public static WebElement textoApresentacao;

@FindBy(xpath = "/html/body/main/div[1]/div/p[2]")
public static WebElement textoAgendamento;


@FindBy(xpath = "/html/body/main/div[1]/div/button")
public static WebElement botaoPreAgendamento;

@FindBy(xpath = "/html/body/main/div[1]/figure/img")
public static WebElement imagemRecepcao;

@FindBy(xpath = "/html/body/main/h2")
public static WebElement textoServicos;

@FindBy(xpath = "/html/body/main/div[2]/div[1]/div/img")
public static WebElement imagemComputadores;

@FindBy(xpath = "/html/body/main/div[2]/div[1]/div/a")
public static WebElement botaoComputadores;

@FindBy(xpath = "/html/body/main/div[2]/div[2]/div/img")
public static WebElement imagemEletrodomesticos;

@FindBy(xpath = "/html/body/main/div[2]/div[2]/div/a")
public static WebElement botaoEletrodomesticos;

@FindBy(xpath = "/html/body/main/div[2]/div[3]/div/img")
public static WebElement imagemEletronicos;

@FindBy(xpath = "/html/body/main/div[2]/div[3]/div/a")
public static WebElement botaoEletronicos;

@FindBy(xpath = "/html/body/footer/h5")
public static WebElement textoFooter;

@FindBy(xpath = "/html/body/footer/div/a[1]")
public static WebElement iDlinktTwitter;

@FindBy(xpath = "/html/body/footer/div/a[2]")
public static WebElement iDlinkInstagram;

@FindBy(xpath = "/html/body/footer/div/a[3]")
public static WebElement iDlinkYouTube;

@FindBy(xpath = "/html/body/footer/div/a[4]")
public static WebElement iDlinkFacebook;


}
