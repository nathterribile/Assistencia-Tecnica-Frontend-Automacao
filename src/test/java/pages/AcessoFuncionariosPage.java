package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import elements.AcessoFuncionariosElements;

public class AcessoFuncionariosPage extends AcessoFuncionariosElements {

    public AcessoFuncionariosPage(){
        PageFactory.initElements(driver, this);
    }

    public void inputarUsuario(String Usuario){
        BasePage.waitVisibilityOf(inputUsuario);
        BasePage.moveToElement(inputUsuario);
        inputUsuario.sendKeys(Usuario);
    }

    public void inputarSenha(String Senha){
        BasePage.waitVisibilityOf(inputSenha);
        BasePage.moveToElement(inputSenha);
        inputSenha.sendKeys(Senha);
    }
    
    public String verificarTextoBotaoAcessoPaginaOrdemServico(){
        BasePage.waitVisibilityOf(botaoAcessoPaginaOrdemServico);
        BasePage.moveToElement(botaoAcessoPaginaOrdemServico);
        return botaoAcessoPaginaOrdemServico.getText();
    }
    
    public void clicarBotaoAcessoPaginaOrdemServico(){
        botaoAcessoPaginaOrdemServico.click();
    }

    public Boolean verificarLogo(){
        BasePage.waitVisibilityOf(logo);
        BasePage.moveToElement(logo);
        return logo.isDisplayed();
    }
    
    public String verificarNomeEmpresa(){
        BasePage.waitVisibilityOf(nomeEmpresa);
        BasePage.moveToElement(nomeEmpresa);
        return nomeEmpresa.getText();
    }

    public String verificarTextoCumprimento(){
        BasePage.waitVisibilityOf(textoCumprimento);
        BasePage.moveToElement(textoCumprimento);
        return textoCumprimento.getText();
    }

    public String verificarTextoLinkOnboarding(){
        BasePage.waitVisibilityOf(linkOnboarding);
        BasePage.moveToElement(linkOnboarding);
        return linkOnboarding.getText();
    }

    public String verificarTextoHeaderFormulario(){
        BasePage.waitVisibilityOf(textoHeaderFormulario);
        BasePage.moveToElement(textoHeaderFormulario);
        return textoHeaderFormulario.getText();
    }

    public String verificarTextoInputProprietario(){
        BasePage.waitVisibilityOf(textoInputProprietario);
        BasePage.moveToElement(textoInputProprietario);
        return textoInputProprietario.getText();
    }

    public String verificarTextoSelectEquipamto(){
        BasePage.waitVisibilityOf(textoSelectEquipamento);
        BasePage.moveToElement(textoSelectEquipamento);
        return textoSelectEquipamento.getText();
    }   

    public String verificarTextoSelectDataEntrada(){
        BasePage.waitVisibilityOf(textoSelectDataEntrada);
        BasePage.moveToElement(textoSelectDataEntrada);
        return textoSelectDataEntrada.getText();
    }

    public String verificarTextoTextareaDefeito(){
        BasePage.waitVisibilityOf(textoTextareaDefeito);
        BasePage.moveToElement(textoTextareaDefeito);
        return textoTextareaDefeito.getText();
    }

    public String verificarTextoSelectDataEntrega(){
        BasePage.waitVisibilityOf(textoSelectDataEntrega);
        BasePage.moveToElement(textoSelectDataEntrega);
        return textoSelectDataEntrega.getText();
    }

    public String verificarTextoSelectStatus(){
        BasePage.waitVisibilityOf(textoSelectStatus);
        BasePage.moveToElement(textoSelectStatus);
        return textoSelectStatus.getText();
    }

    public String verificarTextoITextareaObs(){
        BasePage.waitVisibilityOf(textoTextareaObs);
        BasePage.moveToElement(textoTextareaObs);
        return textoTextareaObs.getText();
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
   

    public String verificarTextoBotaoCadastroEquipamto(){
        BasePage.waitVisibilityOf(botaoCadastroEquipamto);
        BasePage.moveToElement(botaoCadastroEquipamto);
        return botaoCadastroEquipamto.getText();
    }

    public boolean verificarBotaoCadastroEquipamto(){
        BasePage.waitVisibilityOf(botaoCadastroEquipamto);
        BasePage.moveToElement(botaoCadastroEquipamto);
        return botaoCadastroEquipamto.isEnabled();
    }

    public String verificarTextoInputBusca(){
        BasePage.waitVisibilityOf(textoInputBusca);
        BasePage.moveToElement(textoInputBusca);
        return textoInputBusca.getText();
    }

    public String verificarPlaceholderInputBusca(){
        BasePage.waitVisibilityOf(inputBusca);
        BasePage.moveToElement(inputBusca);
        return inputBusca.getAttribute("placeholder");
    }

    public String verificarTextoBotaoBusca(){
        BasePage.waitVisibilityOf(botaoBusca);
        BasePage.moveToElement(botaoBusca);
        return botaoBusca.getText();
    }

    public boolean verificarBotaoBusca(){
        BasePage.waitVisibilityOf(botaoBusca);
        BasePage.moveToElement(botaoBusca);
        return botaoBusca.isEnabled();
    }

    public String verificarTextoNomeTabelaBusca(){
        BasePage.waitVisibilityOf(textoNomeTabelaBusca);
        BasePage.moveToElement(textoNomeTabelaBusca);
        return textoNomeTabelaBusca.getText();
    }

    public String verificarTextoHeaderTabelaBusca(){
        BasePage.waitVisibilityOf(textoHeaderTabelaBusca);
        BasePage.moveToElement(textoHeaderTabelaBusca);
        return textoHeaderTabelaBusca.getText();
    }

}
