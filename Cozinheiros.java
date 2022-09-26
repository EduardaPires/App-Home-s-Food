public class Cozinheiros extends Pessoa{

  //  private String nomeUser;
  //  private String email;
  //  private int senha;
    private String[] cardapio;
    private int quantidadeDeCardapios;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;

    
    public Cozinheiros(String nome, String user, int senha) {
        //super(nome, user, senha);
       // this.nomeUser=nomeUser;
        //this.email=email;
        //this.senha=senha;
        this.cardapio= new String [quantidadeDeCardapios];
        this.quantidadeDeCardapios=quantidadeDeCardapios;
        this.avaliacao=avaliacao;
    }
    
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
        return cardapio;
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
    public int getQuantidadeDeCardapios() {
        return quantidadeDeCardapios;
    }
  //  public int getSenha() {
   //     return senha;
   /// }
    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setCardapio(String[] cardapio) {
        this.cardapio = cardapio;
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
    public void setQuantidadeDeCardapios(int quantidadeDeCardapios) {
        this.quantidadeDeCardapios = quantidadeDeCardapios;
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

    public void adcionarOpcaoNoCardapio (String prato){
        this.cardapio[quantidadeDeCardapios] = prato;
        quantidadeDeCardapios++;
    }
}
