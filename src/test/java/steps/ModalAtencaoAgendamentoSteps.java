package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.ModalAtencaoAgendamentoPage;

public class ModalAtencaoAgendamentoSteps {


        @Given("que o usuario esta na tela Onboarding")
        public void que_o_usuario_esta_na_tela_Onboarding() {              
                
        }

        @When("o usuario clica no botao {string}")
        public void o_usuario_clica_no_botao(String textoBotao) {
        ModalAtencaoAgendamentoPage ModalAtencaoAgendamentoPage = new ModalAtencaoAgendamentoPage();

        String response = ModalAtencaoAgendamentoPage.verificarTextoBotaoAcessoModal();               
        Assert.assertEquals(textoBotao, response);
        ModalAtencaoAgendamentoPage.clicarBotaoAcessoModal(); 
                
        }

        @Then("o sistema direciona para a tela Onboarding com os textos {string} {string}")
        public void o_sistema_direciona_para_a_tela_Onboarding_com_os_textos(String textoHeader, String textoBody) {
                ModalAtencaoAgendamentoPage ModalAtencaoAgendamentoPage = new ModalAtencaoAgendamentoPage();

                String response1 = ModalAtencaoAgendamentoPage.verificarTextoHeader();               
                Assert.assertEquals(textoHeader, response1);

                String response2 = ModalAtencaoAgendamentoPage.verificarTextoBody();               
                Assert.assertEquals(textoBody, response2);
                
        }

        @And("o botao de fechar da modal Atencao de agendamento")
        public void o_botao_de_fechar_da_modal_Atencao_de_agendamento() {
                ModalAtencaoAgendamentoPage ModalAtencaoAgendamentoPage = new ModalAtencaoAgendamentoPage();
                
                boolean response = ModalAtencaoAgendamentoPage.verificarBotaoFechar();  
                Assert.assertTrue(response);
        }

        @And("o botao de direcionamento para a pagina de agendamento {string} habilitado")
        public void o_botao_de_direcionamento_para_a_pagina_de_agendamento_habilitado(String botaoAgendar) {
                ModalAtencaoAgendamentoPage ModalAtencaoAgendamentoPage = new ModalAtencaoAgendamentoPage();
                
                String response = ModalAtencaoAgendamentoPage.verificarTextoBotaoAgendar();               
                Assert.assertEquals(botaoAgendar, response);
                boolean response1 = ModalAtencaoAgendamentoPage.verificarBotaoAgendar();  
                Assert.assertTrue(response1);
        }        

}
