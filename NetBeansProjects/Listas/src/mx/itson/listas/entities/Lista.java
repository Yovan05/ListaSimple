
package mx.itson.listas.entities;

/**
 *
 * @author alexi
 */
public class Lista {
    
    Nodo primero = new Nodo();
    Nodo ultimo = new Nodo();
    
    public Lista(){
        primero=null;
        ultimo=null;
    }
    
    public void insertarNodo(int dato){
        Nodo nuevo = new Nodo();
        nuevo.dato = dato;
        if (primero == null) {
            primero = nuevo;
            primero.enlace = null;
            ultimo = nuevo;
        }else{
            ultimo.enlace = nuevo;
            nuevo.enlace = null;
            ultimo = nuevo;
        }
    }
    
    public Nodo buscar(int dato){
        Nodo actual = new Nodo();
        Nodo encontrado = new Nodo();
        encontrado = null;
        actual = primero;
        if(primero != null){
            while(actual != null){
                
                if(actual.dato == dato){
                    encontrado = actual;
                }
                actual = actual.enlace;
            }
        }
        
        
        
        return encontrado;
    }
    
    
    
    
    
}
