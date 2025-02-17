package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BuscaOsPage;

public class BuscaOsSteps {


        @Given("que o funcionario esta na pagina de cadastro de ordem de servico")
        public void que_o_funcionario_esta_na_pagina_de_cadastro_de_ordem_de_servico() { 
        }

        @When("o funcionario inputa o valor do id {string} da ordem de servico no campo busca")
        public void o_funcionario_inputa_o_valor_do_id_da_ordem_de_servico_no_campo_busca(String id) {
                BuscaOsPage BuscaOsPage = new BuscaOsPage();

                BuscaOsPage.inputarId(id);
        }

        @And("aperta o botao de busca {string}")
        public void aperta_o_botao_de_busca(String textoBotaoBusca) {
                BuscaOsPage BuscaOsPage = new BuscaOsPage();
                
                String response = BuscaOsPage.verificarTextoBotaoBusca();
                Assert.assertEquals(textoBotaoBusca, response);
                BuscaOsPage.clicarBotaoBusca();
        }

        @Then("o sistema insere na tabela de cadastro de equipamento os valores de cadastros do id desejado {string} {string} {string} {string} {string} {string} {string} mais o link de alteracao de cadastro {string}")
        public void o_sistema_insere_na_tabela_de_cadastro_de_equipamento_os_valores_de_cadastros_do_id_desejado_mais_o_link_de_alteracao_de_cadastro(String colunaProprietario, String colunaEquipamento, String colunaDataEntrada, String colunaDefeito, String colunaDataEntrega, String colunaStatus, String colunaObs, String colunaSistema) {
                BuscaOsPage BuscaOsPage = new BuscaOsPage();

                String response1 = BuscaOsPage.verificarTabelaColunaProprietario();
                Assert.assertEquals(colunaProprietario, response1);

                String response2 = BuscaOsPage.verificarTabelaColunaEquipamto(); 
                Assert.assertEquals(colunaEquipamento, response2);

                String response3 = BuscaOsPage.verificarTabelaColunaDataEntrada();
                Assert.assertEquals(colunaDataEntrada, response3);

                String response4 = BuscaOsPage.verificarTabelaColunaAreaDefeito();  
                Assert.assertEquals(colunaDefeito, response4);

                String response5 = BuscaOsPage.verificarTabelaColunaDataEntrega();
                 Assert.assertEquals(colunaDataEntrega, response5);       

                String response6 = BuscaOsPage.verificarTabelaColunaStatus();
                Assert.assertEquals(colunaStatus, response6);

                String response7 = BuscaOsPage.verificarTabelaColunaObs();
                Assert.assertEquals(colunaObs, response7);

                String response8 = BuscaOsPage.verificarTextoLinkColunaSistema();
                Assert.assertEquals(colunaSistema, response8);
                Boolean response9 = BuscaOsPage.verificarLinkColunaSistema();
                Assert.assertTrue(response9);
        }

    
}
