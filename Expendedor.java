
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Naxo
 */
public class Expendedor extends JPanel{
    private DepositoVuelto dv;
    private Deposito cocacola;
    private Deposito sprite;
    private Deposito snickers;
    private Deposito super8;
    private DepositoCompra compra;
    
    private int x;
    private int y;
    
    public int precioProducto;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    public static final int  SNICKERS=3;
    public static final int  SUPER8=4;
    

    
    public Expendedor(int numProducto,int precioProducto){
        x = 667;
        y = 28;
        this.precioProducto=precioProducto;
        dv = new DepositoVuelto();
        cocacola = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        compra = new DepositoCompra();
        
        for(int i=0; i<numProducto; i++){
            cocacola.addProducto(new CocaCola(100+i));
            sprite.addProducto(new Sprite(200 +i));
            snickers.addProducto(new Snickers(300 +i));
            super8.addProducto(new Super8(400 +i));           
        }
    }
    
    
    
    public Producto comprarProducto(Moneda m, int sabor){
        if(m==null)return null;
        int vuelto = m.getValor();
        Bebida cocaColaBebida = null;
        Bebida spriteBebida = null;
        Dulce snickersDulce = null;
        Dulce super8Dulce = null;
        
               
        if (sabor == 1 && m.getValor() >= precioProducto) {
            cocaColaBebida = (Bebida) cocacola.getProducto();
            if (cocaColaBebida != null) {
                vuelto = m.getValor() - precioProducto;
            }
        }
        if (sabor == 2 && m.getValor() >= precioProducto) {  
            spriteBebida = (Bebida) sprite.getProducto();
            if (spriteBebida != null) {
                vuelto = m.getValor() - precioProducto;
            }
        }
        if (sabor == 3 && m.getValor() >= precioProducto) {  
            snickersDulce = (Dulce) snickers.getProducto();
            if (snickersDulce != null) {
                vuelto = m.getValor() - precioProducto;
            }
        }
        if (sabor == 4 && m.getValor() >= precioProducto) {  
            super8Dulce = (Dulce) super8.getProducto();
            if (super8Dulce != null) {
                vuelto = m.getValor() - precioProducto;
            }
        }
        
        while (vuelto > 0) {
            dv.addMoneda(new Moneda100(Moneda.serieMoneda));
            vuelto = vuelto - 100;
        }

        switch (sabor) {
            case 1:
                return cocaColaBebida;
            case 2:
                return spriteBebida;
            case 3:
                return snickersDulce;
            case 4:
                return super8Dulce;
            default:
                return null;
        }
        
    }
    
    public Moneda getVuelto(){
        return (Moneda) dv.getMoneda();
    }   
    
    public void Refill(){
        if(cocacola.isEmpty()){
            for (int i = 0; i < cocacola.Size(); i++){
                Bebida coca = new CocaCola(i+100);
                cocacola.addProducto(coca);
            }
        } else {
            System.out.println("Aun queda Coca-cola.");
        }
        if(sprite.isEmpty()){
            for (int i = 0; i < sprite.Size(); i++){
                Bebida spr = new Sprite(i+200);
                sprite.addProducto(spr);
            }
        } else {
            System.out.println("Aun queda Sprite.");
        }
        if(snickers.isEmpty()){
            for (int i = 0; i < snickers.Size(); i++){
                Dulce snk = new Snickers(i+300);
                sprite.addProducto(snk);
            }
        } else {
            System.out.println("Aun quedan Snickers.");
        }
        
        if(super8.isEmpty()){
            for (int i = 0; i < super8.Size(); i++){
                Dulce sup8 = new Super8(i+400);
                sprite.addProducto(sup8);
            }
        } else {
            System.out.println("Aun quedan Super8.");
        }
    }  
    
      public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    
    
    public void paint(Graphics g,JPanel panel){
        super.paint(g);
        
        
        
        // Máquina
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(this.getX(), this.getY(), 450, 500);
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+55, this.getY()+500, 30, 15);
        g.fillRect(this.getX()+370, this.getY()+500, 30, 15);        
        g.setColor(Color.CYAN);
        g.fillRect(this.getX()+30, this.getY()+20, 320, 460);        
        g.setColor(Color.BLACK);
        g.fillRect(this.getX()+30, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+102, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+182, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+262, this.getY()+20, 8, 460);
        g.fillRect(this.getX()+342, this.getY()+20, 8, 460);
        
        // Refill
        g.setColor(Color.red);
        g.fillRect(this.getX()+370, this.getY()+340, 60, 50);
        
        
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