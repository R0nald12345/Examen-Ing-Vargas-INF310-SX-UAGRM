
package ListaDoblementeEncadenada;

public class Nodo {
    //Atributos
    public Nodo ant; //Seria la novedad
    public int dato;
    public Nodo prox;
    
    //Constructor
    public Nodo(Nodo nuevoAnt, int elem, Nodo nuevoProx){
        this.ant = nuevoAnt;
        this.dato = elem;
        this.prox = nuevoProx;
    }
}
