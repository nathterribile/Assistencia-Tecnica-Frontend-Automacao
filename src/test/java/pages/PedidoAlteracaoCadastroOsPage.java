package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import elements.PedidoAlteracaoCadastroOsElements;

public class PedidoAlteracaoCadastroOsPage extends PedidoAlteracaoCadastroOsElements {

    public PedidoAlteracaoCadastroOsPage(){
        PageFactory.initElements(driver, this);
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

    public String verificarOptionDefaultSelectDataEntrada(){
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

    public String verificarTextoBotaoColunaSistema(){
        BasePage.waitVisibilityOf(colunaSistema);
        BasePage.moveToElement(colunaSistema);
        return colunaSistema.getText();
    }

    public void clicarBotaoColunaSistema(){
        BasePage.waitVisibilityOf(colunaSistema);
        BasePage.moveToElement(colunaSistema);
        colunaSistema.click();

    }

    public String verificarTextoInputProprietario(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#proprietario"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div:nth-child(2)"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }

    public String verificarTextoSelectEquipamto(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#equipamento"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }   

    public String verificarTextoSelectDataEntrada(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#dataEntrada"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#date-time-edit > div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }

    public String verificarTextoTextareaDefeito(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#defeito"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div:nth-child(2)"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }

    public String verificarTextoSelectDataEntrega(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#dataEntrega"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("#date-time-edit > div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }
   
    public String verificarTextoSelectStatus(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#status"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }

    public String verificarTextoTextareaObs(){
        WebElement shadowHost = driver.findElement(By.cssSelector("#observacao"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement shadowContent = shadowRoot.findElement(By.cssSelector("div:nth-child(2)"));
        BasePage.waitVisibilityOf(shadowHost);
        BasePage.moveToElement(shadowHost);
        return shadowContent.getText();
    }        
    
    public Boolean verificarSemLinhaTabelaCadastro(){
        BasePage.waitVisibilityOf(headerTabelaCadastro);
        BasePage.moveToElement(headerTabelaCadastro);
        return linhaApagadaTabelaCadastro.isDisplayed();
    }

    public String verificarTextoBotaoAlterarCadastroEquipamto(){
        BasePage.waitVisibilityOf(botaoAlterarCadastroEquipamto);
        BasePage.moveToElement(botaoAlterarCadastroEquipamto);
        return botaoAlterarCadastroEquipamto.getText();
    }

    public void clicarBotaoAlterarCadastroEquipamto(){
        BasePage.waitVisibilityOf(botaoAlterarCadastroEquipamto);
        BasePage.moveToElement(botaoAlterarCadastroEquipamto);
        botaoAlterarCadastroEquipamto.click();
    }



}
