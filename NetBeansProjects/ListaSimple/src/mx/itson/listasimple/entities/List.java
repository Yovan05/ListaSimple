/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.listasimple.entities;

/**
 *
 * @author juan_m_osuna
 */
public class List {

    private Node first;
    private Node last;
    private int size = 0;
    
    /**
     * Create a new list
     */
    public List() {
        
        this.first = null;
        this.last = null;
        this.size = 0;
        
    }
    
    /**
     * Indicates if the list is empty
     * @return Boolean which if true indicates that the list is empty
     */
    public boolean isEmpty(){
        return (this.getFirst() == null);
    }
    
    /**
     * Indicates the position of the node
     * @param node Indicates the value of the node to search
     * @return the position of the node
     */
    public int locatePosition(Object node){
        Node current = getFirst();
        int position = 0;
        while(current.getData() != node && position <=this.size){
            current = current.getNext();
            position++;
        }
        if(position<=this.size){
            return position;
        }
        return -1;
    }
    
    /**
     * Indicates the value of the node at the selected position
     * @param position int indicating the position of the node
     * @return the value of the node
     */
    public Object locateNode(int position){

        if (position < 0 || position >= this.size) {
            return "La posicion no existe";
        }
        Node current = getFirst();

        for (int i = 0; i < position; i++) {
            current = current.getNext();
        }

        return current.getData();
    }
    
    /**
     * Adds a node to the end of the list
     * @param data object to add to list
     */
    public void addNode(Object data){
        
        Node nuevo = new Node(data);
        if(isEmpty()) {
            setFirst(nuevo);
            setLast(nuevo);
            nuevo.setNext(nuevo);
        }else{
            nuevo.setNext(null);
            getLast().setNext(nuevo);
            setLast(nuevo);   
        }
        
        this.size++;
    }
    
    /**
     * Adds a node to the beginning of the list
     * @param node object to add to list 
     */
    public void addFisrtNode(Object node){
        if(!isEmpty()){
        Node nuevo = new Node(node);
        nuevo.setNext(getFirst());
        setFirst(nuevo);
        this.size++;
        }
    }
    
    /**
     * Adds a node at the indicated position
     * @param node Object to add to list
     * @param position Node position in the list
     */
    public void addNodeByPosition(Object node, int position){
        if(position ==0){
            addFisrtNode(node);
        }else{
            if((this.getSize() != 0) && (position<this.size)){
                Node nuevo = new Node(node);
                Node temp = getFirst();
                for(int i = 0; i < this.getSize(); i++) {
                    if(i == position-1){
                        nuevo.setNext(temp.getNext());
                        temp.setNext(nuevo);
                        this.size++;
                        break;
                    }else{
                        temp = temp.getNext();
                    }
                }
            }else{
                System.out.println("Esa posicion no existe");
            }
        }
    }
    
    
    /**
     * Delete the last node
     * @return the node delete
     */
    public Node delete(){
        
        Node delete = null;
        if(isEmpty()){
            System.out.println("La lista se encuentra vacia ...");
            return null;
        }
        if(getFirst() == getLast()){
            setFirst(null);
            setLast(null);
        }else{
            Node current = getFirst();
            while(current.getNext() != getLast()) {
                current = current.getNext();
            }
            delete = current.getNext();
            current.setNext(null);
            setLast(current);
        }
        this.size--;
        return delete;
    }
    
    /**
     * Delete the node at the indicate position
     * @param position Node position in the list
     */
    public void deletePosition(int position){
        Node current = getFirst();
        if(position==0){
            setFirst(current.getNext());
            this.size--;
        }
        if((this.getSize() != 0) && (position<this.size)){
                for(int i = 0; i < this.getSize(); i++) {
                    if(i == position-1 && i == this.size-2){
                        current.setNext(null);
                        setLast(current);
                        this.size--;
                    }else if(i == position-1){
                        current.setNext(current.getNext().getNext());
                        this.size--;
                        break;
                    }else{
                        current = current.getNext();
                    }
                }
            }else{
                System.out.println("Esa posicion no existe");
            }
    }
    
    /**
     * Delete the node with the indicated value
     * @param node value of the node to delete
     */
    public void deleteNode(Object node){
        if(isEmpty()){
            System.out.println("La lista se encuentra vacia ...");
        }else{
            Node current = getFirst();
            if(current.getData()!=node){
                while((current.getNext().getData() != node) && (current.getNext() != getLast())) {
                    current = current.getNext();
                }
                if(current.getNext().getNext()== null && current.getNext().getData() == node){
                    current.setNext(current.getNext().getNext());
                    setLast(current);
                    this.size--;
                }else if(current.getNext().getNext() == null){
                    System.out.println("Nodo no existente");
                }else{
                    current.setNext(current.getNext().getNext());
                    this.size--;
                }
            }else{
                current =getFirst().getNext();
                setFirst(current);
                this.size--;
            }
        }
        
    }
    
    /**
     * Print the list
     */
    public void print() {
        
        if(this.getSize() != 0) {
            Node temp = getFirst();
            String print = "";
            for(int i = 0; i < this.getSize(); i++) {
                print += temp.getData() + ",\n";
                temp = temp.getNext();
            }
            System.out.println(print);
        }
        
    }

    /**
     * @return the first
     */
    public Node getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(Node first) {
        this.first = first;
    }

    /**
     * @return the last
     */
    public Node getLast() {
        return last;
    }

    /**
     * @param last the last to set
     */
    public void setLast(Node last) {
        this.last = last;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }



}
