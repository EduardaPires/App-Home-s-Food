import java.util.Scanner;
public class Cliente extends Pessoa{  

    Scanner sc = new Scanner(System.in);

    private Cozinheiros cozinheiros;
    public Cliente(String nome, String user, int senha) {
       
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
        exibirTelaCliente();
        //mostrar cozinheiros e selecioná-los para ver cardápio, onde tbm haverá seleção para realizar pedidos
        //chamará classe FazerPedido
    }

    public static void opcoesCozinheiros(){
        System.out.println(" ======= OPÇÕES DE COZINHEIROS ======= ");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. RAFAELLA BALLERINI");
        System.out.println("2. FREDDIE MERCURY");
        System.out.println("3. LUKE SKYWALKER");
        System.out.println("4. CHIHIRO");
        System.out.println("5. voltar para a tela inicial");
    }

    public void exibirTelaCliente(){
        String nome="", user="";
        int senha=0;

        System.out.println("TELA INICIAL");

        opcoesCozinheiros();
        System.out.println("==========================");
        int op = sc.nextInt();
        if (op==1) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro1();
            //System.out.println(cardapio1[0]);
        } 
        else if (op==2) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro2();   
        
        } 
        else if (op==3) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro3();
        } 
        else if (op==4) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro4();
        } 
        else if (op==5) {
        
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
 