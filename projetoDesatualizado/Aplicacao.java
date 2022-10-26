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
    }

    /*public LinkedList listaCozinheiros() {
        return null;
    }

    public LinkedList listaClientes() {
        return null;
    }*/

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
                //try{
                    if(listaCozinheiros.contains(cozinheiroLogin)){
                        System.out.println("Login efetuado com sucesso!");
                        cozinheiros.exibirTelaCozinheiro();
                        //EntrarCozinheiro retorna login(tipo pessoa)
                        //Duds, meu amor neném bebê lindoca, chama os métodos de mostrar a tela do user aqui
                        // não usar esse objeto novo que eu criei de comparação pra mostrar
                        //}
                        } else {
                System.out.println("Usuário não corresponde / Senha incorreta"); 
                }
            
            }
            else if (op== 2) {
                Pessoa novoCozinheiro = cozinheiros.CadastroCozinheiro();
                if(listaCozinheiros.contains(novoCozinheiro)){
                    System.out.println("Usuário já cadastrado!");
                }
                else{
                    listaCozinheiros.addLast(novoCozinheiro);
                    System.out.println("Cadastro feito com sucesso!");
                }
            }
            else if (op == 3) {
                Pessoa clienteLogin = cliente.EntrarCliente();
                if(listaClientes.contains(clienteLogin)){
                    System.out.println("Login efetuado com sucesso!");
                    System.out.println(" ");
                    System.out.println("========= Escolha um cozinheiro ========");
                    System.out.println();
                    int size = listaCozinheiros.size();
                    for(int i = 0; i < size; i++){
                        System.out.println(i+1 + ". " + listaCozinheiros.get(i));
                    }
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

