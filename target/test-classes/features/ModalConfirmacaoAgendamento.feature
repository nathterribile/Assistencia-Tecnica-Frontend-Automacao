@modalConfirmacaoAgendamento
Feature: ACESSAR MODAL CONFIRMACAO AGENDAMENTO
Scenario: Usuario acessa a modal de confirmacao de agendamento
Given o usuario esta na pagina de agendamento com os campos preenchidos corretamente
When o usuario clica no botao "Agendar" da pagina de agendamento
Then o sistema direciona o usuario para a modal Confirmacao de agendamento com o header "Agendamento confirmado!" mais o body "Numero de agendamento: "
And o botao de fechar da modal Confirmacao de agendamento "fecharModalAgendamento"
