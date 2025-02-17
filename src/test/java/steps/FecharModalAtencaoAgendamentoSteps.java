package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.FecharModalAtencaoAgendamentoPage;

public class FecharModalAtencaoAgendamentoSteps {


        @Given("que o usuario esta na modal Atencao de agendamento")
        public void que_o_usuario_esta_na_modal_Atencao_de_agendamento() {              
                
        }

        @When("o usuario clica no botao de fechar da modal Atencao de agendamento")
        public void o_usuario_clica_no_botao_de_fechar_da_modal_Atencao_de_agendamento() {
        FecharModalAtencaoAgendamentoPage FecharModalAtencaoAgendamentoPage = new FecharModalAtencaoAgendamentoPage();
        FecharModalAtencaoAgendamentoPage.clicarBotaoFecharModal(); 
                
        }

        @Then("o sistema fecha a modal evidenciando o texto da Onboarding {string}")
        public void o_sistema_fecha_a_modal_evidenciando_o_texto_da_Onboarding(String texto) {
        FecharModalAtencaoAgendamentoPage FecharModalAtencaoAgendamentoPage = new FecharModalAtencaoAgendamentoPage();
        String response = FecharModalAtencaoAgendamentoPage.verificarTexto();               
        Assert.assertEquals(texto, response);               
        }   
}
