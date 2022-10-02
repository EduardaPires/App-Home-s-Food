import java.util.Scanner;

public class FazerPedido {
    Scanner sc = new Scanner(System.in);
    private int quantPedidos, somaAvaliacao=0, quantAvaliacoes=0; 
    private String[] pedidos; //o tamanho será a quantia de pedidos
    private int avaliacao; 
    private float mediaAvaliacao;//fazer calculo de média, só vai adiconar, não aparece a avaliação individual; e será feita após o pedido (perguntando se foi recebido)
    private String pedido;

    public FazerPedido(){
        this.quantPedidos=quantPedidos;
        this.pedidos = new String[quantPedidos];
        this.avaliacao=avaliacao;
        this.mediaAvaliacao=mediaAvaliacao;
        this.pedido=pedido;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }
    public void setQuantPedidos(int quantPedidos) {
        this.quantPedidos = quantPedidos;
    }
    
    public String[] selecionarPedidos() {
        //mostraPedidos()
        return null;
    }

    public int getQuantPedidos(){
        return this.quantPedidos;
    }

    public String getPedidos(int cont){
        return this.pedidos[cont];
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }

    public float getMediaAvaliacao(){
        return this.mediaAvaliacao;
    }

    public String EscolhadoItemCardapio(String[] cardapio, int indescolhido){
        int i;
        for(i=0; i< cardapio.length;i++){
            if(indescolhido==i+1){
                 pedido= cardapio[i];
            }
        }
        return pedido;
    }

    








    public void setMediaAvaliacao(int estrelas) {
        this.somaAvaliacao = somaAvaliacao + estrelas;
        this.mediaAvaliacao = (somaAvaliacao)/quantAvaliacoes;
    }

    public void Avaliacao() {
        System.out.println("Pedido entregue!");
        System.out.println("De 0 a 5 estrelas, como você avalia o nosso cozinheiro? ");
        int estrelas = sc.nextInt();
        this.quantAvaliacoes++;
        setAvaliacao(estrelas);
        setMediaAvaliacao(estrelas);
        System.out.println("Obrigada por dar ");
        for (int i = 0; i < estrelas; i++) {
            System.out.print("★");
        }
        System.out.println(" estrelas!");
        System.out.println("==========");
        //voltar a tela inicial
    }

}
