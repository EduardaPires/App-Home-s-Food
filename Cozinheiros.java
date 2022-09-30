import java.util.Scanner;

public class Cozinheiros extends Pessoa{

  //  private String nomeUser;
  //  private String email;
  //  private int senha;
    Scanner sc = new Scanner(System.in);
    private String[] cardapio;
   // private int quantidadeDeCardapios;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;

    
    public Cozinheiros(String nome, String user, int senha) {
        //super(nome, user, senha);
       // this.nomeUser=nomeUser;
        //this.email=email;
        //this.senha=senha;
        //this.quantidadeDeCardapios=1;
        this.cardapio = new String[4];
        this.avaliacao=avaliacao;
    }

    public Pessoa CadastroCozinheiro() {
        Pessoa perfil = new Pessoa(); //em vez de super usar perfil
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        perfil.setSenha(senha);
        String user = "Cozinheiro";
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

    public void menu(){
        Pessoa pessoa=CadastroCozinheiro();
        System.out.println(pessoa.toString());
        exibirCardapio();
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa perfil = new Pessoa();
        System.out.println("Digite seu nome de usuário: ");
        String nome = sc.nextLine();
        perfil.setNome(nome);
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        perfil.setSenha(senha);
        String user = "Cozinheiro";
        perfil.setUser(user);
        System.out.println("Quantos pratos terá em seu cardápio? ");
        int quantidadeDeCardapios = sc.nextInt();
       // setQuantidadeDeCardapios(quantidadeDeCardapios);
       String[] cardapio = new String[quantidadeDeCardapios];
        System.out.println("Seus pratos: ");
        //System.out.println((1)+ ": ");
        cardapio[0] = sc.nextLine();
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            System.out.print((i+1)+ ": ");
            cardapio[i] = sc.nextLine();
        }
        System.out.println(perfil.toString());
        for (int i = 0; i < quantidadeDeCardapios; i++) {
            System.out.println((i+1)+ ": " + cardapio[i]);
        }

    }*/
    
   /*  public Cozinheiros(String nomeUser, String email, int senha, String cardapio, int quantidadeDeCardapios, float avaliacao, float mediaAvaliacao){
        this.nomeUser=nomeUser;
        this.email=email;
        this.senha=senha;
        this.cardapio= new String [quantidadeDeCardapios];
        this.quantidadeDeCardapios=quantidadeDeCardapios;
        this.avaliacao=avaliacao;
    }*/

    public float getAvaliacao() {
        return avaliacao;
    }
    public String[] getCardapio() {
        return this.cardapio;
    }
    //public String getEmail() {
    //    return email;
    //}
    public float getMediaAvaliacao() {
        return mediaAvaliacao;
    }
 //   public String getNomeUser() {
 //       return nomeUser;
  //  }
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
   // public void setEmail(String email) {
   //     this.email = email;
   // }
    public void setMediaAvaliacao(float mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }
  //  public void setNomeUser(String nomeUser) {
 //       this.nomeUser = nomeUser;
  //  }
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
