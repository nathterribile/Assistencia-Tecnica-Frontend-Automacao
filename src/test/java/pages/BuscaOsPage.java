package pages;

import org.openqa.selenium.support.PageFactory;
import elements.BuscaOsElements;

public class BuscaOsPage extends BuscaOsElements {

    public BuscaOsPage(){
        PageFactory.initElements(driver, this);
    }

    public void inputarId(String Id){        
        BasePage.waitVisibilityOf(inputBusca);
        BasePage.moveToElement(inputBusca);
        inputBusca.sendKeys(Id);
    }

    public String verificarTextoBotaoBusca(){
        BasePage.waitVisibilityOf(botaoBusca);
        BasePage.moveToElement(botaoBusca);
        return botaoBusca.getText();
    }

    public  void clicarBotaoBusca(){
        BasePage.waitVisibilityOf(botaoBusca);
        BasePage.moveToElement(botaoBusca);
        botaoBusca.click();
    }

    public String verificarTabelaColunaProprietario(){
        BasePage.waitVisibilityOf(colunaProprietario);
        BasePage.moveToElement(colunaProprietario);
        return colunaProprietario.getText();
    }

    public String verificarTabelaColunaEquipamto(){
        BasePage.waitVisibilityOf(colunaEquipamento);
        BasePage.moveToElement(colunaEquipamento);
        return colunaEquipamento.getText();
    }

    public String verificarTabelaColunaDataEntrada(){
        BasePage.waitVisibilityOf(colunaDataEntrada);
        BasePage.moveToElement(colunaDataEntrada);
        return colunaDataEntrada.getText();
    }

    public String verificarTabelaColunaAreaDefeito(){
        BasePage.waitVisibilityOf(colunaDefeito);
        BasePage.moveToElement(colunaDefeito);
        return colunaDefeito.getText();
    }

    public String verificarTabelaColunaDataEntrega(){
        BasePage.waitVisibilityOf(colunaDataEntrega);
        BasePage.moveToElement(colunaDataEntrega);
        return colunaDataEntrega.getText();
    }

    public String verificarTabelaColunaStatus(){
        BasePage.waitVisibilityOf(colunaStatus);
        BasePage.moveToElement(colunaStatus);
        return colunaStatus.getText();
    }

    public String verificarTabelaColunaObs(){
        BasePage.waitVisibilityOf(colunaObs);
        BasePage.moveToElement(colunaObs);
        return colunaObs.getText();
    }

    public String verificarTextoLinkColunaSistema() {
        BasePage.waitVisibilityOf(colunaSistema);
        BasePage.moveToElement(colunaSistema);
        return colunaSistema.getText();
    }

    public Boolean verificarLinkColunaSistema() {
        BasePage.waitVisibilityOf(colunaSistema);
        BasePage.moveToElement(colunaSistema);
        return colunaSistema.isEnabled();
    }


}
