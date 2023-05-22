

/**
 * Saca productos comprados del deposito
 * */
class DepositoCompra {
    private Producto pr;

    /** Metodo que agrega un producto al atributo pr
     * @param producto toma un producto de la clase Producto
     * */
    public void agregarProducto(Producto producto){
        pr = producto;
    }


    /** Metodo que define productos y los imprime con sus numeros de serie
     * */
    public Producto getProducto(){
        Producto producto= pr;
        pr = null;
        System.out.println("Número de serie:" + producto.getSerie());
        return producto;
    }

    /** Metodo que verifica si el deposito esta vacio
     * */
    public Boolean depositoVacio(){
        if(pr == null){
            return true;
        }
        else{
            return false;
        }
    }
}