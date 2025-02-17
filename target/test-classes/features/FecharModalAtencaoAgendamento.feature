@fecharModalAtencaoAgendamento
Feature: FECHAR MODAL ATENCAO AGENDAMENTO
Scenario: Usuario clica no botao de fechar da modal Atencao de agendamento
Given que o usuario esta na modal Atencao de agendamento
When o usuario clica no botao de fechar da modal Atencao de agendamento
Then o sistema fecha a modal evidenciando o texto da Onboarding "A melhor assistência técnica de São Paulo"