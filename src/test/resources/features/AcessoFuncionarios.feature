@acessoFuncionario
Feature: ACESSO DE FUNCIONARIOS A PAGINA DE ORDEM DE SERVICO
Scenario: acesso a pagina da ordem de servico
Given que o funcionario esta na modal de login com os campos de login preenchidos corretamente "Fulano13" "Fulan2025"
When o funcionario clica no botao login "Acessar"
Then o sistema direciona para a pagina de ordem de servico com o header da pagina com o logo da empresa, o nome da empresa "MyAssist", com a imagem do avatar do funcionario ao da escrita "Olá, funcionário." mais o link de direcionamento pra Onboarding "Finalizar sessão"
And o texto do header do formulario "Cadastrar o equipamento" da ordem de servico
And os campos de cadastro "Proprietário" "Tipo de equipamento" "Entrada laboratório" "Defeito" "Previsão de Entrega" "Status do conserto" "Observações" da pagina de ordem de servico
And os seus respectivos placeholders ou option default "Ex:Fulano de Tal" "Selecione o equipamento" "dd/mm/aaaa" "Ex:O defeito apresentado..." "dd/mm/aaaa" "Selecione o status" "Ex:O equipamento.."
And o botao de cadastramento de aparelho habilitado "Cadastrar Equipamento" da pagina de ordem de servico
And o campo "Realizar Busca" com o seu placeholder "Buscar aparelho..." ao lado do botao de busca de cadastro de equipamento "Buscar" habilitado
And o header da tabela de cadastro de equipamento "Resultado da Busca" com os campos "Código Proprietário Equipamento Entrada Defeito Entrega Status Observações Sistema"
