@cadastroOs
Feature: CADASTRO DE ORDEM DE SERVICO
Scenario: cadastro de ordem de servico
Given que o funcionario esta na pagina de cadastro de ordem de servico com os campos de cadastro preenchidos corretamente "Fulano Beltrano" "Microondas" "17022025" "Prato parou de rodar" "18022025" "Aguardando orçamento"
When o funcionario clica no botao de cadastro de equipamento "Cadastrar Equipamento"
Then o sistema atualiza os campos do formulario aos seus respectivos placeholders ou option default "Ex:Fulano de Tal" "Selecione o equipamento" "dd/mm/aaaa" "Ex:O defeito apresentado..." "dd/mm/aaaa" "Selecione o status" "Ex:O equipamento.."
And  insere na tabela de cadastro de equipamento os valores cadastrados "Fulano Beltrano" "Microondas" "2025-02-17" "Prato parou de rodar" "2025-02-18" "Aguardando orçamento" "" mais o link de alteracao de cadastro "Alterar"
