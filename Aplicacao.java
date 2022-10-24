//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.LinkedList;
import java.util.Scanner;

import javax.management.ValueExp;

import Exception.LoginException;

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

    public LinkedList listaCozinheiros() {
        return null;
    }

    public LinkedList listaClientes() {
        return null;
    }


    public static void exibiropcoes() {
        Scanner sc = new Scanner(System.in);
        String nome="", user="";
        int senha=0;
        Cozinheiros cozinheiros = new Cozinheiros(nome, user, senha);
        Cliente cliente = new Cliente(nome, user, senha);
        LinkedList<Pessoa> listaCozinheiros = new LinkedList<Pessoa>();
        LinkedList<Pessoa> listaClientes = new LinkedList<Pessoa>();

    
        int op = 0;
        do {
            try{
                
                opcoes(); 
                op = sc.nextInt();sc.nextLine();
            }
            catch (RuntimeException re){
                System.out.println("numero invalido");
                while(op < 1 && op > 5);
            }
            if (op == 1) {
                
                Pessoa cozinheiroLogin = cozinheiros.EntrarCozinheiro();
                try{
                    if(listaCozinheiros.contains(cozinheiroLogin.getSenha())){
                        System.out.println("Login efetuado com sucesso!");
                        //EntrarCozinheiro retorna login(tipo pessoa)
                        //Duds, meu amor neném bebê lindoca, chama os métodos de mostrar a tela do user aqui
                        // não usar esse objeto novo que eu criei de comparação pra mostrar
                }
            } catch(LoginException e){
                System.out.println("Usuário não corresponde / Senha incorreta"); 
            }
            
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
                Pessoa clienteLogin = cliente.EntrarCliente();
                if(listaClientes.contains(clienteLogin.getNome())){
                    System.out.println("Login efetuado com sucesso!");
                    //pegar objeto que está na lista e que é igual à cópia clienteLogin
                    //https://java2blog.com/print-linkedlist-in-java/
                }
                else{
                    System.out.println("Usuário não corresponde / Senha incorreta"); 
                }
            }
            else if (op== 4) {
                Pessoa novoCliente = cliente.CadastroCliente();
                //listaClientes.addLast(novoCliente);               
                if(listaClientes.contains(novoCliente)){
                    System.out.println("Usuário já cadastrado!");
                }
                else{
                    listaClientes.addLast(novoCliente);
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

