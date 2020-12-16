# Automação de aplicação Web

## Pré-requisitos:

- Java 8 ou 11 LTS
- Eclipse

## Dependências utilziadas

- Cucumber 3.0.2
- Selenium 3.141.59
- Junit 4.12
- Maven 3.6.3


## Configuração das variáveis de ambiente:
**Observação: Se você já tem as variáveis de ambiente configuradas, pular para o proximo passo.** 

- JAVA_HOME C:\Program Files\Java\jdk-11.0.9
- MAVEN_HOME D:\dev\tools\apache-maven-3.6.3

**Dentro de Path adicionar:**
- %JAVA_HOME%\bin
- %MAVEN_HOME%\bin

## Abrindo o projeto no eclipse:
- Após clonar o repositório;
- Abrir o Eclipse IDE;
- Clicar em File ---> Import ---> Maven ---> Existing Maven Projects ---> Next;
    ![OpenFolder](https://i.ibb.co/4TGHGYj/Tutu.png)
	![OpenFolder](https://i.ibb.co/qYPjhs9/Tutu-1-PNG.png)

- Sera aberta a tela "Import Maven Projects";
- Clicar em Browse... ---> Localizar a pasta do repositorio clonado ---> Selecionar pasta;
- 
   	![OpenFolder](https://i.ibb.co/Zfqc5Jd/Tutu-3-PNG.png)

- Sera exibido o projeto selecionado, caso o a opção "/pom.xml" não esteja marcada, marcar;
- Clicar em Finish;
- 
  ![OpenFolder](https://i.ibb.co/ZcjxXPv/ide.png)

- Pronto ! Seu projeto esta aberto na IDE Eclipse....

#### Executando o projeto:
- Abrir o CMD/Cmder/PowerShell;
Observação: Estou utlizando o Cmder por preferência, você pode ser utilizado qualquer prompt desejado.

- Localizar a pasta do seu projeto;
- Utilizar o comando `cd D:\caminho_do_repositorio`---> Precionar a tecla "Enter";

  ![OpenFolder](https://i.ibb.co/0XwRj3x/cmder.png)
  
- Após a ação anterior, sera apresetando o prompt com o caminho do projeto;
- Pronto agora é so executar a automação;
- Digitar `mvn test`;
- Sera iniciado o processo;

   ![OpenFolder](https://i.ibb.co/MpN5Q5z/cmderex.png)
- Aguardar até que seja exibido a mensagem `BUILD SUCCESS`;
- 
   ![OpenFolder](https://i.ibb.co/JR0VNDN/cmderex.png)

- Pronto !!! Teste automatizado concluido.
  
 #### Localizando evidências: 

- Abrir a pasta do seu projeto;
- Ir até Target ---> login.thml ---> Clicar duas vezes sobre "Index.html";

   ![OpenFolder](https://i.ibb.co/Wn2nnvv/ev.png)
   
- Pronto !! 






  
