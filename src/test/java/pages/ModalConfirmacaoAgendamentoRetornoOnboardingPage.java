package pages;

import org.openqa.selenium.support.PageFactory;
import elements.ModalConfirmacaoAgendamentoRetornoOnboardingElements;

public class ModalConfirmacaoAgendamentoRetornoOnboardingPage extends ModalConfirmacaoAgendamentoRetornoOnboardingElements {

    public ModalConfirmacaoAgendamentoRetornoOnboardingPage(){
        PageFactory.initElements(driver, this);
    }
    
    
    public String verificarTextoBotaoFecharModalConfirmacaoAgendamento(){
        BasePage.waitVisibilityOf(botaoFecharModalConfirmacaoAgendamento);
        BasePage.moveToElement(botaoFecharModalConfirmacaoAgendamento);
        return botaoFecharModalConfirmacaoAgendamento.getAttribute("id");
    }
    
    public void clicarbotaoFecharModalConfirmacaoAgendamento(){
        botaoFecharModalConfirmacaoAgendamento.click();
    }    
    
    public String verificarTextoApresentacaoOnboarding(){
        BasePage.waitVisibilityOf(textoApresentacaoOnboarding);
        BasePage.moveToElement(textoApresentacaoOnboarding);
        return textoApresentacaoOnboarding.getText();
    }
    
}
