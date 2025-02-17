package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ModalConfirmacaoAgendamentoElements extends BasePage {

@FindBy(xpath = "/html/body/main/section/form/div/div[7]/button")
public static WebElement botaoAcessoModalAgendamento;

@FindBy(xpath = "/html/body/main/section/form/div/div[8]/div/div/div[1]")
public static WebElement textoHeaderModal;

@FindBy(xpath = "/html/body/main/section/form/div/div[8]/div/div/div[2]/p")
public static WebElement textoBodyModal;

@FindBy(xpath = "/html/body/main/section/form/div/div[8]/div/div/div[1]/button")
public static WebElement fecharModalAgendamento;

}
