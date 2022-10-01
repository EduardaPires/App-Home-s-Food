import java.util.Scanner;

public class Cozinheiros extends Pessoa{
    Scanner sc = new Scanner(System.in);
    private String[] cardapio;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;

    
    public Cozinheiros(String nome, String user, int senha) {
        super(nome, user, senha);
        this.cardapio = new String[4];
        this.avaliacao=avaliacao;
    }

    public Pessoa CadastroCozinheiro() {
        String nome="", user="";
        int senha=0;
        Pessoa perfil = new Pessoa(nome, user, senha); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
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
        Pessoa pessoa=CadastroCozinheiro();
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        while (senha != pessoa.getSenha()) {
            System.out.println("Senha incorreta!");
            senha = sc.nextInt();
        }
        menu();
        //mostrar cozinheiros e selecioná-los para ver cardápio, onde tbm haverá seleção para realizar pedidos
        //chamará classe FazerPedido
    }

    public void cozinheiro1(){
       String nome = "Rafaella Ballerini";
       String[] cardapio1 = {"Bolinho de linguiça com queijo- R$ 20,00", "Homus de Grão de Bico- R$ 14,00", "Falafel Libanês- R$ 15,00"};
       System.out.println(" ======= Cardápio======= ");
       for (int i = 0; i < cardapio1.length; i++) {
            System.out.println(cardapio1[i]);
       }
       System.out.println("ESCOLHA O SEU PEDIDO: ");
       //return cardapio1;
    }
    public void cozinheiro2(){
        String nome = "Freddie Mercury";
        String[] cardapio2 = {" Porção de Pão de queijo(5 unid)- R$ 8,00 ", "Batata Cheaps- R$ 15,00", "Bolinhos de Arroz com Ricota(3 unid)- R$ 7,00", "Batata assada com calabresa e queijo- R$ 13,00"};
        System.out.println(" ======= Cardápio======= ");
        for (int i = 0; i < cardapio2.length; i++) {
             System.out.println(cardapio2[i]);  
        }
        System.out.println("ESCOLHA O SEU PEDIDO: ");
    }
    public void cozinheiro3(){
        String nome= "Luke Skywalker";
        String[] cardapio3 = {"Tropreiro de ervilha seca- R$ 20,00", "Palmito Gratinado- R$ 17,00"};
        System.out.println(" ======= Cardápio======= ");
        for (int i = 0; i < cardapio3.length; i++) {
             System.out.println(cardapio3[i]);
             
        }
        System.out.println("ESCOLHA O SEU PEDIDO: ");
    }
    public void cozinheiro4(){
        String nome= "Chihiro";
        String[] cardapio4 ={"Missoshiru- R$14,00", "Guioza(4 unid)- R$ 12,50", "Sashimi- R$ 15,50", "Gohan com carne- R$ 17,50"};
        System.out.println(" ======= Cardápio======= ");
        for (int i = 0; i < cardapio4.length; i++) {
             System.out.println(cardapio4[i]);
             
        }
        System.out.println("ESCOLHA O SEU PEDIDO: ");
    }

    public void menu(){
        Pessoa pessoa=CadastroCozinheiro();
        System.out.println(pessoa.toString());
        exibirCardapio();
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
   // public int getQuantidadeDeCardapios() {
   //     return quantidadeDeCardapios;
   // }
  //  public int getSenha() {
   //     return senha;
   /// }
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
    
  //  public void setSenha(int senha) {
 //       this.senha = senha;
  //  }

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

   // public void adcionarOpcaoNoCardapio (String prato){
   //     this.cardapio[quantidadeDeCardapios] = prato;
   //     quantidadeDeCardapios++;
  //  }
}
