package pages;

import org.openqa.selenium.support.PageFactory;
import elements.AcessoOnboardingElements;

public class AcessoOnboardingPage extends AcessoOnboardingElements {

    public AcessoOnboardingPage(){
        PageFactory.initElements(driver, this);
    }
    
    public Boolean verificarLogo(){
        return logo.isDisplayed();
    }
    
    public String verificarTextoLogo(){
        BasePage.waitVisibilityOf(nomeEmpresa);
        BasePage.moveToElement(nomeEmpresa);
        return nomeEmpresa.getText();        
    }

    public String verificarTextoNavServicos(){
        BasePage.waitVisibilityOf(navServicos);
        BasePage.moveToElement(navServicos);
        return navServicos.getText();
    }

    public String verificarTextoNavLogin(){
        BasePage.waitVisibilityOf(navLogin);
        BasePage.moveToElement(navLogin);
        return navLogin.getText();
    }
    
    public String verificarTextoApresentacaoHeader(){
        BasePage.waitVisibilityOf(textoApresentacaoHeader);
        BasePage.moveToElement(textoApresentacaoHeader);
        return textoApresentacaoHeader.getText();        
    }

    public String verificarTextoApresentacao(){
        BasePage.waitVisibilityOf(textoApresentacao);
        BasePage.moveToElement(textoApresentacao);
        return textoApresentacao.getText();        
    }

    public String verificarTextoAgendamento(){
        BasePage.waitVisibilityOf(textoAgendamento);
        BasePage.moveToElement(textoAgendamento);
        return textoAgendamento.getText();
    }


    public String verificarTextoBotaoPreAgendamento(){
        BasePage.waitVisibilityOf(botaoPreAgendamento);
        BasePage.moveToElement(botaoPreAgendamento);
        return botaoPreAgendamento.getText();
    }

    public boolean verificarBotaoPreAgendamento(){
        BasePage.waitVisibilityOf(botaoPreAgendamento);
        BasePage.moveToElement(botaoPreAgendamento);
        return botaoPreAgendamento.isEnabled();
    }
    
    public Boolean verificarImagemRecepcao(){
        return imagemRecepcao.isDisplayed();
    }

    public String verificarTextoServicos(){
        BasePage.waitVisibilityOf(textoServicos);
        BasePage.moveToElement(textoServicos);
        return textoServicos.getText();
    }

    public Boolean verificarImagemComputadores(){
        return imagemComputadores.isDisplayed();
    }

    public String verificarTextoBotaoComputadores(){
        BasePage.waitVisibilityOf(botaoComputadores);
        BasePage.moveToElement(botaoComputadores);
        return botaoComputadores.getText();
    }

    public boolean verificarBotaoComputadores(){
        BasePage.waitVisibilityOf(botaoComputadores);
        BasePage.moveToElement(botaoComputadores);
        return botaoComputadores.isEnabled();
    }

    public Boolean verificarImagemEletrodomesticos(){
        return imagemEletrodomesticos.isDisplayed();
    }

    public String verificarTextoBotaoEletrodomesticos(){
        BasePage.waitVisibilityOf(botaoEletrodomesticos);
        BasePage.moveToElement(botaoEletrodomesticos);
        return botaoEletrodomesticos.getText();
    }

    public boolean verificarBotaoEletrodomesticos(){
        BasePage.waitVisibilityOf(botaoEletrodomesticos);
        BasePage.moveToElement(botaoEletrodomesticos);
        return botaoEletrodomesticos.isEnabled();
    }

    public Boolean verificarImagemEletronicos(){
        return imagemEletronicos.isDisplayed();
    } 

    public String verificarTextoBotaoEletronicos(){
        BasePage.waitVisibilityOf(botaoEletronicos);
        BasePage.moveToElement(botaoEletronicos);
        return botaoEletronicos.getText();
    }

    public boolean verificarBotaoEletronicos(){
        BasePage.waitVisibilityOf(botaoEletronicos);
        BasePage.moveToElement(botaoEletronicos);
        return botaoEletronicos.isEnabled();
    }

    public String verificarTextoFooter(){
        BasePage.waitVisibilityOf(textoFooter);
        BasePage.moveToElement(textoFooter);
        return textoFooter.getText();
    }     

    public String verificarIdLinktTwitter(){
        BasePage.waitVisibilityOf(iDlinktTwitter);
        BasePage.moveToElement(iDlinktTwitter);
        return iDlinktTwitter.getAttribute("id");
    }

    public String verificarIdLinkInstagram(){
        BasePage.waitVisibilityOf(iDlinkInstagram);
        BasePage.moveToElement(iDlinkInstagram);
        return iDlinkInstagram.getAttribute("id");
    }

    public String verificarIdLinkYouTube(){
        BasePage.waitVisibilityOf(iDlinkYouTube);
        BasePage.moveToElement(iDlinkYouTube);
        return iDlinkYouTube.getAttribute("id");
    }

    public String verificarIdLinkFacebook(){
        BasePage.waitVisibilityOf(iDlinkFacebook);
        BasePage.moveToElement(iDlinkFacebook);
        return iDlinkFacebook.getAttribute("id");
    }
    
    

}