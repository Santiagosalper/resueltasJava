package ActividadAplicacion;

import java.util.Scanner;

public class ActividadAplicacion1_12 {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        //insertar un número
        System.out.println("Indicar el número");
        int num = sn.nextInt();
        int aprox = 7-num%7;
        System.out.println("Al número le falta " + aprox + " para ser multiplo de 7");


    }
}
