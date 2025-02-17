package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CadastroOsPage;

public class CadastroOsSteps {


        @Given("que o funcionario esta na pagina de cadastro de ordem de servico com os campos de cadastro preenchidos corretamente {string} {string} {string} {string} {string} {string}")
        public void que_o_funcionario_esta_na_pagina_de_cadastro_de_ordem_de_servico_com_os_campos_de_cadastro_preenchidos_corretamente(String inputProprietario, String selectEquipamento, String selectDataEntrada, String textareaDefeito, String selectDataEntrega, String selectStatus) {              
                CadastroOsPage CadastroOsPage = new CadastroOsPage();
                
                CadastroOsPage.inputarProprietario(inputProprietario); 

                CadastroOsPage.selecionarEquipamto(selectEquipamento); 

                CadastroOsPage.selecionarDataEntrada(selectDataEntrada);

                CadastroOsPage.inputarTextareaDefeito(textareaDefeito);  

                CadastroOsPage.selecionarDataEntrega(selectDataEntrega);

                CadastroOsPage.selecionarStatus(selectStatus);
       
        }

        @When("o funcionario clica no botao de cadastro de equipamento {string}")
        public void o_funcionario_clica_no_botao_de_cadastro_de_equipamento(String textoBotaoCadastroEquipamto) {
                CadastroOsPage CadastroOsPage = new CadastroOsPage();

                String response = CadastroOsPage.verificarTextoBotaoCadastroEquipamto();
                Assert.assertEquals(textoBotaoCadastroEquipamto, response);
                CadastroOsPage.clicarBotaoCadastrarEquipamto();
        }

        @Then("o sistema atualiza os campos do formulario aos seus respectivos placeholders ou option default {string} {string} {string} {string} {string} {string} {string}")
        public void o_sistema_atualiza_os_campos_do_formulario_aos_seus_respectivos_placeholders_ou_option_default(String textoInputProprietario, String textoSelectEquipamento, String textoSelectDataEntrada, String textoTextareaDefeito, String textoSelectDataEntrega, String textoSelectStatus, String textoTextareaObs)  {
                CadastroOsPage CadastroOsPage = new CadastroOsPage();

                String response1 = CadastroOsPage.verificarPlaceholderInputProprietario();
                Assert.assertEquals(textoInputProprietario, response1);

                String response2 = CadastroOsPage.verificarOptionDefaultSelectEquipamto(); 
                Assert.assertEquals(textoSelectEquipamento, response2);

                String response3 = pages.CadastroOsPage.verificarOptionDefaultSelectDataEntrada();
                Assert.assertEquals(textoSelectDataEntrada, response3);

                String response4 = CadastroOsPage.verificarPlaceholderTextareaDefeito();  
                Assert.assertEquals(textoTextareaDefeito, response4);

                String response5 = CadastroOsPage.verificarOptionDefaultSelectDataEntrega();
                 Assert.assertEquals(textoSelectDataEntrega, response5);       

                String response6 = CadastroOsPage.verificarOptionDefaultSelectStatus();
                Assert.assertEquals(textoSelectStatus, response6);

                String response7 = CadastroOsPage.verificarPlaceholderTextareaObs();
                Assert.assertEquals(textoTextareaObs, response7);

                
                
        } 

        @And("insere na tabela de cadastro de equipamento os valores cadastrados {string} {string} {string} {string} {string} {string} {string} mais o link de alteracao de cadastro {string}")
        public void insere_na_tabela_de_cadastro_de_equipamento_os_valores_cadastrados_mais_o_link_de_alteracao_de_cadastro(String colunaProprietario, String colunaEquipamento, String colunaDataEntrada, String colunaDefeito, String colunaDataEntrega, String colunaStatus, String colunaObs, String colunaSistema) {
                CadastroOsPage CadastroOsPage = new CadastroOsPage();

                String response1 = CadastroOsPage.verificarTabelaColunaProprietario();
                Assert.assertEquals(colunaProprietario, response1);

                String response2 = CadastroOsPage.verificarTabelaColunaEquipamto(); 
                Assert.assertEquals(colunaEquipamento, response2);

                String response3 = CadastroOsPage.verificarTabelaColunaDataEntrada();
                Assert.assertEquals(colunaDataEntrada, response3);

                String response4 = CadastroOsPage.verificarTabelaColunaAreaDefeito();  
                Assert.assertEquals(colunaDefeito, response4);

                String response5 = CadastroOsPage.verificarTabelaColunaDataEntrega();
                 Assert.assertEquals(colunaDataEntrega, response5);       

                String response6 = CadastroOsPage.verificarTabelaColunaStatus();
                Assert.assertEquals(colunaStatus, response6);

                String response7 = CadastroOsPage.verificarTabelaColunaObs();
                Assert.assertEquals(colunaObs, response7);

                String response8 = CadastroOsPage.verificarTextoLinkColunaSistema();
                Assert.assertEquals(colunaSistema, response8);
                Boolean response9 = CadastroOsPage.verificarLinkColunaSistema();
                Assert.assertTrue(response9);
        }

    
}
