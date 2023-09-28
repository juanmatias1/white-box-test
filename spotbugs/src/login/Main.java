package login;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        String login = "seu_login"; 
        String senha = "sua_senha"; 

        boolean loginValido = user.verificarUsuario(login, senha);

        if (loginValido) {
            System.out.println("Login bem-sucedido para o usuário: " + user.nome);
        } else {
            System.out.println("Login falhou.");
        }
    }
}
