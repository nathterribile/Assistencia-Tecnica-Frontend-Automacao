package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.CampoMarcaPaginaAgendamentoPage;




public class CampoMarcaPaginaAgendamentoSteps {
        
                           

        @Given("que o usuario esta na pagina de agendamento com o tipo de equipamento ja selecionado {string}")
        public void que_o_usuario_esta_na_pagina_de_agendamento_com_o_tipo_de_equipamento_ja_selecionado(String equipamento) {              
                CampoMarcaPaginaAgendamentoPage CampoMarcaPaginaAgendamentoPage = new CampoMarcaPaginaAgendamentoPage();
                CampoMarcaPaginaAgendamentoPage.inputarEquipamento(equipamento);
        }

        @When("o usuario seleciona a marca {string}")
        public void o_usuario_seleciona_a_marca(String marca) throws InterruptedException{
                CampoMarcaPaginaAgendamentoPage CampoMarcaPaginaAgendamentoPage = new CampoMarcaPaginaAgendamentoPage();
                CampoMarcaPaginaAgendamentoPage.InputarMarca(marca);
        }
        
        @Then("o sistema mostra as seguintes opcoes para o campo modelo {string}")
        public void o_sistema_mostra_as_seguintes_opcoes_para_o_campo_modelo(String modelos) throws InterruptedException {
                CampoMarcaPaginaAgendamentoPage CampoMarcaPaginaAgendamentoPage = new CampoMarcaPaginaAgendamentoPage();
                String response = CampoMarcaPaginaAgendamentoPage.verificarModelo();                
                response = response.replace("\n"," ");       
                Assert.assertEquals(modelos, response);
                CampoMarcaPaginaAgendamentoPage.clicarModelo();
                
        }
        
                   
}
