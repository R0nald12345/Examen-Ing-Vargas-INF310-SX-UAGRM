
package ListaArreglo;

public class VectorLista {
    
    //atributos
    public static final int MAX = 50;
    public int vector[];
    public int cant;
    
    //contructor
    public VectorLista(){
        this.cant = 0;
        vector = new int[50]; //Quiero un arreglo de 50 espacios en donde cada celta trabaje con enteros
    }
    
    //Metodos
    
    //1 L1.insertarUlt(x) : Método que inserta el elemento x, al final de la lista L1.
    public void insertarUlt(int x){
        this.cant++;
        this.vector[cant] = x;
    }
    
    
    // L1.iguales() : Método lógico que devuelve True, si todos los elementos de la lista L1, son iguales.
    public boolean iguales(){
        int aux = vector[1];
        for (int i = 2; i <= this.cant; i++) {
            if(vector[i] != aux){
                return false;
            }
        }
        return true;
    }
    
    
    // L1.menor() : Método que devuelve el menor elemento de la Lista L1.
    
    /**
     * Este metodo me permite obtener el menor dato de un Arreglo
     * @return 
     */
    public int menor(){
        int menor = vector[1];
        for (int i = 2; i <= this.cant; i++) {
            if(vector[i] < menor){
                menor  = vector[i];
            }
        }
        return menor;
    }
    
    
    public int mayor(){
        int menor = vector[1];
//        int nuevoMenor;
        for (int i = 2; i <= this.cant; i++) {
//            nuevoMenor = vector[i];
            if(vector[i] > menor){
                menor  = vector[i];
            }
        }
        return menor;
    }
    
    public void eliminarPos(int pos){
        for (int i = pos; i < this.cant ; i++) {
            vector[i] = vector[i+1];
        }
        this.cant--;
    }
    
        
    public String toString(){ //Muestra los datos de mi arrgelo
        String cadena = "[ ";
        for (int i = 1; i <= this.cant; i++) {
            cadena = cadena + vector[i] + " ";
        }
        return cadena + "]";
    }
    
    public static void main(String[] args) {
        VectorLista L1 = new VectorLista();
        L1.insertarUlt(8);
        L1.insertarUlt(8);
        L1.insertarUlt(1);
        L1.insertarUlt(10);
        
        System.out.println(L1.toString());
        System.out.println("Verificar si son iguales: " + L1.iguales());
        System.out.println("Obtener Menor: " + L1.menor());
        System.out.println("Obtenner Mayor: " + L1.mayor());
        
        L1.eliminarPos(3);
        System.out.println(L1.toString());
        
    }
    
          
}


// 1 Atajo =  pu + TAB ==> public
// 2 Atajo =  for + TAB ==> Autocomplenta el For
// 3 Atajo =  psvm + TAB ==> me muestra el procedimiento del MAIN
// 4 Atajo =  sout + TAB  ==>  System.out.println("");
// 5 Atajo =  ctrl + shift + c ==> Coloca en comentarios