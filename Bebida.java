import javax.swing.*;
import java.awt.*;

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
class Sprite extends Bebida {
    /**
     * Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     */
    public Sprite(int serie) {
        super(serie);
    }

    /** Metodo que retorna una bebida de tipo Sprite
     * @return retorna una bebida de tipo Sprite
     * */
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


/**
 * Clase CocaCola que hereda de Bebida
 * */
class CocaCola extends Bebida{
    /** Constructor que toma la serie y la relaciona con su clase padre
     * @param serie recibe la serie de la bebida (int)
     * */

    public CocaCola(int serie){
        super(serie);
    }

    /** Metodo que retorna una bebida de tipo Coca cola
     * @return retorna una bebida de tipo Coca-Cola
     * */

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