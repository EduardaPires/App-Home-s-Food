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
    public void mostrarPedidos() {

    }
    
    public String[] selecionarPedidos() {
        //mostraPedidos()
        return null;
    }

}
