package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CampoEquipamentoPaginaAgendamentoPage;

public class CampoEquipamentoPaginaAgendamentoSteps {


        @Given("que o usuario esta na pagina de agendamento para selecionar o tipo de equipamento")
        public void que_o_usuario_esta_na_pagina_de_agendamento_para_selecionar_o_tipo_de_equipamento() {
                
        }

        @When("o usuario seleciona o equipamento {string}")
        public void o_usuario_seleciona_o_equipamento(String equipamento){
                CampoEquipamentoPaginaAgendamentoPage CampoEquipamentoPaginaAgendamentoPage = new CampoEquipamentoPaginaAgendamentoPage();
                CampoEquipamentoPaginaAgendamentoPage.inputarEquipamento(equipamento);
        }

        @Then("o sistema mostra as seguintes opcoes para o campo marca {string}")
        public void o_sistema_mostra_as_seguintes_opcoes_para_o_campo_marca(String marcas) {
                CampoEquipamentoPaginaAgendamentoPage CampoEquipamentoPaginaAgendamentoPage = new CampoEquipamentoPaginaAgendamentoPage();
                CampoEquipamentoPaginaAgendamentoPage.clicarInputMarca();
                String response = CampoEquipamentoPaginaAgendamentoPage.verificarMarca();
                
                response = response.replace("\n"," ");
                Assert.assertEquals(marcas, response);
                
        }


           
}
