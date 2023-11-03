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
public class Node {
    
    private Object data;
    private Node next;

    /**
     * Create a node object
     * @param data Data that is assigned to the node
     */
    public Node(Object data) {
        this.data = data;
        this.next = null;
    }

    /**
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @return the next 
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set 
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
}
