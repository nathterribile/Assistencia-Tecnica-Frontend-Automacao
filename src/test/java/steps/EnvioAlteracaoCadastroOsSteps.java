package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import pages.EnvioAlteracaoCadastroOsPage;

public class EnvioAlteracaoCadastroOsSteps {


        @Given("que o funcionario esta na pagina de cadastro de ordem de servico, apos atualizar os campos de cadastro com os valores anteriormente cadastrados {string} {string} {string} {string} {string} {string} {string} para {string} {string} {string}")
        public void que_o_funcionario_esta_na_pagina_de_cadastro_de_ordem_de_servico_apos_atualizar_os_campos_de_cadastro_com_os_valores_anteriormente_cadastrados_para(String textoInputProprietarioCadastrado,
                                                                                                                                                                        String textoSelectEquipamentoCadastrado,
                                                                                                                                                                        String textoSelectDataEntradaCadastrado,
                                                                                                                                                                        String textoTextareaDefeitoCadastrado,
                                                                                                                                                                        String textoSelectDataEntregaCadastrado,
                                                                                                                                                                        String textoSelectStatusCadastrado,
                                                                                                                                                                        String textoTextareaObsCadastrado,
                                                                                                                                                                        String textoSelectDataEntregaAlterado,
                                                                                                                                                                        String textoSelectStatusAlterado,
                                                                                                                                                                        String textoTextareaObsAlterado) {              
                EnvioAlteracaoCadastroOsPage EnvioAlteracaoCadastroOsPage = new EnvioAlteracaoCadastroOsPage();

                String response1 = EnvioAlteracaoCadastroOsPage.verificarTextoInputProprietario();
                Assert.assertEquals(textoInputProprietarioCadastrado, response1);

                String response2 = EnvioAlteracaoCadastroOsPage.verificarTextoSelectEquipamto(); 
                Assert.assertEquals(textoSelectEquipamentoCadastrado, response2);

                String response3 = EnvioAlteracaoCadastroOsPage.verificarTextoSelectDataEntrada();
                Assert.assertEquals(textoSelectDataEntradaCadastrado, response3);

                String response4 = EnvioAlteracaoCadastroOsPage.verificarTextoTextareaDefeito();  
                Assert.assertEquals(textoTextareaDefeitoCadastrado, response4);

                String response5 = EnvioAlteracaoCadastroOsPage.verificarTextoSelectDataEntrega();
                 Assert.assertEquals(textoSelectDataEntregaCadastrado, response5);       
                
                String response6 = EnvioAlteracaoCadastroOsPage.verificarTextoSelectStatus();
                Assert.assertEquals(textoSelectStatusCadastrado, response6);

                String response7 = EnvioAlteracaoCadastroOsPage.verificarTextoTextareaObs();
                Assert.assertEquals(textoTextareaObsCadastrado, response7);  

                EnvioAlteracaoCadastroOsPage.selecionarDataEntrega(textoSelectDataEntregaAlterado);

                EnvioAlteracaoCadastroOsPage.selecionarStatus(textoSelectStatusAlterado);
                
                EnvioAlteracaoCadastroOsPage.inputarTextareaObs(textoTextareaObsAlterado);
       
        }       
        

        @When("o funcionario clica no botao de alteracao de cadastro {string} da area de cadastro")
        public void o_funcionario_clica_no_botao_de_alteracao_de_cadastro_da_area_de_cadastro(String botaoAlterarCadastroEquipamto) throws InterruptedException {
                EnvioAlteracaoCadastroOsPage EnvioAlteracaoCadastroOsPage = new EnvioAlteracaoCadastroOsPage();

                String response = EnvioAlteracaoCadastroOsPage.verificarTextoBotaoAlterarCadastroEquipamto();
                Assert.assertEquals(botaoAlterarCadastroEquipamto, response);
                EnvioAlteracaoCadastroOsPage.clicarBotaoAlterarCadastroEquipamto();
                TimeUnit.SECONDS.sleep(5);
        }

        @Then("o sistema retorna os campos de cadastro com os valores default {string} {string} {string} {string} {string} {string} {string}")
        public void o_sistema_retorna_os_campos_de_cadastro_com_os_valores_default(String textoInputProprietario, String textoSelectEquipamento, String textoSelectDataEntrada, String textoTextareaDefeito, String textoSelectDataEntrega, String textoSelectStatus, String textoTextareaObs) {
            EnvioAlteracaoCadastroOsPage EnvioAlteracaoCadastroOsPage = new EnvioAlteracaoCadastroOsPage();

            String response1 = EnvioAlteracaoCadastroOsPage.verificarPlaceholderInputProprietario();
            Assert.assertEquals(textoInputProprietario, response1);

            String response2 = EnvioAlteracaoCadastroOsPage.verificarOptionDefaultSelectEquipamto(); 
            Assert.assertEquals(textoSelectEquipamento, response2);

            String response3 = EnvioAlteracaoCadastroOsPage.verificarOptionDefaultSelectDataEntrada();
            Assert.assertEquals(textoSelectDataEntrada, response3);

            String response4 = EnvioAlteracaoCadastroOsPage.verificarPlaceholderTextareaDefeito();  
            Assert.assertEquals(textoTextareaDefeito, response4);

            String response5 = EnvioAlteracaoCadastroOsPage.verificarOptionDefaultSelectDataEntrega();
             Assert.assertEquals(textoSelectDataEntrega, response5);       

            String response6 = EnvioAlteracaoCadastroOsPage.verificarOptionDefaultSelectStatus();
            Assert.assertEquals(textoSelectStatus, response6);

            String response7 = EnvioAlteracaoCadastroOsPage.verificarPlaceholderTextareaObs();
            Assert.assertEquals(textoTextareaObs, response7);
           
                
        } 

        @And("sera inserida uma linha com o cadastro atualizado na tabela de cadastro com as colunas preenchidas com os valores atualizados {string} {string} {string} {string} {string} {string} {string}, mais o link de alteracao de cadastro {string}")
        public void sera_inserida_uma_linha_com_o_cadastro_atualizado_na_tabela_de_cadastro_com_as_colunas_preenchidas_com_os_valores_atualizados_mais_o_link_de_alteracao_de_cadastro(String colunaProprietario, String colunaEquipamento, String colunaDataEntrada, String colunaDefeito, String colunaDataEntrega, String colunaStatus, String colunaObs, String colunaSistema) {
                EnvioAlteracaoCadastroOsPage EnvioAlteracaoCadastroOsPage = new EnvioAlteracaoCadastroOsPage();

                String response1 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaProprietario();
                Assert.assertEquals(colunaProprietario, response1);

                String response2 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaEquipamto(); 
                Assert.assertEquals(colunaEquipamento, response2);

                String response3 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaDataEntrada();
                Assert.assertEquals(colunaDataEntrada, response3);

                String response4 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaAreaDefeito();  
                Assert.assertEquals(colunaDefeito, response4);

                String response5 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaDataEntrega();
                 Assert.assertEquals(colunaDataEntrega, response5);       

                String response6 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaStatus();
                Assert.assertEquals(colunaStatus, response6);

                String response7 = EnvioAlteracaoCadastroOsPage.verificarTabelaColunaObs();
                Assert.assertEquals(colunaObs, response7);

                String response8 = EnvioAlteracaoCadastroOsPage.verificarTextoLinkColunaSistema();
                Assert.assertEquals(colunaSistema, response8);
                Boolean response9 = EnvioAlteracaoCadastroOsPage.verificarLinkColunaSistema();
                Assert.assertTrue(response9);
        }
}
