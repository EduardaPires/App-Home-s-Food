public class LinkedList<T> {
    private Node<T> first;

    public boolean isEmpty(){
        if(this.first == null){
            return true;
        }
        else{
            return false;
        }
    }

    public void insertEnd(T pessoa){
        Node valor = new Node(pessoa);

        if(this.isEmpty()){
            this.first = valor;
        }
        else{
            Node aux = this.first;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setValue(valor);
        }

    }


    
}
