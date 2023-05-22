
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

/**
 * Almacena productos, pueden ser bebidas o dulces
 * */
public class Deposito<T>{ 

    private Expendedor exp;
    private ArrayList<T> al ;
    
    public Deposito(){
        al = new ArrayList<T>();
    }


    /** Agrega productos al arreglo
     * @param producto de tipo generico, usado para almacenar elementos productos
     * */
    public void addProducto(T producto){
        al.add(producto);
    }


    /** Saca productos del arreglo
     * @return remueve el primero elemento del arreglo si los hay
     * */
    public T getProducto(){
         if( al.size() != 0){
            return al.remove(0);
         }else{
             return null;
         }   
    }


    /** Define un estado para ver si el deposito esta vacio o no
     * */
    public Boolean isEmpty(){
        return al.isEmpty();
    }


    /** Define el tamaño del deposito
     * */
    public int Size(){
        return al.size();
    }
    
    
}