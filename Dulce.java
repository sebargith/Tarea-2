import javax.swing.*;
import java.awt.*;

/**
 * Clase Dulce que hereda de Producto
 * */
abstract class Dulce extends Producto{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Dulce(int serie){
        super(serie);
    }
}


/**
 * Clase Snickers que hereda de Dulce
 * */
class Snickers extends Dulce{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Snickers(int serie){
        super(serie);
    }

    /** Metodo que retorna un dulce de tipo Snickers
     * @return retorna un dulce del tipo Snickers
     * */
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

/**
 * Clase Super8 que hereda de Dulce
 * */
class Super8 extends Dulce{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie del dulce (int)
     * */
    public Super8(int serie){
        super(serie);
    }

    /** Metodo que retorna un dulce de tipo Super 8
     * @return retorna un dulce del tipo Super 8
     * */
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