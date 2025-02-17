package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ModalConfirmacaoAgendamentoPage;

public class ModalConfirmacaoAgendamentoSteps {


        @Given("o usuario esta na pagina de agendamento com os campos preenchidos corretamente")
        public void o_usuario_esta_na_pagina_de_agendamento_com_os_campos_preenchidos_corretamente() {              
                
        }

        @When("o usuario clica no botao {string} da pagina de agendamento")
        public void o_usuario_clica_no_botao_da_pagina_de_agendamento(String botaoAcessoModalAgendamento) {
                ModalConfirmacaoAgendamentoPage ModalConfirmacaoAgendamento = new ModalConfirmacaoAgendamentoPage();

                String response = ModalConfirmacaoAgendamento.verificarTextoBotaoAcessoModalAgendamento();               
                Assert.assertEquals(botaoAcessoModalAgendamento, response);
                ModalConfirmacaoAgendamento.clicarBotaoAcessoModalAgendamento(); 
                
        }

        @Then("o sistema direciona o usuario para a modal Confirmacao de agendamento com o header {string} mais o body {string}")
        public void o_sistema_direciona_o_usuario_para_a_modal_Confirmacao_de_agendamento_com_o_header_mais_o_body(String textoHeaderModal, String textoBodyModal) {
                ModalConfirmacaoAgendamentoPage ModalConfirmacaoAgendamento = new ModalConfirmacaoAgendamentoPage();
                              
                String response1 = ModalConfirmacaoAgendamento.verificarTextoHeaderModal();               
                Assert.assertEquals(textoHeaderModal, response1);

                Boolean response2 = ModalConfirmacaoAgendamento.verificarTextoBodyModal(textoBodyModal);            
                Assert.assertTrue(response2);
                
        }      

              

        @And("o botao de fechar da modal Confirmacao de agendamento {string}")
        public void o_botao_de_fechar_modal_Confirmacao_de_agendamento(String textoFecharModalAgendamento) {
                ModalConfirmacaoAgendamentoPage ModalConfirmacaoAgendamento = new ModalConfirmacaoAgendamentoPage();

                String response = ModalConfirmacaoAgendamento.verificarIdfecharModalAgendamento();
                Assert.assertEquals(textoFecharModalAgendamento, response);
        }  

   

}
