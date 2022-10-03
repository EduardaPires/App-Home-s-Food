//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.LinkedList;
import java.util.Scanner;

public class Aplicacao {
    Scanner sc = new Scanner(System.in);
    //nao herda a superclasse pessoa, apenas a chama

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
        //System.out.println("\u001b[1m Pedido entregue! \u001b[m");
        /*System.out.println("\u001b[37m \u001b[44m Pedido entregue \u001b[m");
       System.out.println("De 0 a 5 estrelas, como você avalia o nosso cozinheiro? ");
       int estrelas = sc.nextInt();
       //this.quantAvaliacoes++;
       //setAvaliacao(estrelas);
       //setMediaAvaliacao(estrelas);
       System.out.println("Obrigada por dar " + estrelas + " estrelas!");
       System.out.println(" ==================== ");*/
        //perguntar se o cliente quer fazer pedido, se sim mostrar cardapio, se for cozinheiro mostra pedidos recebidos ou deixar adicionar pratos
       //cliente: variavel de cardapio: escolha uma comida do cardapio (input); fazer combinações/combos (cardapios diferentes)
       //sysout opções de entrar como cozinheiro e cliente-> no cozinheiro, opção de mostrar pedidos
       //fazer aparecer os itens do cardapio na tela do cliente pra pedir, e mostrar apos isso o pedido feito na tela do cozinheiro
       //classe pedido -> Pedido pedido = new Pedido(); novopedido = sc.nextLine(); pedido.getPedido(novopedido); -> na classen é um return 
       //Cardapio cardapio -> pro cozinheiro adicionar itens, e depois exibir tudo para o cliente

    }

    public static void exibiropcoes() {
        Scanner sc = new Scanner(System.in);
        String nome="", user="";
        int senha=0;
        Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
        Cliente cliente = new Cliente(nome, user, senha);
        LinkedList listaCozinheiros = new LinkedList();
        LinkedList listaClientes = new LinkedList();
        int op;
        do {
            opcoes(); 
            op = sc.nextInt();sc.nextLine();
            if (op == 1) {
                cozinheiros.EntrarCozinheiro();
            }
            else if (op== 2) {
                Pessoa novoCozinheiro = cozinheiros.CadastroCozinheiro();
                if(listaCozinheiros.contains(novoCozinheiro.getUser())){
                    System.out.println("Usuário já cadastrado!");
                }
                else{
                    listaCozinheiros.addLast(novoCozinheiro);
                    System.out.println("Cadastro feito com sucesso!");
                }
            }
            else if (op == 3) {
                cliente.EntrarCliente();
            }
            else if (op== 4) {
                Pessoa novoCliente = cliente.CadastroCliente();
                if(listaCozinheiros.contains(novoCliente.getUser())){
                    System.out.println("Usuário já cadastrado!");
                }
                else{
                    listaCozinheiros.addLast(novoCliente);
                    System.out.println("Cadastro feito com sucesso!");
                }
                
            }
            else if (op == 5){
                System.out.println("Você ficou offline");
                return; 
            }
        } while (op !=5);
    }


   

}

