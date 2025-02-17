@acessoPaginaAgendamento
Feature: ACESSAR PAGINA DE AGENDAMENTO
Scenario: Usuario acessa a pagina de agendamento
Given que o usuario esta na modal Atencao de agendamento para acessar a pagina de agendamento
When o usuario clica no botao "Agendar" da modal Atencao de agendamento
Then o sistema direciona o usuario para a pagina de agendamento evidenciando o header da pagina com o logo da empresa junto ao nome da empresa "MyAssist" mais o titulo "Pré-agendamento"
And o formulario de agendamento com os textos "Informações necessárias" "Proprietário" "Tipo de equipamento" "Marca" "Modelo" "Data desejada" "Defeito"
And os campos do formulario de agendamento com os placeholders "Ex:Fulano de Tal" "Ex:O defeito apresentado..."
And os campos do formulario de agendamento com as opcoes default "Selecione o equipamento" "Selecione a marca" "Selecione o modelo" 
And o botao de agendamento "Agendar" habilitado
