public class FazerPedido {
    private int quantPedidos; 
    private String[] pedidos; //o tamanho será a quantia de pedidos
    private int avaliacao; 
    private float mediaAvaliacao;//fazer calculo de média, só vai adiconar, não aparece a avaliação individual; e será feita após o pedido (perguntando se foi recebido)
    private String pedido;

    public FazerPedido(int quantPedidos, String pedidos, int avaliacao, float mediaAvaliacao, String pedido){
        this.quantPedidos=quantPedidos;
        this.pedidos = new String[quantPedidos];
        this.avaliacao=avaliacao;
        this.mediaAvaliacao=mediaAvaliacao;
        this.pedido=pedido;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void setMediaAvaliacao(int mediaAvaliacao) {
        this.mediaAvaliacao = mediaAvaliacao;
    }
    public void setPedidos(String[] pedidos) {
        this.pedidos = pedidos;
    }
    public void setQuantPedidos(int quantPedidos) {
        this.quantPedidos = quantPedidos;
    }
    
    public void mostrarPedidos() {
        for(int i = 0; i < this.pedidos.length; i++){
            System.out.println(this.pedidos[i]);
        }

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


}
