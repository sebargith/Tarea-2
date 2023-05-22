import javax.swing.*;
import java.awt.*;

/**
 * Clase que recibe el valor de los distintos tipos de monedas
 * */
abstract class Moneda{
    /** Parametro int que se lo llama cuando se referencia al valor de una moneda*/
    protected int valor;

    private final int serie;

    protected static int serieMoneda = 0 ;

    /** Constructor por defecto*/
    public Moneda(int serie){
        this.serie=serie;
    }


    /** Metodo que le da serie a una moneda*/
    public int getSerie(){
        return serie;
    }

    /** Metodo abstracto que recibe el valor especifico de cada clase de moneda*/
    public abstract int getValor();

    public abstract void paint(Graphics g, int x, int y, int w, int h, JPanel panel);
}

/**
 * Clase de monedas de valor 1500, hereda de moneda
 * */
class Moneda1500 extends Moneda{
    /** Constructor, le da valor a la moneda*/
    public Moneda1500(){

        valor=1500;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }

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
    public Moneda1000(){
        valor=1000;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }

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
    public Moneda500(){
        valor=500;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }

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
    public Moneda100(){
        valor=100;
    }

    /** Metodo que sirve como getter para el valor de la moneda*/
    public int getValor(){
        return valor;
    }

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