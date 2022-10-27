import java.util.Scanner;
public class Cliente extends Pessoa{  

    Scanner sc = new Scanner(System.in);
    FazerPedido pedido;
    String nome="", user="";
    int senha=0;
    Pessoa perfil = new Pessoa(nome, user, senha);
    private Cozinheiros cozinheiros;
    
    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
       this.pedido = pedido;
    }

    public Pessoa CadastroCliente() {
        //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite uma senha numérica: ");
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cliente";
        perfil.setUser(user);
        return perfil; //vai adicionar na lista! onde isso acontece?
    }

    public int CompareTo(Cliente cliente){
        int resultado = this.getNome().compareTo(cliente.getNome());
        return resultado;
    }

    public Pessoa EntrarCliente() {
       // menu();
        System.out.println("Digite seu nome de usuário: ");
        String nomeInserido = sc.nextLine();
        nomeInserido = sc.nextLine();
        //nomeInserido = sc.nextLine();

        System.out.println("Digite uma senha numérica: ");
        int senhaInserida = sc.nextInt();
        user = "Cliente";

        Pessoa login = new Pessoa(nomeInserido, user, senhaInserida);
        return login;
    }

    public static void opcoesCozinheiros() {
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
        int qtd=0;
        opcoesCozinheiros();
        System.out.println("==========================");
        int op = sc.nextInt();
        if (op==1) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro1();
            //fazerpedido
            //System.out.println(cardapio1[0]);
            qtd++;
        } 
        else if (op==2) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro2();   
            qtd++;
        
        } 
        else if (op==3) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro3();
            qtd++;
        } 
        else if (op==4) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro4();
            qtd++;
        } 
        else if (op==5) {
            
        }

    }

}
 