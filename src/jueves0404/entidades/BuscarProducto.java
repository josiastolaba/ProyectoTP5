
package jueves0404.entidades;

import java.util.TreeSet;


public class BuscarProducto {
    
     public Producto buscarProductoPorCodigo(TreeSet<Producto> productos, int codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }
        return null;
    }
}
