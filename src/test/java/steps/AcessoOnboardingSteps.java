package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import pages.AcessoOnboardingPage;
import pages.BasePage;

public class AcessoOnboardingSteps {

        String URL;

        @Given("que o usuario quer acessar o link {string}")
        public void que_o_usuario_quer_acessar_o_link(String endereco) {
                URL = endereco;
                
        }

        @When("o usuario clica no link")
        public void o_usuario_clica_no_link() {
                BasePage.openBrowser(URL);
        }

        @Then("o sistema direciona para a tela Onboarding evidenciando o header da pagina com o logo da empresa, o nome da empresa {string}")
        public void o_sistema_direciona_para_a_tela_Onboarding_evidenciando_o_header_da_pagina_com_o_logo_da_empresa_o_nome_da_empresa(String textoLogo) {
                AcessoOnboardingPage AcessoOnboardingPage = new AcessoOnboardingPage();

                Boolean response1 = AcessoOnboardingPage.verificarLogo();               
                Assert.assertTrue(response1);
                String response2 = AcessoOnboardingPage.verificarTextoLogo();               
                Assert.assertEquals(textoLogo, response2);  
        }

        @And("os links de navegacao {string} {string}")
        public void os_links_de_navegacao(String navServicos, String navLogin) {
                AcessoOnboardingPage AcessoOnboardingPage = new AcessoOnboardingPage();

                String response1 = AcessoOnboardingPage.verificarTextoNavServicos();               
                Assert.assertEquals(navServicos, response1);

                String response2 = AcessoOnboardingPage.verificarTextoNavLogin();               
                Assert.assertEquals(navLogin, response2);
        }
    
        

        @And("o conteudo principal com os textos de apresentacao da empresa {string} {string} {string}, mais o botao de pre agendamento {string} habilitado, ao lado da imagem de recepcao")
        public void o_conteudo_principal_com_os_textos_de_apresentacao_da_empresa_mais_o_botao_de_pre_agendamento_habilitado_ao_lado_da_imagem_de_recepcao(String textoApresentacaoHeader, String textoApresentacao, String textoAgendamento, String botaoPreAgendamento) {
                AcessoOnboardingPage AcessoOnboardingPage = new AcessoOnboardingPage();

                String response1 = AcessoOnboardingPage.verificarTextoApresentacaoHeader();               
                Assert.assertEquals(textoApresentacaoHeader, response1);

                String response2 = AcessoOnboardingPage.verificarTextoApresentacao();               
                Assert.assertEquals(textoApresentacao, response2);
                
                String response3 = AcessoOnboardingPage.verificarTextoAgendamento();               
                Assert.assertEquals(textoAgendamento, response3); 

                String response4 = AcessoOnboardingPage.verificarTextoBotaoPreAgendamento();               
                Assert.assertEquals(botaoPreAgendamento, response4);
                Boolean response5 = AcessoOnboardingPage.verificarBotaoPreAgendamento();               
                Assert.assertTrue(response5);

                Boolean response6 = AcessoOnboardingPage.verificarImagemRecepcao();               
                Assert.assertTrue(response6);
        }

        @And("o conteudo principal com o texto servicos {string}, mais os botoes dos servicos disponiveis {string} {string} {string} habilitados, junto as suas imagens")
        public void o_conteudo_principal_com_o_texto_servicos_mais_os_botoes_dos_servicos_disponiveis_habilitados_junto_as_suas_imagens(String textoServicos, String botaoComputadores, String botaoEletrodomesticos, String botaoEletronicos) {
                AcessoOnboardingPage AcessoOnboardingPage = new AcessoOnboardingPage();

                String response1 = AcessoOnboardingPage.verificarTextoServicos();               
                Assert.assertEquals(textoServicos, response1);

                Boolean response2 = AcessoOnboardingPage.verificarImagemComputadores();               
                Assert.assertTrue(response2);
                String response3 = AcessoOnboardingPage.verificarTextoBotaoComputadores();               
                Assert.assertEquals(botaoComputadores, response3);
                Boolean response4 = AcessoOnboardingPage.verificarBotaoComputadores();               
                Assert.assertTrue(response4);

                Boolean response5 = AcessoOnboardingPage.verificarImagemEletrodomesticos();               
                Assert.assertTrue(response5);
                String response6 = AcessoOnboardingPage.verificarTextoBotaoEletrodomesticos();               
                Assert.assertEquals(botaoEletrodomesticos, response6);
                Boolean response7 = AcessoOnboardingPage.verificarBotaoEletrodomesticos();               
                Assert.assertTrue(response7);

                Boolean response8 = AcessoOnboardingPage.verificarImagemEletronicos();               
                Assert.assertTrue(response8);
                String response9 = AcessoOnboardingPage.verificarTextoBotaoEletronicos();               
                Assert.assertEquals(botaoEletronicos, response9);
                Boolean response10 = AcessoOnboardingPage.verificarBotaoEletronicos();               
                Assert.assertTrue(response10);
        }

        @And("o footer com o texto {string}, mais os links das midias sociais {string} {string} {string} {string} com seus icones")
        public void o_footer_com_o_texto_mais_os_links_das_midias_sociais_com_seus_icones(String textoFooter, String iDlinktTwitter, String iDlinkInstagram, String iDlinkYouTube, String iDlinkFacebook) {
                AcessoOnboardingPage AcessoOnboardingPage = new AcessoOnboardingPage();

                String response1 = AcessoOnboardingPage.verificarTextoFooter();               
                Assert.assertEquals(textoFooter, response1);

                String response2 = AcessoOnboardingPage.verificarIdLinktTwitter();               
                Assert.assertEquals(iDlinktTwitter, response2);

                String response3 = AcessoOnboardingPage.verificarIdLinkInstagram();               
                Assert.assertEquals(iDlinkInstagram, response3);

                String response4 = AcessoOnboardingPage.verificarIdLinkYouTube();               
                Assert.assertEquals(iDlinkYouTube, response4);
                
                String response5 = AcessoOnboardingPage.verificarIdLinkFacebook();               
                Assert.assertEquals(iDlinkFacebook, response5);
        }

}
