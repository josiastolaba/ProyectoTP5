/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jueves0404.entidades;

import java.util.Comparator;

/**
 *
 * @author Cristian
 */
public class Comparador implements Comparator<Producto> {
public int compare(Producto p1, Producto p2) {
if(p1.getCodigo() < p2.getCodigo()) return -1;if(p1.getCodigo() == p2.getCodigo()) return 0;
return 1;
}
}
