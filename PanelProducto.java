
import javax.swing.*;
import java.awt.*;

/**
 * Clase incompleta, la idea era definir los eventos del comprador para usarlos con mouse listener
 * */

class PanelProducto extends JPanel {
    
    
    private int x;
    private int y;
    public PanelProducto (){

    }
    
  public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void paint(Graphics g,JPanel panel){
        super.paint(g);
        
        
    }
}
