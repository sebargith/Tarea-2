
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;

public abstract class Moneda{
    protected int valor;
    private final int serie;
    protected static int serieMoneda = 0 ;
    
    public Moneda(int serie){
        this.serie=serie;
    }
    
    public int getSerie(){
        return serie;
    }
    
    public abstract int getValor();
    
    public abstract void paint(Graphics g, int x, int y, int w, int h, JPanel panel);
}


class Moneda1500 extends Moneda{
    public Moneda1500(int serie){
        super(serie);
        valor=1500;        
    }
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


class Moneda1000 extends Moneda{
    public Moneda1000(int serie){
        super(serie);
        valor=1000;
    }
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


class Moneda500 extends Moneda{
    public Moneda500(int serie){
        super(serie);
        valor=500;
    }
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
class Moneda100 extends Moneda{
     public Moneda100(int serie){
        super(serie);
        valor=100;
    }
    
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