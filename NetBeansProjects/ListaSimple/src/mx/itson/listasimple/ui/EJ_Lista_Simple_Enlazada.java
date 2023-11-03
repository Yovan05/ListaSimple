/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.listasimple.ui;

import mx.itson.listasimple.entities.List;
import mx.itson.listasimple.entities.Node;

/**
 *
 * @author juan_m_osuna
 */
public class EJ_Lista_Simple_Enlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List lista = new List();
        
//        lista.print();
        
        lista.addNode(10);
        lista.addNode(5);
        lista.addNode(1);
        lista.addNode(7);
        lista.addNode(56);
        lista.addNode(85);
//        System.out.println(lista.getFirst().getData());
//        lista.deletePosition(0);
//        lista.deleteNode(5);
//        lista.addFisrtNode("primero");
//        lista.print();

        System.out.println("En la posicion numero 3 se encuentra el valor "+lista.locateNode(5));
        
        System.out.println("Primer nodo "+ lista.getFirst().getData());
        System.out.println("Ultimo nodo "+lista.getLast().getData());
        
//        lista.delete();
//        lista.delete();
//        lista.delete();
//        lista.delete();
//        lista.addNodeByPosition("ultimo", 0);
        
//        lista.print();
        
    }
    
}
