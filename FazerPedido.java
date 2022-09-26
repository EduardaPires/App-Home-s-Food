public class FazerPedido {
    private int quantPedidos; 
    private String[] pedidos; //o tamanho será a quantia de pedidos
    private int avaliacao; 
    private int mediaAvaliacao;//fazer calculo de média, só vai adiconar, não aparece a avaliação individual; e será feita após o pedido (perguntando se foi recebido)

    public FazerPedido(int quantPedidos, String pedidos, int avaliacao, int mediaAvaliacao){
        this.quantPedidos=quantPedidos;
        this.pedidos = new String[quantPedidos];
        this.avaliacao=avaliacao;
        this.mediaAvaliacao=mediaAvaliacao;
    }
    public int getAvaliacao() {
        return avaliacao;
    }
    public int getMediaAvaliacao() {
        return mediaAvaliacao;
    }
    public String[] getPedidos() {
        return pedidos;
    }
    public int getQuantPedidos() {
        return quantPedidos;
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

    }
    
    public String[] selecionarPedidos() {
        //mostraPedidos()
        return null;
    }

}
