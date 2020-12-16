#language: pt
Funcionalidade: Login
    Para que eu possa que possa realizar minhas compras
    Sendo um usuário previamente cadastrado
    Posso acessar o sistema com o meu email e senha

  @Login
  Cenario: Login com sucesso
    Quando eu faço login com "guiga.vinicius@live.com" e "senha@01"
    Então devo ser autenticado
    E devo ver "Guilherme Vinicius Lincoln Martins" na area logada
    
    Esquema do Cenario:  Login sem sucesso
         Quando eu faço login com <email> e <senha>
         Então não devo ser autenticado
         E devo ver a mensagem de alerta <texto>

         Exemplos:
         |email             |senha     |texto                           |
         | "              " | "      " | "An email address required."   |
         | "404@gmail.com"  | "abc123" | "Authentication failed."       |

