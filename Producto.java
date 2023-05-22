
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Clase padre de Bebidas y Dulces, se la usa para llamar a estas clases
 * */
public abstract class Producto{   
    private int x;
    private int y;
    private int serie;
    protected static int serieBebidas = 0 ;


    /** Constructor que recibe la serie del producto y lo guarda
     * @param serie recibe la serie para usarla como producto (int)
     * */
    public Producto(int serie){
        this.serie=serie;
    }


    /** Metodo que retorna la serie con un getter
     * @return retorna la serie del producto
     * */
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




/**
 * Clase Bebida que hereda de Producto
 * */
abstract class Bebida extends Producto{

    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     * */
    public Bebida(int serie){
        super(serie);
    }
}


/**
 * Clase Sprite que hereda de Bebida
 * */
class Sprite extends Bebida{

    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     * */
    public Sprite(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Sprite";
    }


    /** Metodo que dibuja y muestra elementos en la GUI, dibuja la lata de Sprite
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     */
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




/**
 * Clase Sprite que hereda de Bebida
 * */
class CocaCola extends Bebida{
    
    public CocaCola(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Coca-Cola";
    }



    /** Metodo que dibuja y muestra elementos en la GUI, dibuja la lata de CocaCola
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     */
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



/**
 * Clase Dulce que hereda de Producto
 * */
abstract class Dulce extends Producto{
    
    public Dulce(int serie){
        super(serie);
    }
}



/**
 * Clase Snickers que hereda de Dulce
 * */
class Snickers extends Dulce{
    
    public Snickers(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Snickers";
    }


    /** Metodo que dibuja y muestra elementos en la GUI, dibuja la imagen de un Snickers
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     */
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



/**
 * Clase Super8 que hereda de Dulce
 * */
class Super8 extends Dulce{
    
    public Super8(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Super 8";
    }


    /** Metodo que dibuja y muestra elementos en la GUI, dibuja la imagen de un Super8
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     */
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