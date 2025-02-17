package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import pages.PedidoAlteracaoCadastroOsPage;

public class PedidoAlteracaoCadastroOsSteps {


        @Given("que o funcionario esta na pagina de cadastro de ordem de servico, apos cadastrar os campos de cadastro, retornando seus valores em estado default {string} {string} {string} {string} {string} {string} {string}")
        public void que_o_funcionario_esta_na_pagina_de_cadastro_de_ordem_de_servico_apos_cadastrar_os_campos_de_cadastro_retornando_seus_valores_em_estado_default(String placeholderInputProprietario, String optionDefaultSelectEquipamento,String OptionDefaultSelectDataEntrada,String placeholderTextareaDefeito,String OptionDefaultSelectDataEntrega,String OptionDefaultSelectStatus, String placeholderTextareaObs) {              
                PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

                String response1 = PedidoAlteracaoCadastroOsPage.verificarPlaceholderInputProprietario();
                Assert.assertEquals(placeholderInputProprietario, response1);

                String response2 = PedidoAlteracaoCadastroOsPage.verificarOptionDefaultSelectEquipamto(); 
                Assert.assertEquals(optionDefaultSelectEquipamento, response2);

                String response3 = PedidoAlteracaoCadastroOsPage.verificarOptionDefaultSelectDataEntrada();
                Assert.assertEquals(OptionDefaultSelectDataEntrada, response3);

                String response4 = PedidoAlteracaoCadastroOsPage.verificarPlaceholderTextareaDefeito();  
                Assert.assertEquals(placeholderTextareaDefeito, response4);

                String response5 = PedidoAlteracaoCadastroOsPage.verificarOptionDefaultSelectDataEntrega();
                 Assert.assertEquals(OptionDefaultSelectDataEntrega, response5);       

                String response6 = PedidoAlteracaoCadastroOsPage.verificarOptionDefaultSelectStatus();
                Assert.assertEquals(OptionDefaultSelectStatus, response6);

                String response7 = PedidoAlteracaoCadastroOsPage.verificarPlaceholderTextareaObs();
                Assert.assertEquals(placeholderTextareaObs, response7);
       
        }

        @And("a primeira linha da tabela de cadastro de equipamento com os valores cadastrados {string} {string} {string} {string} {string} {string} {string} mais o link de alteracao de cadastro {string}")
        public void a_primeira_linha_da_tabela_de_cadastro_de_equipamento_com_os_valores_cadastrados_mais_o_link_de_alteracao_de_cadastro(String colunaProprietario,String colunaEquipamento,String colunaDataEntrada,String colunaDefeito,String colunaDataEntrega,String colunaStatus,String colunaObs,String colunaSistema) {
            PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

                String response1 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaProprietario();
                Assert.assertEquals(colunaProprietario, response1);

                String response2 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaEquipamto(); 
                Assert.assertEquals(colunaEquipamento, response2);

                String response3 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaDataEntrada();
                Assert.assertEquals(colunaDataEntrada, response3);

                String response4 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaAreaDefeito();  
                Assert.assertEquals(colunaDefeito, response4);

                String response5 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaDataEntrega();
                 Assert.assertEquals(colunaDataEntrega, response5);       

                String response6 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaStatus();
                Assert.assertEquals(colunaStatus, response6);

                String response7 = PedidoAlteracaoCadastroOsPage.verificarTabelaColunaObs();
                Assert.assertEquals(colunaObs, response7);

                String response8 = PedidoAlteracaoCadastroOsPage.verificarTextoLinkColunaSistema();
                Assert.assertEquals(colunaSistema, response8);
                Boolean response9 = PedidoAlteracaoCadastroOsPage.verificarLinkColunaSistema();
                Assert.assertTrue(response9);
        }

        @When("o funcionario clica no botao de alteracao de cadastro {string}")
        public void o_funcionario_clica_no_botao_de_alteracao_de_cadastro(String botaoColunaSistema) throws InterruptedException {
                PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

                String response = PedidoAlteracaoCadastroOsPage.verificarTextoBotaoColunaSistema();
                Assert.assertEquals(botaoColunaSistema, response);
                PedidoAlteracaoCadastroOsPage.clicarBotaoColunaSistema();                
                TimeUnit.SECONDS.sleep(10);
        }

        @Then("o sistema retorna os campos de cadastro com os valores antes cadastrados {string} {string} {string} {string} {string} {string} {string}")
        public void o_sistema_retorna_os_campos_de_cadastro_com_os_valores_antes_cadastrados(String textoInputProprietario, String textoSelectEquipamento, String textoSelectDataEntrada, String textoTextareaDefeito, String textoSelectDataEntrega, String textoSelectStatus, String textoTextareaObs)  {
            PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

                String response1 = PedidoAlteracaoCadastroOsPage.verificarTextoInputProprietario();
                Assert.assertEquals(textoInputProprietario, response1);

                String response2 = PedidoAlteracaoCadastroOsPage.verificarTextoSelectEquipamto(); 
                Assert.assertEquals(textoSelectEquipamento, response2);

                String response3 = PedidoAlteracaoCadastroOsPage.verificarTextoSelectDataEntrada();
                Assert.assertEquals(textoSelectDataEntrada, response3);

                String response4 = PedidoAlteracaoCadastroOsPage.verificarTextoTextareaDefeito();  
                Assert.assertEquals(textoTextareaDefeito, response4);

                String response5 = PedidoAlteracaoCadastroOsPage.verificarTextoSelectDataEntrega();
                 Assert.assertEquals(textoSelectDataEntrega, response5);       

                String response6 = PedidoAlteracaoCadastroOsPage.verificarTextoSelectStatus();
                Assert.assertEquals(textoSelectStatus, response6);

                String response7 = PedidoAlteracaoCadastroOsPage.verificarTextoTextareaObs();
                Assert.assertEquals(textoTextareaObs, response7);                
                
        } 

        @And("deleta a linha com o cadastro na tabela de cadastro")
        public void deleta_a_linha_com_o_cadastro_na_tabela_de_cadastro() {
                PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

                boolean response = PedidoAlteracaoCadastroOsPage.verificarSemLinhaTabelaCadastro();
                Assert.assertFalse(response);
        } 

        @And("inclui o botão {string} na area de cadastro de equipamento")
        public void inclui_o_bot_o_na_area_de_cadastro_de_equipamento(String textoBotaoAlterarCadastroEquipamto) {
            PedidoAlteracaoCadastroOsPage PedidoAlteracaoCadastroOsPage = new PedidoAlteracaoCadastroOsPage();

            String response = PedidoAlteracaoCadastroOsPage.verificarTextoBotaoAlterarCadastroEquipamto();
            Assert.assertEquals(textoBotaoAlterarCadastroEquipamto, response);
            PedidoAlteracaoCadastroOsPage.clicarBotaoAlterarCadastroEquipamto();
        }

    

   

}
