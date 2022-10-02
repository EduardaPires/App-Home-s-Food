import java.util.Scanner;

public class Cozinheiros extends Pessoa{
    
    Scanner sc = new Scanner(System.in);

    LinkedList 
    private FazerPedido pedido;
    private String[] cardapio;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;
    private int indescolhido;

    
    public Cozinheiros(String nome, String user, int senha) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        this.avaliacao=avaliacao;
        this.pedido = new FazerPedido();
        this.indescolhido = indescolhido;
    }

    public Pessoa CadastroCozinheiro() {
        String nome="", user="";
        int senha=0;
        Pessoa perfil = new Pessoa(nome, user, senha); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite uma senha numérica: ");
        //exceção de int 
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cozinheiro";
        perfil.setUser(user);
        //Cardapio();
        System.out.println("Quantos pratos terá em seu cardápio? ");
        int quantidadeDeCardapios = sc.nextInt();
        //setQuantidadeDeCardapios(quantidadeDeCardapios);
        setCardapio(cardapio, quantidadeDeCardapios);
        System.out.println("Seus pratos: ");
        cardapio[0] = sc.nextLine();
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            // System.out.println("coloque um pratinho");
             System.out.println((i+1)+ ": ");
             cardapio[i] = sc.nextLine();
         }
        System.out.println(perfil.toString());
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            System.out.println((i+1)+ ": " + cardapio[i]);
        }
        return perfil;
    }

    public void EntrarCozinheiro() {
        String nome="", user="";
        int senha=0;
        Pessoa perfil = new Pessoa(nome, user, senha); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite uma senha numérica: ");
        //exceção de int 
        senha = sc.nextInt();
        perfil.setSenha(senha);
        user = "Cozinheiro";
        perfil.setUser(user);
      
        menu();
        //mostrar cozinheiros e selecioná-los para ver cardápio, onde tbm haverá seleção para realizar pedidos
        //chamará classe FazerPedido
    }

    public void cozinheiro1(){
       String nome = "Rafaella Ballerini";
       String[] cardapio1 = {"Bolinho de linguiça com queijo- R$ 20,00", "Homus de Grão de Bico- R$ 14,00", "Falafel Libanês- R$ 15,00"};
       Cardapios(cardapio1);
    }
    public void cozinheiro2(){
        String nome = "Freddie Mercury";
        String[] cardapio2 = {" Porção de Pão de queijo(5 unid)- R$ 8,00 ", "Batata Cheaps- R$ 15,00", "Bolinhos de Arroz com Ricota(3 unid)- R$ 7,00", "Batata assada com calabresa e queijo- R$ 13,00"};
        Cardapios(cardapio2);
    }//
    public void cozinheiro3(){
        String nome= "Luke Skywalker";
        String[] cardapio3 = {"Tropreiro de ervilha seca- R$ 20,00", "Palmito Gratinado- R$ 17,00"};
        Cardapios(cardapio3);
    }
    public void cozinheiro4(){
        String nome= "Chihiro";
        String[] cardapio4 ={"Missoshiru- R$14,00", "Guioza(4 unid)- R$ 12,50", "Sashimi- R$ 15,50", "Gohan com carne- R$ 17,50"};
        Cardapios(cardapio4);
    }

    public void menu(){
        Pessoa pessoa=CadastroCozinheiro();
        System.out.println(pessoa.toString());
        exibirCardapio();
        exibirPedidosFeitos();
    }
    public void exibirPedidosFeitos(){
            System.out.println(getItemEscolhidoDoCardapio());
    }

    public float getAvaliacao() {
        return avaliacao;
    }
    public String[] getCardapio() {
        return this.cardapio;
    }

    public float getMediaAvaliacao() {
        return mediaAvaliacao;
    }
 
    public int getQuantidadeDeAvaliacoes() {
        return quantidadeDeAvaliacoes;
    }
    public String getItemEscolhidoDoCardapio(){
       String itemEscolhido= pedido.EscolhadoItemCardapio(cardapio, indescolhido);
        return itemEscolhido; 
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setCardapio(String[] cardapio, int quantidadeDeCardapios) {
        //this.cardapio = cardapio;
        this.cardapio= new String [quantidadeDeCardapios];
    }

    public void setMediaAvaliacao(float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }

    public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
        this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
    }
    public float avaliacao(float avaliacao){
        this.avaliacao = avaliacao;
        this.quantidadeDeAvaliacoes++;
        return this.avaliacao;
    }

    public float media(){
        this.mediaAvaliacao = this.avaliacao/this.quantidadeDeAvaliacoes;
        return this.mediaAvaliacao;
    }

    public void exibirCardapio(){
        int i;
        for(i=0; i<this.cardapio.length;i++){
            System.out.println((i + 1) + " - " + this.cardapio[i]);
        }
    }

    public void Cardapios(String[] cardapiox) {
        System.out.println(" ======= Cardápio ======= ");
        for (int i = 0; i < cardapiox.length; i++) {
             System.out.println(cardapiox[i]);

        }
        System.out.println("ESCOLHA O SEU PEDIDO: ");
        indescolhido = sc.nextInt(); //nullpointer
        String comida = pedido.EscolhadoItemCardapio(cardapiox, indescolhido);
        System.out.println("Você escolheu " + comida);
        pedido.Avaliacao();
        
    }

   // public void adcionarOpcaoNoCardapio (String prato){
   //     this.cardapio[quantidadeDeCardapios] = prato;
   //     quantidadeDeCardapios++;
  //  }

  
    /*public void exibirTelaCozinheiro(){
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
    }*/

   
}
