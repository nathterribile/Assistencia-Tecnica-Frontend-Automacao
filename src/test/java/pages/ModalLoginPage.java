package pages;

import org.openqa.selenium.support.PageFactory;
import elements.ModalLoginElements;

public class ModalLoginPage extends ModalLoginElements {

    public ModalLoginPage(){
        PageFactory.initElements(driver, this);
    }
    
    public String verificarTextoBotaoAcessoModalLogin(){
        BasePage.waitVisibilityOf(botaoAcessoModalLogin);
        BasePage.moveToElement(botaoAcessoModalLogin);
        return botaoAcessoModalLogin.getText();
    }
    
    public void clicarBotaoAcessoModalLogin(){
        botaoAcessoModalLogin.click();
    }    
    
    public String verificarTextoHeaderModalLogin(){
        BasePage.waitVisibilityOf(textoModalLogin);
        BasePage.moveToElement(textoModalLogin);
        return textoModalLogin.getText();
    }

    public String verificarTextoUsuario(){
        BasePage.waitVisibilityOf(textoUsuario);
        BasePage.moveToElement(textoUsuario);
        return textoUsuario.getText();
    }

    public String verificarPlaceholderUsuario(){
        BasePage.waitVisibilityOf(inputUsuario);
        BasePage.moveToElement(inputUsuario);
        return inputUsuario.getAttribute("placeholder");
    }

    public String verificarTextoSenha(){
        BasePage.waitVisibilityOf(textoSenha);
        BasePage.moveToElement(textoSenha);
        return textoSenha.getText();
    }

    public String verificarPlaceholderSenha(){
        BasePage.waitVisibilityOf(inputSenha);
        BasePage.moveToElement(inputSenha);
        return inputSenha.getAttribute("placeholder");
    }

   

    public String verificarTextoBotaoLogin(){
        BasePage.waitVisibilityOf(botaoLogin);
        BasePage.moveToElement(botaoLogin);
        return botaoLogin.getText();
    }

    public boolean verificarBotaoLogin(){
        BasePage.waitVisibilityOf(botaoLogin);
        BasePage.moveToElement(botaoLogin);
        return botaoLogin.isEnabled();
    }

    

    public String verificarBotaoFecharModalLogin(){
        BasePage.waitVisibilityOf(botaoFecharModalLogin);
        BasePage.moveToElement(botaoFecharModalLogin);
        return botaoFecharModalLogin.getAttribute("id");
    }

    

}
