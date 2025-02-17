@campoEquipamentoPaginaAgendamento
Feature: SELEÇAO DE EQUIPAMENTO PAGINA DE AGENDAMENTO

Scenario Outline: Usuario seleciona o tipo de equipamento na pagina de agendamento
Given que o usuario esta na pagina de agendamento para selecionar o tipo de equipamento
When o usuario seleciona o equipamento <equipamento>
Then o sistema mostra as seguintes opcoes para o campo marca <marcas>

Examples:
|equipamento|marcas|
|"smartphone"|"Apple Samsung Motorola"|
|"tablet"|"Apple Samsung Lenovo"|
|"notebook"|"Apple Samsung"|