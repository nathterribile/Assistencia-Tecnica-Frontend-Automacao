package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pages.BasePage;

public class ModalAtencaoAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/div[1]/div/button")
public static WebElement botaoAcessoModal;

@FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[2]/div/button")
public static WebElement botaoAgendar;

@FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[1]/button")
public static WebElement botaoFechar;

@FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[1]/h1")
public static WebElement texto1;

@FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[2]/p")
public static WebElement texto2;

}
