
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public abstract class Producto{   
    private int x;
    private int y;
    private int serie;
    protected static int serieBebidas = 0 ;
    
    public Producto(int serie){
        this.serie=serie;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public abstract String getName();
    
    public void paint(Graphics g){};
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void paint(Graphics g, JPanel panel){}
}

abstract class Bebida extends Producto{
    
    public Bebida(int serie){
        super(serie);
    }
}

class Sprite extends Bebida{
    
    public Sprite(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Sprite";
    }
    public void paint(Graphics g, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/ProductoSprite.png")).getImage();
            g.drawImage(i, getX(), getY(), 49, 71, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        g.setColor(Color.black);
        g.drawString(String.valueOf(this.getSerie()), getX()+5, getY()+60);
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Coca-Cola";
    }
    
    public void paint(Graphics g, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/ProductoCocaCola.png")).getImage();
            g.drawImage(i, getX(), getY(), 49, 71, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        g.setColor(Color.black);
        g.drawString(String.valueOf(this.getSerie()), getX()+5, getY()+60);
    }
}

abstract class Dulce extends Producto{
    
    public Dulce(int serie){
        super(serie);
    }
}

class Snickers extends Dulce{
    
    public Snickers(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Snickers";
    }
    public void paint(Graphics g, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/ProductoSnickers.png")).getImage();
            g.drawImage(i, getX(), getY(), 49, 71, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        g.setColor(Color.black);
        g.drawString(String.valueOf(this.getSerie()), getX()+5, getY()+60);
    }
}

class Super8 extends Dulce{
    
    public Super8(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Super 8";
    }
    public void paint(Graphics g, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/ProductoSuper8.png")).getImage();
            g.drawImage(i, getX(), getY(), 49, 71, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        g.setColor(Color.black);
        g.drawString(String.valueOf(this.getSerie()), getX()+5, getY()+60);
    }
}