import java.util.Scanner;
public class Cliente extends Pessoa{  

    Scanner sc = new Scanner(System.in);

    private Cozinheiros cozinheiros;
    public Cliente(String nome, String user, int senha) {
       super(nome, user, senha);
    }

    public Pessoa CadastroCliente() {
        String nome="", user="";
        int senha=0;
        Pessoa perfil = new Pessoa(nome, nome, senha); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cliente";
        perfil.setUser(user);
        return perfil;
    }

    public void EntrarCliente() {
        menu();
        exibirTelaCliente();
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
        System.out.println("TELA INICIAL");
        opcoesCozinheiros();
        System.out.println("==========================");
        int cozinheiro = sc.nextInt();
        if (cozinheiro==1) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro1();
            //System.out.println(cardapio1[0]);
        } 
        else if (cozinheiro==2) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro2();
        } 
        else if (cozinheiro==3) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro3();
        } 
        else if (cozinheiro==4) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
            cozinheiros.cozinheiro4();
        } 
        else if (cozinheiro==5) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
           // cozinheiros.cozinheiro5();
        } 
        else if (cozinheiro==6) {
            Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
          //  cozinheiros.cozinheiro6();
        }
        
        
    }

    public void menu(){
        Pessoa pessoa=CadastroCliente();
        System.out.println(pessoa.toString());
    }

}
 