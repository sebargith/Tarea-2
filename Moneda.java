
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;

/**
 * Clase que recibe el valor de los distintos tipos de monedas
 * */
public abstract class Moneda{
    protected int valor;
    private final int serie;
    protected static int serieMoneda = 0 ;

    /** Metodo que le da serie a una moneda
     * @param serie identificador de monedas
     * */
    public Moneda(int serie){
        this.serie=serie;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public abstract int getValor();
    
    public abstract void paint(Graphics g, int x, int y, int w, int h, JPanel panel);
}


/**
 * Clase de monedas de valor 1500, hereda de moneda
 * */
class Moneda1500 extends Moneda{

    /** Constructor, le da valor a la moneda*/
    public Moneda1500(int serie){
        super(serie);
        valor=1500;        
    }


    public int getValor(){
        return valor;
    }


    /** Metodo que dibuja y muestra elementos en la GUI
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     * @param x,y,w,h coordenadas y dimensiones
     */
    public void paint(Graphics g, int x, int y, int w, int h, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/Moneda1500.png")).getImage();
            g.drawImage(i, x, y, w, h, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            g.setColor(new Color(255, 255, 255));
            g.drawString(String.valueOf(this.getSerie()), x+w/3, y+5*h/6);
    }
}



/**
 * Clase de monedas de valor 1000, hereda de moneda
 * */
class Moneda1000 extends Moneda{

    /** Constructor, le da valor a la moneda*/
    public Moneda1000(int serie){
        super(serie);
        valor=1000;
    }
    public int getValor(){
        return valor;
    }


    /** Metodo que dibuja y muestra elementos en la GUI
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     * @param x,y,w,h coordenadas y dimensiones
     */
    public void paint(Graphics g, int x, int y, int w, int h, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/Moneda1000.png")).getImage();
            g.drawImage(i, x, y, w, h, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            g.setColor(new Color(255, 255, 255));
            g.drawString(String.valueOf(this.getSerie()), x+w/3, y+5*h/6);
    }
}


/**
 * Clase de monedas de valor 500, hereda de moneda
 * */
class Moneda500 extends Moneda{

    /** Constructor, le da valor a la moneda*/
    public Moneda500(int serie){
        super(serie);
        valor=500;
    }
    public int getValor(){
        return valor;
    }


    /** Metodo que dibuja y muestra elementos en la GUI
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     * @param x,y,w,h coordenadas y dimensiones
     */
    public void paint(Graphics g, int x, int y, int w, int h, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/Moneda500.png")).getImage();
            g.drawImage(i, x, y, w, h, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            g.setColor(new Color(255, 255, 255));
            g.drawString(String.valueOf(this.getSerie()), x+w/3, y+5*h/6);
    }
}

/**
 * Clase de monedas de valor 100, hereda de moneda
 * */
class Moneda100 extends Moneda{

    /** Constructor, le da valor a la moneda*/
     public Moneda100(int serie){
        super(serie);
        valor=100;
    }
    
     public int getValor(){
        return valor;
    }


    /** Metodo que dibuja y muestra elementos en la GUI
     * @param g representa el contexto grafico
     * @param panel representa en donde se dibujara
     * @param x,y,w,h coordenadas y dimensiones
     */
    public void paint(Graphics g, int x, int y, int w, int h, JPanel panel){
        try {
            Image i = new ImageIcon(this.getClass().getResource("Textura/Moneda100.png")).getImage();
            g.drawImage(i, x, y, w, h, panel);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            g.setColor(new Color(255, 255, 255));
            g.drawString(String.valueOf(this.getSerie()), x+w/3, y+5*h/6);
    }
}