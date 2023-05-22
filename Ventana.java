
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * Crea la ventana en donde se muestran todos los paneles
 * */
public class Ventana extends JFrame {


    /** Constructor, define los parametros de la ventana
     * */
    public Ventana(){
        super();
        this.setLayout(new BorderLayout());
        this.setTitle("Tarea 2: Expendedor");
        setResizable(false);
        this.setVisible(true); 
        this.add(new PanelPrincipal());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1280,720);      
        setLocationRelativeTo(null);
   }   
}
