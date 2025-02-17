package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import elements.AcessoPaginaAgendamentoElements;

public class AcessoPaginaAgendamentoPage extends AcessoPaginaAgendamentoElements {

    public AcessoPaginaAgendamentoPage(){
        PageFactory.initElements(driver, this);
    }
    
    public Boolean verificarLogo(){
        BasePage.waitVisibilityOf(logo);
        BasePage.moveToElement(logo);
        return logo.isDisplayed();
    }
    
    public String verificarTextoBotaoAcessoAgendamento(){
        BasePage.waitVisibilityOf(botaoAcessoAgendamento);
        BasePage.moveToElement(botaoAcessoAgendamento);
        return botaoAcessoAgendamento.getText();
    }
    
    public void clicarBotaoAcessoAgendamento(){
        botaoAcessoAgendamento.click();
    }    
    
    public String verificarNomeEmpresa(){
        BasePage.waitVisibilityOf(nomeEmpresa);
        BasePage.moveToElement(nomeEmpresa);
        return nomeEmpresa.getText();
    }

    public String verificarTituloHeader(){
        BasePage.waitVisibilityOf(tituloHeader);
        BasePage.moveToElement(tituloHeader);
        return tituloHeader.getText();
    }


    public String verificarTextoTituloBody(){
        BasePage.waitVisibilityOf(tituloBody);
        BasePage.moveToElement(tituloBody);
        return tituloBody.getText();
    }

    public String verificarTextoProprietario(){
        BasePage.waitVisibilityOf(textoInputProprietario);
        BasePage.moveToElement(textoInputProprietario);
        return textoInputProprietario.getText();
    }  
    
    public String verificarTextoEquipamento(){
        BasePage.waitVisibilityOf(textoSelectEquipamento);
        BasePage.moveToElement(textoSelectEquipamento);
        return textoSelectEquipamento.getText();
    }  
    
    public String verificarTextoMarca(){
        BasePage.waitVisibilityOf(textoSelectMarca);
        BasePage.moveToElement(textoSelectMarca);
        return textoSelectMarca.getText();
    }  
    
    public String verificarTextoDataAgendamto(){
        BasePage.waitVisibilityOf(textoSelectDataAgendamto);
        BasePage.moveToElement(textoSelectDataAgendamto);
        return textoSelectDataAgendamto.getText();
    }  
    
    public String verificarTextoModelo(){
        BasePage.waitVisibilityOf(textoSelectModelo);
        BasePage.moveToElement(textoSelectModelo);
        return textoSelectModelo.getText();
    }  
    
    public String verificarTextoDefeito(){
        BasePage.waitVisibilityOf(textoInputDefeito);
        BasePage.moveToElement(textoInputDefeito);
        return textoInputDefeito.getText();
    }

    public String verificarPlaceholderProprietario(){
        BasePage.waitVisibilityOf(inputProprietario);
        BasePage.moveToElement(inputProprietario);
        return inputProprietario.getAttribute("placeholder");
    }

    public String verificarPlaceholderDefeito(){
        BasePage.waitVisibilityOf(inputDefeito);
        BasePage.moveToElement(inputDefeito);
        return inputDefeito.getAttribute("placeholder");
    }

    public String verificarOptionDefaultEquipamento(){
        BasePage.waitVisibilityOf(selectEquipamento);
        BasePage.moveToElement(selectEquipamento);
        return selectEquipamento.findElements(By.xpath("option")).get(0).getText();
    }

    public String verificarOptionDefaultMarca(){
        BasePage.waitVisibilityOf(selectMarca);
        BasePage.moveToElement(selectMarca);
        return selectMarca.findElements(By.xpath("option")).get(0).getText();
    }

    public String verificarOptionDefaultModelo(){
        BasePage.waitVisibilityOf(selectModelo);
        BasePage.moveToElement(selectModelo);
        return selectModelo.findElements(By.xpath("option")).get(0).getText();
    }
    

    public String verificarTextoBotaoAgendarPaginaAgendamento(){
        BasePage.waitVisibilityOf(botaoAgendarPaginaAgendamento);
        BasePage.moveToElement(botaoAgendarPaginaAgendamento);
        return botaoAgendarPaginaAgendamento.getText();
    }

    public boolean verificarBotaoAgendarPaginaAgendamento(){
        BasePage.waitVisibilityOf(botaoAgendarPaginaAgendamento);
        BasePage.moveToElement(botaoAgendarPaginaAgendamento);
        return botaoAgendarPaginaAgendamento.isEnabled();
    }

    

}
