
package jueves0404.entidades;

import java.util.Comparator;

public class Comparador implements Comparator<Producto> {
@Override
public int compare(Producto p1, Producto p2) {
if(p1.getCodigo() < p2.getCodigo()) return -1;if(p1.getCodigo() == p2.getCodigo()) return 0;
return 1;
}
}
