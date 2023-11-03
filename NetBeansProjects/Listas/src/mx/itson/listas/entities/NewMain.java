
package mx.itson.listas.entities;

import java.util.Scanner;

/**
 *
 * @author alexi
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lista = new Lista();
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Ingrese el dato para el nuevo nodo: ");
        
        //int dato = read.nextInt();
        
        //System.out.println(dato);
        
        lista.insertarNodo(12);
        lista.insertarNodo(25);
        lista.insertarNodo(65);
        lista.insertarNodo(23);
        
        Nodo actual;
        actual = lista.primero;
        if(lista.primero !=null){
            while(actual !=null){
                System.out.println(actual.dato);
                actual = actual.enlace;
            }
        }else{
            System.out.println("La lista esta vacia");
        }
        
        Nodo encontrado = lista.buscar(0);
        if(encontrado == null){
            System.out.println("No se encontro el nodo");
        }else{
            System.out.println("Dato: "+encontrado.dato+"\tEnlace: "+encontrado.enlace.dato);
        }
        
        
    }
    
}
