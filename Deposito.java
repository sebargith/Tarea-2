
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

public class Deposito<T>{ 

    private Expendedor exp;
    private ArrayList<T> al ;
    
    public Deposito(){
        al = new ArrayList<T>();
    }
    
    public void addProducto(T producto){
        al.add(producto);
    }
    
    public T getProducto(){
         if( al.size() != 0){
            return al.remove(0);
         }else{
             return null;
         }   
    }
    
    public Boolean isEmpty(){
        return al.isEmpty();
    }
    
    public int Size(){
        return al.size();
    }
    
    
}