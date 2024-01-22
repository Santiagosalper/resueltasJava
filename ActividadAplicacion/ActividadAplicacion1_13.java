package ActividadAplicacion;

import java.util.Scanner;

public class ActividadAplicacion1_13 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        // Indicar dos números n y m
        System.out.println("Introduce el número n : ");
        int n = sn.nextInt();
        System.out.println("Introduce el número m : ");
        int m = sn.nextInt();
        int resultado = m - (n%m);
        System.out.println("El número n ya es múltiplo de m ");
        System.out.println("Debes sumar" + resultado + "a" + n + "para que sea múltiplo de " + m);





    }


}
