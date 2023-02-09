package org.academiadecodigo.bootcamp.containers;

public class LinkedList {

    private Node head;
    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     * @param data the element to add
     */
    public void add(Object data)  {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null){
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {
        Node currentNode = head; // comecamos na head
        int counter = 0;
        if (index < 0) {
            return head.data;
        } else {
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();

                if(counter == index) {
                    return currentNode.getData();
                }
                counter++;
            }
        } return null;

    }

    /**
     * Returns the index of the element in the list
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {
        Node iterator = head;
        int counter = 0;
        while(iterator.getNext() != null){  // enquanto existir uma proxima caixa
            if(data.equals(iterator.getNext().getData())){  // comparamos o valor da data indicada com a da caixa
                return counter; // se for igual devolvemos o index
            }
            counter++;  // aumentamos o index
            iterator = iterator.getNext(); // passamos para a proxima caixa

        }
        return -1; // se nao for encontrado devolver -1
    }

    /**
     * Removes an element from the list
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {
        int indexOfData = indexOf(data); // index da data que passamos como argumento
        if(indexOfData == -1){  //se o index da data for -1, ou nao existir
            return false;         //retornar false, para sair do loop
        }
        Node delete = head;   //variavel para guardar caixa que queremos apagar
        Node box1 = head;     //variavel da caixa anterior á caixa vamos apagar, e que vamos copiar a caixa aseguir á apagada
        if(indexOfData == 0 && !(delete.getNext() != null)){  //se o index da data == 0 e nao exitir segunda caixa temos de apontar a head para null
            delete.setNext(null);
            return true;          //retornar true, para sair do loop
        }
        for (int i = 0; i < indexOfData+1; i++) {   //ate ao index+1, iterar pelas caixas até chegar á que queremos apagar
            delete = delete.getNext();
        }
        for (int i = 0; i < indexOfData; i++) {     //ate ao index da data, passar a caixa apagada para a caixa anterior
            box1 = box1.getNext();
        }
        box1.setNext(delete.getNext());  //caixa anterior á apagada, dar o valor da caixa para a a qual a pagada aponta
        length--;  //diminuir a length , porque removemos um valor
        return true;
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
