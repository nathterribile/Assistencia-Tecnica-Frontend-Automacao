@modalConfirmacaoAgendamentoRetornoOnboarding
Feature: MODAL CONFIRMACAO DE AGENDAMENTO RETORNO ONBOARDING
Scenario: Usuario retorna para a pagina Onboarding apos fechar a modal de confirmacao de agendamento
Given o usuario esta na modal de confirmacao de agendamento
When o usuario clica no fechar "fecharModalAgendamento" da modal de confirmacao de agendamento
Then o sistema direciona o usuario para a pagina Onboarding com o texto "A melhor assistência técnica de São Paulo"
