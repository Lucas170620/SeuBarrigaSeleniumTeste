#language:pt
Funcionalidade:  realizar Login no site do SeuBarriga
  Eu como usuário do seu SeuBarriga
  desejo realizar LOGIN no site do seu barriga
  Esquema do Cenario: Realizar Login email valido
    Dado que eu acesso a tela de login do SeuBarriga
    Quando preencho os campos de <email> e <senha>
    E clico em entrar
    Entao aparece na tela do user "Bem vindo, Lucas!"
    Exemplos:
      |          email      |  senha   |
      | "lucas1@hotmail.com"|"senha123"|