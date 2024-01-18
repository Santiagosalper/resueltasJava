package ActividadAplicacion;

import java.util.Scanner;

public class ActividadAplicacion1_11 {
    public static void main(String[] args) {
        double precioProducto, precioTotal, ivaProducto;
        byte iva;
        //preguntamos el precio
        Scanner sn = new Scanner(System.in);
        System.out.println("*********CALCULO DEL IVA********");
        System.out.println("********************************");
        System.out.println("Indica el precio sin iva del Producto (Base) ->");
        precioProducto = sn.nextDouble();
        System.out.print("Indica el IVA -> ");
        iva = sn.nextByte();
        ivaProducto = precioProducto * ((double) iva/100);
        precioTotal = ivaProducto + precioProducto;
        System.out.println("********************************");
        System.out.println("El producto con base " + precioProducto + "€ + iva del "+iva+ "% da un total de "+ precioTotal+ "€");
        System.out.println("*****************************************");




    }


}
