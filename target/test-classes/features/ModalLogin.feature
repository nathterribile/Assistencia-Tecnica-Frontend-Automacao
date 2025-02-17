@modalLogin
Feature: ACESSO MODAL LOGIN
Scenario: Usuario clica no botao Mais informacoes aqui da Tela Onboarding
Given que o usuario esta na tela Onboarding para acessar a area de login de funcionarios
When o usuario clica no botao de login "Login"
Then o sistema direciona para a modal de login com o texto "Área de login - Funcionários"
And os campos de login "Usuário" "Senha" com seus placeholders "Ex: user123456" "Ex: suasenha123456"
And o botao de login "Acessar"
And o botao de fechar da modal de login "FecharModalLogin"