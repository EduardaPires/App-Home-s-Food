public class LinkedList<T extends Comparable<T>> {
    private Node<T> primeiro;
    private Node<T> ultimo;
    private int qtd;

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void voidInserirOrdenado(T valor) {
		Node novo = new Node(valor);
		Node anterior = null, atual;
		
		if(this.isEmpty()) {
			this.primeiro = novo;
			this.ultimo = novo;
			this.qtd ++;
		}
		else if(valor.compareTo(this.primeiro.getValue()) < 0){ // inserção no início
			 novo.setNext(atual);(this.primeiro);
			 this.primeiro = novo;
			 this.qtd ++;
		}
		else if(valor.compareTo(this.ultimo.getValue()) > 0) { // inserção no final
			this.ultimo.setNext(novo);
			this.ultimo = novo;
			this.qtd ++;
		}
		else { // inserção no "meio" da lista
			atual = this.primeiro;
			while(atual != null) {
				if(atual.getValue().compareTo(valor) > 0) { //achou ponto de inserção
					anterior.setNext(novo);
					novo.setNext(atual);
					qtd++;
					break;
				}
				else {
					anterior = atual;
					atual = atual.getNext();
				}
			}
		}
	}

    //testando commit no notebook para ver se aparece




    
}
