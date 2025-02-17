package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AcessoPaginaAgendamentoPage;

public class AcessoPaginaAgendamentoSteps {


        @Given("que o usuario esta na modal Atencao de agendamento para acessar a pagina de agendamento")
        public void que_o_usuario_esta_na_modal_Atencao_de_agendamento_para_acessar_a_pagina_de_agendamento() {              
                
        }

        @When("o usuario clica no botao {string} da modal Atencao de agendamento")
        public void o_usuario_clica_no_botao_da_modal_Atencao_de_agendamento(String botaoAcessoAgendamento) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();

                String response = AcessoPaginaAgendamento.verificarTextoBotaoAcessoAgendamento();               
                Assert.assertEquals(botaoAcessoAgendamento, response);
                AcessoPaginaAgendamento.clicarBotaoAcessoAgendamento(); 
                
        }

        @Then("o sistema direciona o usuario para a pagina de agendamento evidenciando o header da pagina com o logo da empresa junto ao nome da empresa {string} mais o titulo {string}")
        public void o_sistema_direciona_o_usuario_para_a_pagina_de_agendamento_evidenciando_o_header_da_pagina_com_o_logo_da_empresa_junto_ao_nome_da_empresa_mais_o_titulo(String nomeEmpresa, String tituloHeader) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();

                Boolean response1 = AcessoPaginaAgendamento.verificarLogo();               
                Assert.assertTrue(response1);
                
                String response2 = AcessoPaginaAgendamento.verificarNomeEmpresa();               
                Assert.assertEquals(nomeEmpresa, response2);

                String response3 = AcessoPaginaAgendamento.verificarTituloHeader();               
                Assert.assertEquals(tituloHeader, response3);
                
        }

        @And("o formulario de agendamento com os textos {string} {string} {string} {string} {string} {string} {string}")
        public void o_formulario_de_agendamento_com_os_textos(String textoTituloBody, String textoProprietario, String textoEquipamento, String textoMarca, String textoModelo, String textoDataAgendamto, String textoDefeito) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();

                String response1 = AcessoPaginaAgendamento.verificarTextoTituloBody();               
                Assert.assertEquals(textoTituloBody, response1);

                String response2 = AcessoPaginaAgendamento.verificarTextoProprietario();               
                Assert.assertEquals(textoProprietario, response2);

                String response3 = AcessoPaginaAgendamento.verificarTextoEquipamento();               
                Assert.assertEquals(textoEquipamento, response3);

                String response4 = AcessoPaginaAgendamento.verificarTextoMarca();               
                Assert.assertEquals(textoMarca, response4);

                String response5 = AcessoPaginaAgendamento.verificarTextoDataAgendamto();               
                Assert.assertEquals(textoDataAgendamto, response5);
                
                String response6 = AcessoPaginaAgendamento.verificarTextoModelo();               
                Assert.assertEquals(textoModelo, response6);

                String response7 = AcessoPaginaAgendamento.verificarTextoDefeito();               
                Assert.assertEquals(textoDefeito, response7);           
                                
        }

        @Then("os campos do formulario de agendamento com os placeholders {string} {string}")
        public void os_campos_do_formulario_de_agendamento_com_os_placeholders(String inputProprietario, String inputDefeito) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();
                
               
                String response1 = AcessoPaginaAgendamento.verificarPlaceholderProprietario();               
                Assert.assertEquals(inputProprietario, response1);


                String response2 = AcessoPaginaAgendamento.verificarPlaceholderDefeito();               
                Assert.assertEquals(inputDefeito, response2); 
        }

        @Then("os campos do formulario de agendamento com as opcoes default {string} {string} {string}")
        public void os_campos_do_formulario_de_agendamento_com_as_opcoes_default(String optionDefaultEquipamento, String optionDefaultMarca, String optionDefaultModelo) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();
                
                String response1 = AcessoPaginaAgendamento.verificarOptionDefaultEquipamento();               
                Assert.assertEquals(optionDefaultEquipamento, response1);

                String response2 = AcessoPaginaAgendamento.verificarOptionDefaultMarca();               
                Assert.assertEquals(optionDefaultMarca, response2);                
                
                String response3 = AcessoPaginaAgendamento.verificarOptionDefaultModelo();               
                Assert.assertEquals(optionDefaultModelo, response3);
        }
        

        @And("o botao de agendamento {string} habilitado")
        public void o_botao_de_agendamento_habilitado(String botaoAgendarPaginaAgendamento) {
                AcessoPaginaAgendamentoPage AcessoPaginaAgendamento = new AcessoPaginaAgendamentoPage();

                String response1 = AcessoPaginaAgendamento.verificarTextoBotaoAgendarPaginaAgendamento();   
                Assert.assertEquals(botaoAgendarPaginaAgendamento, response1);
                Boolean response2 = AcessoPaginaAgendamento.verificarBotaoAgendarPaginaAgendamento();   
                Assert.assertTrue(botaoAgendarPaginaAgendamento, response2);
        }

   

}
