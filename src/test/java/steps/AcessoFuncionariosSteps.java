package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AcessoFuncionariosPage;

public class AcessoFuncionariosSteps {


        @Given("que o funcionario esta na modal de login com os campos de login preenchidos corretamente {string} {string}")
        public void que_o_funcionario_esta_na_modal_de_login_com_os_campos_de_login_preenchidos_corretamente(String Usuario, String Senha) {              
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                AcessoFuncionarios.inputarUsuario(Usuario);
                AcessoFuncionarios.inputarSenha(Senha);                 
        }

        @When("o funcionario clica no botao login {string}")
        public void o_funcionario_clica_no_botao_login(String botaoAcessoPaginaOrdemServico) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();
                
                String response = AcessoFuncionarios.verificarTextoBotaoAcessoPaginaOrdemServico();               
                Assert.assertEquals(botaoAcessoPaginaOrdemServico, response);
                AcessoFuncionarios.clicarBotaoAcessoPaginaOrdemServico();
                
                
        }

        @Then("o sistema direciona para a pagina de ordem de servico com o header da pagina com o logo da empresa, o nome da empresa {string}, com a imagem do avatar do funcionario ao da escrita {string} mais o link de direcionamento pra Onboarding {string}")
        public void o_sistema_direciona_para_a_pagina_de_ordem_de_servico_com_o_header_da_pagina_com_o_logo_da_empresa_o_nome_da_empresa_com_a_imagem_do_avatar_do_funcionario_ao_da_escrita_mais_o_link_de_direcionamento_pra_Onboarding(String nomeEmpresa, String textoCumprimento, String linkOnboarding)  {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                Boolean response = AcessoFuncionarios.verificarLogo();               
                Assert.assertTrue(response);

                String response1 = AcessoFuncionarios.verificarNomeEmpresa();
                Assert.assertEquals(nomeEmpresa, response1);

                String response2 = AcessoFuncionarios.verificarTextoCumprimento();
                Assert.assertEquals(textoCumprimento, response2);

                String response3 = AcessoFuncionarios.verificarTextoLinkOnboarding();
                Assert.assertEquals(linkOnboarding, response3);
                
        }

        @And("o texto do header do formulario {string} da ordem de servico")
        public void o_texto_do_header_do_formulario_da_ordem_de_servico(String textoHeaderFormulario) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                String response = AcessoFuncionarios.verificarTextoHeaderFormulario();
                Assert.assertEquals(textoHeaderFormulario, response);
        }

        @And("os campos de cadastro {string} {string} {string} {string} {string} {string} {string} da pagina de ordem de servico")
        public void os_campos_de_cadastro_da_pagina_de_ordem_de_servico(String textoInputProprietario, String textoSelectEquipamento, String textoSelectDataEntrada, String textoTextareaDefeito, String textoSelectDataEntrega, String textoSelectStatus, String textoTextareaObs) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                String response1 = AcessoFuncionarios.verificarTextoInputProprietario();               
                Assert.assertEquals(textoInputProprietario, response1);
                String response2 = AcessoFuncionarios.verificarTextoSelectEquipamto();               
                Assert.assertEquals(textoSelectEquipamento, response2);
                String response3 = AcessoFuncionarios.verificarTextoSelectDataEntrada();               
                Assert.assertEquals(textoSelectDataEntrada, response3);
                String response4 = AcessoFuncionarios.verificarTextoTextareaDefeito();               
                Assert.assertEquals(textoTextareaDefeito, response4);
                String response5 = AcessoFuncionarios.verificarTextoSelectDataEntrega();               
                Assert.assertEquals(textoSelectDataEntrega, response5);
                String response6 = AcessoFuncionarios.verificarTextoSelectStatus();               
                Assert.assertEquals(textoSelectStatus, response6);
                String response7 = AcessoFuncionarios.verificarTextoITextareaObs();               
                Assert.assertEquals(textoTextareaObs, response7);
                
        }

        @Then("os seus respectivos placeholders ou option default {string} {string} {string} {string} {string} {string} {string}")
        public void os_seus_respectivos_placeholders_ou_option_default(String placeholderInputProprietario, String optionDefaultSelectEquipamento, String optionDefaultSelectDataEntrada, String placeholderTextareaDefeito, String optionDefaultSelectDataEntrega, String optionDefaultSelectStatus, String placeholderTextareaObs) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();
                
                String response1 = AcessoFuncionarios.verificarPlaceholderInputProprietario();  
                Assert.assertEquals(placeholderInputProprietario, response1);

                String response2 = AcessoFuncionarios.verificarOptionDefaultSelectEquipamto();               
                Assert.assertEquals(optionDefaultSelectEquipamento, response2);

                String response3 = AcessoFuncionariosPage.verificarOptionDefaultSelectDataEntrada();               
                Assert.assertEquals(optionDefaultSelectDataEntrada, response3);

                String response4 = AcessoFuncionarios.verificarPlaceholderTextareaDefeito();               
                Assert.assertEquals(placeholderTextareaDefeito, response4);

                String response5 = AcessoFuncionarios.verificarOptionDefaultSelectDataEntrega();
                Assert.assertEquals(optionDefaultSelectDataEntrega, response5);

                String response6 = AcessoFuncionarios.verificarOptionDefaultSelectStatus();               
                Assert.assertEquals(optionDefaultSelectStatus, response6);

                String response7 = AcessoFuncionarios.verificarPlaceholderTextareaObs();               
                Assert.assertEquals(placeholderTextareaObs, response7);
        }



        @And("o botao de cadastramento de aparelho habilitado {string} da pagina de ordem de servico")
        public void o_botao_de_cadastramento_de_aparelho_habilitado_da_pagina_de_ordem_de_servico(String textoBotaoCadastroEquipamto) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                String response = AcessoFuncionarios.verificarTextoBotaoCadastroEquipamto();               
                Assert.assertEquals(textoBotaoCadastroEquipamto, response);
                Boolean response1 = AcessoFuncionarios.verificarBotaoCadastroEquipamto();
                Assert.assertTrue(response1);
        }

        @And("o campo {string} com o seu placeholder {string} ao lado do botao de busca de cadastro de equipamento {string} habilitado")
        public void o_campo_com_o_seu_placeholder_ao_lado_do_botao_de_busca_de_cadastro_de_equipamento_habilitado(String textoInputBusca, String placeholderInputBusca, String botaoBusca) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

                String response1 = AcessoFuncionarios.verificarTextoInputBusca();               
                Assert.assertEquals(textoInputBusca, response1);
                String response2 = AcessoFuncionarios.verificarPlaceholderInputBusca();               
                Assert.assertEquals(placeholderInputBusca, response2);

                String response3 = AcessoFuncionarios.verificarTextoBotaoBusca();               
                Assert.assertEquals(botaoBusca, response3);
                Boolean response4 = AcessoFuncionarios.verificarBotaoBusca();               
                Assert.assertTrue(response4);


        }


        @And("o header da tabela de cadastro de equipamento {string} com os campos {string}")
        public void o_header_da_tabela_de_cadastro_de_equipamento_com_os_campos(String textoNomeTabelaBusca, String textoHeaderTabelaBusca) {
                AcessoFuncionariosPage AcessoFuncionarios = new AcessoFuncionariosPage();

    
                String response1 = AcessoFuncionarios.verificarTextoNomeTabelaBusca();               
                Assert.assertEquals(textoNomeTabelaBusca, response1);
                String response2 = AcessoFuncionarios.verificarTextoHeaderTabelaBusca();               
                Assert.assertEquals(textoHeaderTabelaBusca, response2);
        }
}
