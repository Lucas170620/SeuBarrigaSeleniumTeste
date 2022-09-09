#language:pt
Funcionalidade:  realizar Cadastro no site do SeuBarriga
  Eu como usuário do seu SeuBarriga
  desejo realizar Cadastro no site do seu barriga
  Esquema do Cenario: Realizar Cadastro email valido
    Dado que eu acesso a tela de cadastro do SeuBarriga
    Quando preencho os campos de <nome> <email> e <senha>
    E clico em cadastrar
    Entao aparece na tela "Usuário inserido com sucesso"
    Exemplos:
    |  nome |         email      |  senha   |
    |"Lucas"| "lucas9@hotmail.com"|"senha123"|
  Esquema do Cenario: Realizar Cadastro email repetido
    Dado que eu acesso a tela de cadastro do SeuBarriga
    Quando preencho os campos de <nome> <email> e <senha>
    E clico em cadastrar
    Entao aparece na tela "Usuário inserido com sucesso"
    Quando volto para a tela de cadastro
    E preencho os campos de <nome> <email> e <senha>
    E clico em cadastrar
    Entao aparece na tela "Endereço de email já utilizado"
    Exemplos:
      |  nome |         email      |  senha   |
      |"Lucas"| "lucas10@hotmail.com"|"senha123"|