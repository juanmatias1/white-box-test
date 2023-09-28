# whiteBox_test
Exercício individual - Teste de Caixa Branca (ETAPA 1)

Este é um exemplo simples de um sistema de login em Java que se conecta a um banco de dados MySQL para autenticar um usuário. O sistema consiste em duas classes principais:

User.java
A classe User é responsável por estabelecer a conexão com o banco de dados MySQL e verificar as credenciais do usuário. Aqui estão algumas das principais funcionalidades da classe:

conectarBD(): Este método estabelece uma conexão com o banco de dados MySQL usando o driver JDBC. Certifique-se de que o driver JDBC do MySQL esteja configurado corretamente no seu projeto.

verificarUsuario(String login, String senha): Este método verifica se as credenciais fornecidas (login e senha) correspondem a um usuário no banco de dados. Ele executa uma consulta SQL para verificar a existência do usuário e atualiza a variável result para indicar o resultado da verificação.

Main.java
A classe Main contém o método main que demonstra como usar a classe User para realizar uma verificação de login. Ela instancia um objeto User, fornece credenciais de login e senha e exibe uma mensagem com base no resultado da verificação.

Configuração
Certifique-se de configurar corretamente o driver JDBC do MySQL em seu projeto antes de usar este sistema de login. Você também deve criar a tabela usuarios no banco de dados com os campos apropriados.

Uso
Para usar este sistema de login, siga estas etapas:

Execute a classe Main para iniciar o sistema.
Insira as credenciais de login e senha quando solicitado.
O sistema verificará as credenciais no banco de dados e informará se o login foi bem-sucedido ou não.
Este é apenas um exemplo simples de sistema de login em Java e pode ser aprimorado e adaptado para atender às suas necessidades específicas.

#O Sistema foi desenvolvido na IDE Eclise sendo utilizado o SpotBugs/Findbugs como TESTE DE CAIXA BRANCA:
![image]
