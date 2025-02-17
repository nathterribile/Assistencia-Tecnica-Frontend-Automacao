package pages;

import org.openqa.selenium.support.PageFactory;
import elements.CampoEquipamentoPaginaAgendamentoElements;

public class CampoEquipamentoPaginaAgendamentoPage extends CampoEquipamentoPaginaAgendamentoElements {

    public CampoEquipamentoPaginaAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
    
    public void inputarEquipamento(String equipamento){
        BasePage.waitVisibilityOf(inputEquipamento);
        BasePage.moveToElement(inputEquipamento);
        inputEquipamento.sendKeys(equipamento);
    }

    public void clicarInputMarca(){
        BasePage.waitVisibilityOf(inputMarca);
        BasePage.moveToElement(inputMarca);
        inputMarca.click();
    }
    
       
    public String verificarMarca(){
        BasePage.waitVisibilityOf(inputMarca);
        BasePage.moveToElement(inputMarca);
        return inputMarca.getText();
    }
  
    

}
