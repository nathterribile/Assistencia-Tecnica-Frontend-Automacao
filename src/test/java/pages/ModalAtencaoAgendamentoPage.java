package pages;

import org.openqa.selenium.support.PageFactory;
import elements.ModalAtencaoAgendamentoElements;

public class ModalAtencaoAgendamentoPage extends ModalAtencaoAgendamentoElements {

    public ModalAtencaoAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
    
    public String verificarTextoBotaoAcessoModal(){
        BasePage.waitVisibilityOf(botaoAcessoModal);
        BasePage.moveToElement(botaoAcessoModal);
        return botaoAcessoModal.getText();
    }
    
    public void clicarBotaoAcessoModal(){
        botaoAcessoModal.click();
    }    
    
    public String verificarTextoHeader(){
        BasePage.waitVisibilityOf(texto1);
        BasePage.moveToElement(texto1);
        return texto1.getText();
    }

    public String verificarTextoBody(){
        BasePage.waitVisibilityOf(texto2);
        BasePage.moveToElement(texto2);
        return texto2.getText();
    }
    

    public boolean verificarBotaoFechar(){
        BasePage.waitVisibilityOf(botaoFechar);
        BasePage.moveToElement(botaoFechar);
        return botaoFechar.isEnabled();
    }

    public String verificarTextoBotaoAgendar(){
        BasePage.waitVisibilityOf(botaoAgendar);
        BasePage.moveToElement(botaoAgendar);
        return botaoAgendar.getText();
    }

    public boolean verificarBotaoAgendar() {
        BasePage.waitVisibilityOf(botaoAgendar);
        BasePage.moveToElement(botaoAgendar);
        return botaoAgendar.isEnabled();
    }

    

    

}
