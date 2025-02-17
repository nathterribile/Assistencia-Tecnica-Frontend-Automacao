package pages;

import org.openqa.selenium.support.PageFactory;

import elements.CampoMarcaPaginaAgendamentoElements;

public class CampoMarcaPaginaAgendamentoPage extends CampoMarcaPaginaAgendamentoElements {

    public CampoMarcaPaginaAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
    
    public void inputarEquipamento(String equipamento){
        BasePage.waitVisibilityOf(inputEquipamento);
        BasePage.moveToElement(inputEquipamento);
        inputEquipamento.sendKeys(equipamento);
    }

    public void InputarMarca(String marca){
        BasePage.waitVisibilityOf(inputMarca);
        BasePage.moveToElement(inputMarca);        
        inputMarca.sendKeys(marca);
    }

    
    public void clicarModelo() throws InterruptedException{
        BasePage.waitVisibilityOf(inputModelo);
        BasePage.moveToElement(inputModelo);
        BasePage.moveToElement(direcionamentoScreenshot);
        inputModelo.click();
    }
    
    public String verificarModelo(){
        BasePage.waitVisibilityOf(inputModelo);
        BasePage.moveToElement(inputModelo);
        return inputModelo.getText();
    }
  
    

}
