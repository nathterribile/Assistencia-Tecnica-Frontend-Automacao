package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import elements.CadastroOsElements;

public class CadastroOsPage extends CadastroOsElements {

    public CadastroOsPage(){
        PageFactory.initElements(driver, this);
    }

    public void inputarProprietario(String textInputProprietario){
        BasePage.waitVisibilityOf(inputProprietario);
        BasePage.moveToElement(inputProprietario);
        inputProprietario.sendKeys(textInputProprietario);
    }

    public void selecionarEquipamto(String textSelectEquipamento){
        BasePage.waitVisibilityOf(selectEquipamto);
        BasePage.moveToElement(selectEquipamto);
        selectEquipamto.sendKeys(textSelectEquipamento);
    }

    

    public void selecionarDataEntrada(String textSelectDataEntrada){
        BasePage.waitVisibilityOf(inputDataEntrada);
        BasePage.moveToElement(inputDataEntrada);
        inputDataEntrada.sendKeys(textSelectDataEntrada);
    }

    public void inputarTextareaDefeito(String textTextareaDefeito){
        BasePage.waitVisibilityOf(textareaDefeito);
        BasePage.moveToElement(textareaDefeito);
        textareaDefeito.sendKeys(textTextareaDefeito);
    }

    public void selecionarDataEntrega(String textSelectDataEntrega){
        BasePage.waitVisibilityOf(inputDataEntrega);
        BasePage.moveToElement(inputDataEntrega);
        inputDataEntrega.sendKeys(textSelectDataEntrega);
    }

    public void selecionarStatus(String textSelectStatus){
        BasePage.waitVisibilityOf(selectStatus);
        BasePage.moveToElement(selectStatus);
        selectStatus.sendKeys(textSelectStatus);
    }

    public String verificarTextoBotaoCadastroEquipamto(){
        BasePage.waitVisibilityOf(botaoCadastroEquipamto);
        BasePage.moveToElement(botaoCadastroEquipamto);
        return botaoCadastroEquipamto.getText();
    }

    public void clicarBotaoCadastrarEquipamto(){
        BasePage.waitVisibilityOf(botaoCadastroEquipamto);
        BasePage.moveToElement(botaoCadastroEquipamto);
        botaoCadastroEquipamto.click();
    }
        
    
    public String verificarPlaceholderInputProprietario(){
        BasePage.waitVisibilityOf(inputProprietario);
        BasePage.moveToElement(inputProprietario);
        return inputProprietario.getAttribute("placeholder");
    }

    public String verificarOptionDefaultSelectEquipamto(){
        BasePage.waitVisibilityOf(selectEquipamto);
        BasePage.moveToElement(selectEquipamto);
        return selectEquipamto.findElements(By.xpath("option")).get(0).getText();
    }   

    public static String verificarOptionDefaultSelectDataEntrada(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#dataEntrada"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#date-time-edit > div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }

    public String verificarPlaceholderTextareaDefeito(){
        BasePage.waitVisibilityOf(textareaDefeito);
        BasePage.moveToElement(textareaDefeito);
        return textareaDefeito.getAttribute("placeholder");
    }

    public String verificarOptionDefaultSelectDataEntrega(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#dataEntrega"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#date-time-edit > div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }
   
    public String verificarOptionDefaultSelectStatus(){
        BasePage.waitVisibilityOf(selectStatus);
        BasePage.moveToElement(selectStatus);
        return selectStatus.findElements(By.xpath("option")).get(0).getText();
    }

    public String verificarPlaceholderTextareaObs(){
        BasePage.waitVisibilityOf(textareaObs);
        BasePage.moveToElement(textareaObs);
        return textareaObs.getAttribute("placeholder");
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
