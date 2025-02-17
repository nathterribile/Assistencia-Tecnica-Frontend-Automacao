@modalAtencaoAgendamento
Feature: ACESSO MODAL ATENCAO AGENDAMENTO
Scenario: Usuario clica no botao Mais informacoes aqui da Tela Onboarding
Given que o usuario esta na tela Onboarding
When o usuario clica no botao "Mais informações aqui"
Then o sistema direciona para a tela Onboarding com os textos "ATENÇÃO" "Pré-agendamento somente para smartphone, tablets e notebooks."
And o botao de fechar da modal Atencao de agendamento
And o botao de direcionamento para a pagina de agendamento "Agendar" habilitado