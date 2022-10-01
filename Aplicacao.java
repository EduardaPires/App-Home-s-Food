//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.Scanner;
public class Aplicacao {
    Scanner sc = new Scanner(System.in);
    //nao herda a superclasse pessoa, apenas a chama



    public void exibirTelaCozinheiro(){
        //chamar metodo exibirCardapio
        System.out.println("Deseja adicionar algo no seu cardápio?");
        String resposta = sc.nextLine();
        if (resposta == "sim") {
            //chamar método addOpcnoCardapio
        }
        System.out.println("==========================");
        System.out.println("Você tem um x pedidos:");
        //for (int i = 0; i < tamanhoCardapio.length; i++) {
            //sysout("item[i], quantidade: [i]");
        //}
    }

    public void exibirTelaCliente(){
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

    public static void opcoes(){
        System.out.println("");
        System.out.println(" ======= HOME'S FOOD ======= ");
        System.out.println("Escolha uma opção: ");
        System.out.println("1. Entrar como cozinheiro");
        System.out.println("2. Cadastrar como cozinheiro");
        System.out.println("3. Entrar como cliente");
        System.out.println("4. Cadastrar como cliente");
        System.out.println("5. Sair");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exibiropcoes();
        //perguntar se o cliente quer fazer pedido, se sim mostrar cardapio, se for cozinheiro mostra pedidos recebidos ou deixar adicionar pratos
       //cliente: variavel de cardapio: escolha uma comida do cardapio (input); fazer combinações/combos (cardapios diferentes)
       //sysout opções de entrar como cozinheiro e cliente-> no cozinheiro, opção de mostrar pedidos
       //fazer aparecer os itens do cardapio na tela do cliente pra pedir, e mostrar apos isso o pedido feito na tela do cozinheiro
       //classe pedido -> Pedido pedido = new Pedido(); novopedido = sc.nextLine(); pedido.getPedido(novopedido); -> na classen é um return 
       //Cardapio cardapio -> pro cozinheiro adicionar itens, e depois exibir tudo para o cliente
       
        //while (selecao1 == 1 && selecao1 == 2 && selecao1 == 3 && selecao1 == 4 && selecao1 == 5);
        //pessoa = new Pessoa(nome, email, senha);

    }

    public static void exibiropcoes() {
        Scanner sc = new Scanner(System.in);
        String nome="", user="";
        int senha=0;
        Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
        Cliente cliente = new Cliente(nome, user, senha);
        int op;
        do {
            opcoes(); 
            op = sc.nextInt();sc.nextLine();
            if (op == 1) {
                cozinheiros.EntrarCozinheiro();
            }
            else if (op== 2) {
                cozinheiros.CadastroCozinheiro();
            }
            else if (op == 3) {
                cliente.EntrarCliente();
            }
            else if (op== 4) {
                cliente.CadastroCliente();
            }
            else if (op == 5){
                System.out.println("Você ficou offline");
                return; 
            }
        } while (op !=5);
    }


   

}

