
class DepositoCompra {
    private Producto pr;
    
      public void agregarProducto(Producto producto){
        pr = producto;
    }
    
    public Producto getProducto(){
        Producto producto= pr;
        pr = null;
        System.out.println("Número de serie:" + producto.getSerie());
        return producto;
    }
    
    public Boolean depositoVacio(){
        if(pr == null){
            return true;
        }
        else{
            return false;
        }
    }
}