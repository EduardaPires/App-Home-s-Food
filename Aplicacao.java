//1. encapsulamento, herança/classe abstrata, exception, solid, adicionar 3 padrões de projeto
import java.util.Scanner;
public class Aplicacao {
    Scanner sc = new Scanner(System.in);

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
        System.out.println("1 - ");
    }

    public static void main(String[] args) {
    //perguntar se o cliente quer fazer pedido, se sim mostrar cardapio, se for cozinheiro mostra pedidos recebidos ou deixar adicionar pratos
       // System.out.println(exibir); = 
       //cliente: variavel de cardapio: escolha uma comida do cardapio (input); fazer combinações/combos (cardapios diferentes)
       //sysout opções de entrar como cozinheiro e cliente-> no cozinheiro, opção de mostrar pedidos
       //sysout entrar como cozinheiro 
       //fazer aparecer os itens do cardapio na tela do cliente pra pedir, e mostrar apos isso o pedido feito na tela do cozinheiro
    }


    do{

    }while();


}

