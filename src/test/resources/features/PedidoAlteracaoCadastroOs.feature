@pedidoAlteracaoCadastroOs
Feature: PEDIDO DE ALTERACAO DE CADASTRO DE ORDEM DE SERVICO
Scenario: funcionario pede para atualizar o cadastro de ordem de servico
Given que o funcionario esta na pagina de cadastro de ordem de servico, apos cadastrar os campos de cadastro, retornando seus valores em estado default "Ex:Fulano de Tal" "Selecione o equipamento" "dd/mm/aaaa" "Ex:O defeito apresentado..." "dd/mm/aaaa" "Selecione o status" "Ex:O equipamento.."
And a primeira linha da tabela de cadastro de equipamento com os valores cadastrados "Fulano Beltrano" "Microondas" "2025-02-17" "Prato parou de rodar" "2025-02-18" "Aguardando orçamento" "" mais o link de alteracao de cadastro "Alterar"
When o funcionario clica no botao de alteracao de cadastro "Alterar"
Then o sistema retorna os campos de cadastro com os valores antes cadastrados "Fulano Beltrano" "Microondas" "17/02/2025" "Prato parou de rodar" "18/02/2025" "Aguardando orçamento" ""
And deleta a linha com o cadastro na tabela de cadastro
And inclui o botão "Alterar" na area de cadastro de equipamento