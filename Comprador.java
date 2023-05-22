/**
 * Clase que recibe la solicitud del comprador
 * */

public class Comprador{
    private String sabor;
    private int vuelto;
    private Expendedor exp;

    /** Recibe la moneda del comprador, el tipo de producto y comprueba la validez de esta solicitud
     * @param m maneja las monedas (Moneda)
     * @param cual maneja la seleccion del comprador (int)
     * @param exp llama a metodos del Expendedor (Expendedor)
     */
    
    public Comprador(Moneda m, int cual, Expendedor exp){
          this.exp=exp;
          
          if (exp.comprarProducto(m, cual) != null) {
              switch (cual) {
                  case 1:
                      sabor = "cocacola";
                      break;
                  case 2:
                      sabor = "sprite";
                      break;
                  case 3:
                      sabor = "snickers";
                      break;
                  case 4:
                      sabor = "super8";
                      break;
                  default:
                      break;
              }
        }
        Moneda moneda = null;
        
        moneda = exp.getVuelto();
        while (moneda != null) {
            vuelto = vuelto + moneda.getValor();
            moneda = exp.getVuelto();
        }
    }

    /** Metodo que retorna el tipo de producto
     * @return retorna el tipo de producto
     * */
    public  String queBebiste(){
        return sabor;
    }

    /** Metodo que retorna el vuelto
     * @return retorna el vuelto
     * */
    public int cuantoVuelto() {
        return vuelto;
    }
    
}