package pages;

import org.openqa.selenium.support.PageFactory;

import elements.ModalConfirmacaoAgendamentoElements;

public class ModalConfirmacaoAgendamentoPage extends ModalConfirmacaoAgendamentoElements {

    public ModalConfirmacaoAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
    
    
    public String verificarTextoBotaoAcessoModalAgendamento(){
        BasePage.moveToElement(botaoAcessoModalAgendamento);
        BasePage.waitVisibilityOf(botaoAcessoModalAgendamento);
        return botaoAcessoModalAgendamento.getText();
    }
    
    public void clicarBotaoAcessoModalAgendamento(){
        BasePage.moveToElement(botaoAcessoModalAgendamento);
        BasePage.waitVisibilityOf(botaoAcessoModalAgendamento);
        botaoAcessoModalAgendamento.click();
    }
    
    public String verificarTextoHeaderModal(){
        BasePage.waitVisibilityOf(textoHeaderModal);
        BasePage.moveToElement(textoHeaderModal);
        return textoHeaderModal.getText();
    }

    public Boolean verificarTextoBodyModal(String inputTextoBodyModal){
        BasePage.waitVisibilityOf(textoBodyModal);
        BasePage.moveToElement(textoBodyModal);
        return textoBodyModal.getText().contains(inputTextoBodyModal);
    }


    public String verificarIdfecharModalAgendamento(){
        BasePage.waitVisibilityOf(fecharModalAgendamento);
        BasePage.moveToElement(fecharModalAgendamento);
        return fecharModalAgendamento.getAttribute("id");
    }

    
}
