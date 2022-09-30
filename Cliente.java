import java.util.Scanner;
public class Cliente extends Pessoa{  

    Scanner sc = new Scanner(System.in);

    public Cliente(String nome, String user, int senha) {
       // super(nome, user, senha);
    }

    public Pessoa CadastroCliente() {
        Pessoa perfil = new Pessoa(); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        perfil.setSenha(senha);
        String user = "Cliente";
        perfil.setUser(user);
        return perfil;
    }

    public void EntrarCliente() {
        // Pessoa pessoa=CadastroCliente();
        // System.out.println("Digite seu nome de usuário: ");
        // String nome = sc.nextLine();
        // System.out.println("Digite sua senha: ");
        // int senha = sc.nextInt();
        // while (senha != pessoa.getSenha()) {
        //     System.out.println("Senha incorreta!");
        //     senha = sc.nextInt();
        // }
        menu();
        //mostrar cozinheiros e selecioná-los para ver cardápio, onde tbm haverá seleção para realizar pedidos
        //chamará classe FazerPedido
    }
    public void exibirTelaCliente(){

        System.out.println("TELA INICIAL");

        System.out.println("ESCOLHA UM COZINHEIRO: ");
        //for (int i = 0; i < quantidadedecozinheiros.length; i++) {
            //System.out.println("i - nomecozinheiro[i] ");
        //}
        System.out.println("==========================");
        int cozinheiro = sc.nextInt();
        if (cozinheiro==1) {
            //System.out.println(obj cozinheiro1); --> da classe pessoa 
            //vai aparecer nome, 

        } 
        else if (cozinheiro==2) {
        
        } 
        else if (cozinheiro==3) {
        
        } 
        else if (cozinheiro==4) {
        
        } 
        else if (cozinheiro==5) {
        
        } 
        else if (cozinheiro==6) {
        }
        
        
    }
   

   /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa perfil = new Pessoa();
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        perfil.setSenha(senha);
        String user = "Cliente";
        perfil.setUser(user);
        System.out.println(perfil.toString());
        int password = 123;
        if (perfil.getSenha() == password) {
            System.out.println("a senha já existe");
        }
    }*/

    public void menu(){
        Pessoa pessoa=CadastroCliente();
        System.out.println(pessoa.toString());
    }

}
 