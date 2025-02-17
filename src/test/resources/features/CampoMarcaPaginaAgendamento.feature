@campoMarcaPaginaAgendamento
Feature: SELEÇAO DE MARCA PAGINA DE AGENDAMENTO

Scenario Outline: Usuario seleciona a marca do equipamento na pagina de agendamento
Given que o usuario esta na pagina de agendamento com o tipo de equipamento ja selecionado <equipamento>
When o usuario seleciona a marca <marca>
Then o sistema mostra as seguintes opcoes para o campo modelo <modelos>

Examples:
|equipamento|marca|modelos|
|"smartphone"|"Apple"|'Iphone SE Iphone 12 Iphone 13 Iphone 14'|
|"smartphone"|"Samsung"|"Galaxy S8 Galaxy A51"|
|"smartphone"|"Motorola"|"Moto G54 Moto E22"|
|"tablet"|"Apple"|'iPad 9th iPad 10th iPad Pro 13'|
|"tablet"|"Samsung"|'A9 S6 Light S9'|
|"tablet"|"Lenovo"|'M9 P12'|
|"notebook"|"Apple"|'Macbook Air Macbook Pro'|
|"notebook"|"Samsung"|'Galaxy Book 2 Galaxy Book 4 Galaxy Book Go'|

