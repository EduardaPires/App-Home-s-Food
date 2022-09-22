public class Cozinheiros {
    private String nomeUser;
    private String email;
    private int senha;
    private String[] cardapio;
    private int quantidadeDeCardapios;
    private float avaliacao; 
    private float mediaAvaliacao;//media das avaliacoes
    private int quantidadeDeAvaliacoes;
    public Cozinheiros(String nomeUser, String email, int senha, String cardapio, int quantidadeDeCardapios, float avaliacao, float mediaAvaliacao){
        this.nomeUser=nomeUser;
        this.email=email;
        this.senha=senha;
        this.cardapio= new String [quantidadeDeCardapios];
        this.quantidadeDeCardapios=quantidadeDeCardapios;
        this.avaliacao=avaliacao;
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
}
