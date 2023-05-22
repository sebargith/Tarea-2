
import javax.swing.*;
import java.awt.*;


/**
 * Clase que representa el panel del Expendedor
 * */
class PanelExpendedor extends JPanel {
    
    private int x;
    private int y;
    
    private Expendedor exp;
    private Deposito cocacola;
    private Deposito snickers;
    private Deposito sprite;
    private Deposito super8;


    /** Constructor, agrega productos al expendedor
     * @param numProducto numero de productos
     * @param precio precio del producto
     * */
    public PanelExpendedor (int numProducto, int precio){
        exp = new Expendedor(5, 400);
        x = 700;
        y = 100;
        
        cocacola = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        
        
        for(int i=0; i<numProducto; i++){
            cocacola.addProducto(new CocaCola(100+i));
            sprite.addProducto(new Sprite(200 +i));
            snickers.addProducto(new Snickers(300 +i));
            super8.addProducto(new Super8(400 +i));           
        }
    }
    
  public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }


    /** Metodo que dibuja y muestra elementos en la GUI
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     */
    public void paint(Graphics g,JPanel panel){
        super.paint(g);
        
        
        
        // Máquina
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(this.getX(), this.getY(), 450, 500);
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+55, this.getY()+500, 30, 15);
        g.fillRect(this.getX()+370, this.getY()+500, 30, 15);
        
        // Vidrio
        g.setColor(Color.CYAN);
        g.fillRect(this.getX()+30, this.getY()+20, 320, 460);
        
        // Depositos
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+30, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+102, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+182, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+262, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+342, this.getY()+20, 8, 460);
        
        
        Image i1 = new ImageIcon(this.getClass().getResource("Textura/coca-colaBoton.jpg")).getImage();
        g.drawImage(i1, x+370, y + 36, 60, 50, panel);
        Image i2 = new ImageIcon(this.getClass().getResource("Textura/Sprite Boton.png")).getImage();
        g.drawImage(i2, x+370, y + 95, 60, 50, panel);
        Image i3 = new ImageIcon(this.getClass().getResource("Textura/super8 Boton.png")).getImage();
        g.drawImage(i3, x+370, y + 154, 60, 50, panel);
        Image i4 = new ImageIcon(this.getClass().getResource("Textura/SnickersBoton.jpg")).getImage();
        g.drawImage(i4, x+370, y + 213, 60, 50, panel);
        
        
    }
}
