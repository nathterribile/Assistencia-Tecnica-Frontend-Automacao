@buscaOs
Feature: BUSCA DE ORDEM DE SERVICO
Scenario: busca de ordem de servico
Given que o funcionario esta na pagina de cadastro de ordem de servico
When o funcionario inputa o valor do id "2" da ordem de servico no campo busca
And aperta o botao de busca "Buscar"
Then o sistema insere na tabela de cadastro de equipamento os valores de cadastros do id desejado "Fulano Beltrano" "Microondas" "2025-02-17" "Prato parou de rodar" "2025-02-18" "Aguardando orçamento" "" mais o link de alteracao de cadastro "Alterar"
