package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.ModalLoginPage;

public class ModalLoginSteps {


        @Given("que o usuario esta na tela Onboarding para acessar a area de login de funcionarios")
        public void que_o_usuario_esta_na_tela_Onboarding_para_acessar_a_area_de_login_de_funcionarios() {              
                
        }

        @When("o usuario clica no botao de login {string}")
        public void o_usuario_clica_no_botao_de_login(String textoBotaoAcessoModalLogin) {
                ModalLoginPage ModalLoginPage = new ModalLoginPage();

                String response = ModalLoginPage.verificarTextoBotaoAcessoModalLogin();               
                Assert.assertEquals(textoBotaoAcessoModalLogin, response);
                ModalLoginPage.clicarBotaoAcessoModalLogin(); 
                
        }

        @Then("o sistema direciona para a modal de login com o texto {string}")
        public void o_sistema_direciona_para_a_modal_de_login_com_o_texto(String textoHeaderModalLogin) {
                ModalLoginPage ModalLoginPage = new ModalLoginPage();

                String response = ModalLoginPage.verificarTextoHeaderModalLogin();
                Assert.assertEquals(textoHeaderModalLogin, response);
                
        }

        @And("os campos de login {string} {string} com seus placeholders {string} {string}")
        public void os_campos_de_login_com_seus_placeholders(String textoUsuario, String textoSenha, String placeholderUsuario, String placeholderSenha) {
                ModalLoginPage ModalLoginPage = new ModalLoginPage();

                String response1 = ModalLoginPage.verificarTextoUsuario();               
                Assert.assertEquals(textoUsuario, response1);
                String response2 = ModalLoginPage.verificarPlaceholderUsuario();               
                Assert.assertEquals(placeholderUsuario, response2);

                String response3 = ModalLoginPage.verificarTextoSenha();               
                Assert.assertEquals(textoSenha, response3);
                String response4 = ModalLoginPage.verificarPlaceholderSenha();               
                Assert.assertEquals(placeholderSenha, response4);
        }


        @And("o botao de login {string}")
        public void o_botao_de_login(String textoBotaoLogin) {
                ModalLoginPage ModalLoginPage = new ModalLoginPage();

                String response1 = ModalLoginPage.verificarTextoBotaoLogin();
                Assert.assertEquals(textoBotaoLogin, response1);
                boolean response2 = ModalLoginPage.verificarBotaoLogin();               
                Assert.assertTrue(response2);
        }

        @Then("o botao de fechar da modal de login {string}")
        public void o_botao_de_fechar_da_modal_de_login(String idBotaoFecharModalLogin) {
                ModalLoginPage ModalLoginPage = new ModalLoginPage();

                String response = ModalLoginPage.verificarBotaoFecharModalLogin();               
                Assert.assertEquals(idBotaoFecharModalLogin, response);
        }    

}
