package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ModalConfirmacaoAgendamentoRetornoOnboardingPage;

public class ModalConfirmacaoAgendamentoRetornoOnboardingSteps {


        @Given("o usuario esta na modal de confirmacao de agendamento")
        public void o_usuario_esta_na_modal_de_confirmacao_de_agendamento()  {              
                
        }

        @When("o usuario clica no fechar {string} da modal de confirmacao de agendamento")
        public void o_usuario_clica_no_fechar_da_modal_de_confirmacao_de_agendamento(String textoBotaoFecharModalConfirmacaoAgendamento) {
                ModalConfirmacaoAgendamentoRetornoOnboardingPage ModalConfirmacaoAgendamentoRetornoOnboarding = new ModalConfirmacaoAgendamentoRetornoOnboardingPage();

                String response = ModalConfirmacaoAgendamentoRetornoOnboarding.verificarTextoBotaoFecharModalConfirmacaoAgendamento();               
                Assert.assertEquals(textoBotaoFecharModalConfirmacaoAgendamento, response);
                ModalConfirmacaoAgendamentoRetornoOnboarding.clicarbotaoFecharModalConfirmacaoAgendamento(); 
                
        }

        @Then("o sistema direciona o usuario para a pagina Onboarding com o texto {string}")
        public void o_sistema_direciona_o_usuario_para_a_pagina_Onboarding_com_o_texto(String textoApresentacaoOnboarding) {
                ModalConfirmacaoAgendamentoRetornoOnboardingPage ModalConfirmacaoAgendamentoRetornoOnboarding = new ModalConfirmacaoAgendamentoRetornoOnboardingPage();
                              
                String response1 = ModalConfirmacaoAgendamentoRetornoOnboarding.verificarTextoApresentacaoOnboarding();               
                Assert.assertEquals(textoApresentacaoOnboarding, response1);

                
        }      

         

}
