@acessoOnboarding
Feature: ACESSO TELA ONBOARDING
Scenario: Usuario acessa a tela Onboarding
Given que o usuario quer acessar o link "http://localhost:1200/"
When o usuario clica no link
Then o sistema direciona para a tela Onboarding evidenciando o header da pagina com o logo da empresa, o nome da empresa "MyAssist"
And os links de navegacao "Serviços" "Login"
And o conteudo principal com os textos de apresentacao da empresa "A melhor assistência técnica de São Paulo" "Oferecemos assistência técnica especializada, com reparo com uso de peças originais e garantia de serviço. Contamos com profissionais qualificados e constantemente treinados." "Evite filas e faça um pré-agendamento antes de deslocar-se ao Centro de Serviço para realizar a Assistência Técnica de seu smartphone, tablet ou notebook.", mais o botao de pre agendamento "Mais informações aqui" habilitado, ao lado da imagem de recepcao
And o conteudo principal com o texto servicos "Serviços", mais os botoes dos servicos disponiveis "Computadores" "Eletrodomésticos" "Eletrônicos" habilitados, junto as suas imagens
And o footer com o texto "MyAssist - Todos os direitos reservados - 2024", mais os links das midias sociais "twitter" "instagram" "youtube" "facebook" com seus icones