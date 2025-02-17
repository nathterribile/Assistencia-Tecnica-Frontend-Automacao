package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ModalConfirmacaoAgendamentoRetornoOnboardingElements extends BasePage {

@FindBy(xpath = "/html/body/main/section/form/div/div[8]/div/div/div[1]/button")
public static WebElement botaoFecharModalConfirmacaoAgendamento;

@FindBy(xpath = "/html/body/main/div[1]/div[1]/h2")
public static WebElement textoApresentacaoOnboarding;

}
