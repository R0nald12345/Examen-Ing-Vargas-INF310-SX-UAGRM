
package ListaSimpleEncadenada;


public class ListaSimpleEncadenada {
    public Nodo prim;
    public Nodo ult;
    public int cantNodo;
    
    public ListaSimpleEncadenada(){
        this.prim = null;
        this.ult = null;
        this.cantNodo = 0;
    }
    
    
    //Verificar si mi lista esta Vacio
    public boolean verificarVacio(){
        return this.prim == null && this.ult ==null;
    }
    
    
    //L1.insertarPrim(x) : Método que inserta el elemento x, al inicio de la lista L1.
    public void insertarPrim(int x){
        if(verificarVacio()){ //Si mi lista esta vacio
            Nodo nuevoNodo =  new Nodo(x,null);
            prim = ult = nuevoNodo;
        }else{
            Nodo nuevoNodo = new Nodo(x,null);
            nuevoNodo.prox = prim;
            this.prim = nuevoNodo;
        }
        this.cantNodo++;
        
    }
    
    
       public void insertarUlt(int x){
        if(verificarVacio()){ //Si mi lista esta vacio
            Nodo nuevoNodo =  new Nodo(x,null);
            prim = ult = nuevoNodo;
        }else{
            Nodo nuevoNodo = new Nodo(x,null);
            this.ult.prox = nuevoNodo;
            this.ult = nuevoNodo; 
        }
        this.cantNodo++;
        
    }
    
    /**
     * Este metodo cambia mis nodos, los valores de x seran cambiados
     * por los valores de y
     * @param x
     * @param y 
     */
    public void reemplazar(int x, int y){
        Nodo punteroAux= this.prim;
        while(punteroAux != null){
            if(punteroAux.dato == x){
                punteroAux.dato = y;
            }
            punteroAux = punteroAux.prox;
        }
    }
    
    //L1.frecuencia(x) : Método que devuelve la cantidad de veces que aparece el elemento x en la lista L1.
    public int frecuencia(int x){
        Nodo punteroAux = this.prim;
        int contador = 0;
        while(punteroAux != null){
            if(punteroAux.dato == x){
                contador++;
            }
            punteroAux = punteroAux.prox;
        }
        return contador;
    }
    
    
    
    
    public int cantidadNodos(){
        return this.cantNodo;
    }
    
   
     /**
     * 
     * Este metodo eliminar el primer nodo de la lista
     * @return 
     */
    public void eliminarPim(){
       if(verificarVacio()){ //Verifica si la lista esta vacio
           return; //como la lista esta vacio no hace nada
       } 
       this.prim = this.prim.prox;
       this.cantNodo--;
    }
    
     /**
     * Este metodo elimina el ulutmo nodo de la lista
     * 
     */
    public void eliminarUlt(){
       if(verificarVacio()){ //Verifica si la lista esta vacio
           return; //como la lista esta vacio no hace nada
       } 
       Nodo aux = this.prim;
       while(aux.prox.prox != null){
           aux = aux.prox;
       }
       aux.prox = null;
       this.ult = aux;
       this.cantNodo--;
    }
    
    /**
     * ELimina un nodo en una respectiva posicion
     */
    public void eliminarPos(int pos){
        if(pos == 1){ //eliminar el primero
            eliminarPim();
        }else{
            if(pos == cantidadNodos()){ //eliminar el ultimo
                eliminarUlt();
            }else{
                int contador = 1;
                Nodo aux = this.prim;
                Nodo ant  = null;
                while(contador != pos){
                    ant = aux;
                    aux = aux.prox;
                    contador++;
                }
                ant.prox = aux.prox;
                aux.prox =null;
                this.cantNodo--;

            }
        }
        
    }
    

    
    public String toString(){
        String listaCadena = "[ ";
        Nodo punteroAux = this.prim;
        while(punteroAux != null){
            listaCadena = listaCadena + punteroAux.dato + "->";
            punteroAux = punteroAux.prox;
        }
        return listaCadena + "null ]";
    }
    
    public static void main(String[] args) {
        ListaSimpleEncadenada Lista1 = new ListaSimpleEncadenada();
        Lista1.insertarPrim(4);
        Lista1.insertarPrim(7);
        Lista1.insertarPrim(8);
        Lista1.insertarPrim(8);
        Lista1.insertarUlt(100);
        Lista1.insertarPrim(8);
         Lista1.insertarUlt(1000);
           
        System.out.println(Lista1.toString());
//        System.out.println("Cantidad de Nodos: " + Lista1.cantidadNodos());
//        System.out.println("Verificar Si esta vacio mi Lista: " + Lista1.verificarVacio());
//        Lista1.reemplazar(8, 1);
//        System.out.println(Lista1.toString());
//        System.out.println("Frecuencia de 1: " + Lista1.frecuencia(1));
//        Lista1.eliminarPim();
//        System.out.println(Lista1.toString());
//        Lista1.eliminarUlt();
//        System.out.println(Lista1.toString());
        
        Lista1.eliminarPos(7);
        System.out.println(Lista1.toString());
        
    }
}
