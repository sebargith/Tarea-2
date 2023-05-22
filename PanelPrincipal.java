
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 * Clase que representa el panel principal, desde donde se agregaran productos al expendedor
 * */
public class PanelPrincipal extends JPanel{
    
    
    private PanelExpendedor exp;
    private Expendedor e;
    private Comprador com;

    /** Constructor, crea instancias del Expendedor y del Panel expendedor con el numero de productos y precios
     * */
    public PanelPrincipal() { 
        this.exp = new PanelExpendedor(3,300); 
        this.e=new Expendedor(3,300);
        
    }


    /** Metodo que dibuja y muestra elementos en la GUI, dibuja el fondo de pantalla y el panel del expendedor
     * @param g representa el contexto grafico
     */
    public void paint(Graphics g){
        super.paint(g);
        this.setBackground(Color.gray);
        Image i = new ImageIcon(this.getClass().getResource("Textura/Fondo.jpg")).getImage();
        g.drawImage(i, 0, 0, 1280, 720, this);
        //exp.paint(g,this);
        e.paint(g,this);
    }
    
}