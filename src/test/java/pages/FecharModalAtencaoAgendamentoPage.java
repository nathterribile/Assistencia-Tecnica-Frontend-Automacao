package pages;

import org.openqa.selenium.support.PageFactory;
import elements.FecharModalAtencaoAgendamentoElements;

public class FecharModalAtencaoAgendamentoPage extends FecharModalAtencaoAgendamentoElements {

    public FecharModalAtencaoAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
       
    
    public void clicarBotaoFecharModal(){
        BasePage.waitVisibilityOf(botaoFecharModal);
        BasePage.moveToElement(botaoFecharModal);
        botaoFecharModal.click();
    }    
    
    public String verificarTexto(){
        BasePage.waitVisibilityOf(texto);
        BasePage.moveToElement(texto);
        return texto.getText();
    }   

}
