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
        else if (cozinheiro==1) {
        
        } 
        else if (cozinheiro==1) {
        
        } 
        else if (cozinheiro==1) {
        
        } 
        else if (cozinheiro==1) {
        
        } 
        else if (cozinheiro==1) {
        }
        
        
    }

    public static void main(String[] args) {
        //perguntar se o cliente quer fazer pedido, se sim mostrar cardapio, se for cozinheiro mostra pedidos recebidos ou deixar adicionar pratos
       // System.out.println(exibir); = 
       //cliente: variavel de cardapio: escolha uma comida do cardapio (input); fazer combinações/combos (cardapios diferentes)
       //sysout opções de entrar como cozinheiro e cliente-> no cozinheiro, opção de mostrar pedidos
       //sysout entrar como cozinheiro 
       //fazer aparecer os itens do cardapio na tela do cliente pra pedir, e mostrar apos isso o pedido feito na tela do cozinheiro
       //classe pedido -> Pedido pedido = new Pedido(); novopedido = sc.nextLine(); pedido.getPedido(novopedido); -> na classen é um return 
       //Cardapio cardapio -> pro cozinheiro adicionar itens, e depois exibir tudo para o cliente
        String meunome="duda", email="@";
        Cliente cliente;
        int senha = 123;
        
        
        //pessoa = new Pessoa(nome, email, senha);

    }


   

}

