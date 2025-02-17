@envioAlteracaoCadastroOs
Feature: ENVIO DE ALTERACAO DE CADASTRO DE ORDEM DE SERVICO
Scenario: funcionario atualiza e salva o cadastro de ordem de servico
Given que o funcionario esta na pagina de cadastro de ordem de servico, apos atualizar os campos de cadastro com os valores anteriormente cadastrados "Fulano Beltrano" "Microondas" "17/02/2025" "Prato parou de rodar" "18/02/2025" "Aguardando orçamento" "" para "19022025" "Aguardando aprovação" "Orçamento realizado" 
When o funcionario clica no botao de alteracao de cadastro "Alterar" da area de cadastro
Then o sistema retorna os campos de cadastro com os valores default "Ex:Fulano de Tal" "Selecione o equipamento" "dd/mm/aaaa" "Ex:O defeito apresentado..." "dd/mm/aaaa" "Selecione o status" "Ex:O equipamento.."
And sera inserida uma linha com o cadastro atualizado na tabela de cadastro com as colunas preenchidas com os valores atualizados "Fulano Beltrano" "Microondas" "2025-02-17" "Prato parou de rodar" "2025-02-19" "Aguardando aprovação" "Orçamento realizado", mais o link de alteracao de cadastro "Alterar"