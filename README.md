# whiteBox_test
Exercício individual - Teste de Caixa Branca (ETAPA 1)

Este é um exemplo simples de um sistema de login em Java que se conecta a um banco de dados MySQL para autenticar um usuário. O sistema consiste em duas classes principais:

# User.java
A classe User é responsável por estabelecer a conexão com o banco de dados MySQL e verificar as credenciais do usuário. Aqui estão algumas das principais funcionalidades da classe:

conectarBD(): Este método estabelece uma conexão com o banco de dados MySQL usando o driver JDBC. Certifique-se de que o driver JDBC do MySQL esteja configurado corretamente no seu projeto.

verificarUsuario(String login, String senha): Este método verifica se as credenciais fornecidas (login e senha) correspondem a um usuário no banco de dados. Ele executa uma consulta SQL para verificar a existência do usuário e atualiza a variável result para indicar o resultado da verificação.

# Main.java
A classe Main contém o método main que demonstra como usar a classe User para realizar uma verificação de login. Ela instancia um objeto User, fornece credenciais de login e senha e exibe uma mensagem com base no resultado da verificação.

Configuração
Certifique-se de configurar corretamente o driver JDBC do MySQL em seu projeto antes de usar este sistema de login. Você também deve criar a tabela usuarios no banco de dados com os campos apropriados.

Uso
Para usar este sistema de login, siga estas etapas:

Execute a classe Main para iniciar o sistema.
Insira as credenciais de login e senha quando solicitado.
O sistema verificará as credenciais no banco de dados e informará se o login foi bem-sucedido ou não.
Este é apenas um exemplo simples de sistema de login em Java e pode ser aprimorado e adaptado para atender às suas necessidades específicas.

# O Sistema foi desenvolvido na IDE Eclise sendo utilizado o SpotBugs/Findbugs como TESTE DE CAIXA BRANCA:
![Capturar](https://github.com/juanmatias1/whiteBox_test/assets/82182479/9b711e72-adc8-4771-8f9d-aa0615e25f72)

# Etapa 2

## 1. Identificação de Pontos no Código:
![image](https://github.com/juanmatias1/whiteBox_test/assets/82182479/99cd784c-0eb9-44e3-a0e1-2983f4ab77e9)

## 1.1 Nodos identificados:
1. Início
2. Chamada de Função (conectarBD)
   2.1. Ponto de saída (conn)
3. Atribuição (nome="")
4. Atribuição (result=false)
5. Ponto de entrada (login, senha)
6. Chamada de Função (verificarUsuario)
   6.1. Ponto de saída (result, nome)
7. Fim

## 2. Criação do Grafo de Fluxo:
![image](https://github.com/juanmatias1/whiteBox_test/assets/82182479/571e428c-ce55-4a17-abc2-04081f443b1d)

## 3. Cálculo da Complexidade Ciclomática:

A fórmula correta para calcular a complexidade ciclomática (V(G)) é:

V(G) = E - N + 2P

E = 20 (número de arestas),
N = 21 (número de nodos),
P = 1 (um único componente conexo).

V(G) = 20 - 21 + 2 \times 1 = 20

Então, a complexidade ciclomática para o código é V(G) = 20.

## 4. Identificação de Caminhos:

O caminho possível no grafo de fluxo pode ser identificado da seguinte forma:

P1:1→2→3→4→5→6→7→8→9→10→11→12→13→14→15→16→17→18→19→20→21
