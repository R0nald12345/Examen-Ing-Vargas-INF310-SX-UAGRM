
package ListaSimpleEncadenada;


public class Nodo {
    //Atributos
    public int dato;
    public Nodo prox;
    
    //Constructor
    public Nodo(int elem, Nodo nuevoProx){
        this.dato = elem;
        this.prox = nuevoProx;
    }
}
