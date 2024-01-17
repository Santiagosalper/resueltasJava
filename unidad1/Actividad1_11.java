package unidad1;

import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
   final double PRECIO_MANZANAS = 2.35; //valores constantes, no varían durante
   //el programa
   final double PRECIO_PERAS = 1.95;
   //los identificadores de constantes los escribimos en mayúsculas
        int vManz1Sem, vManz2Sem; //ventas (en kilos) por semestre
        int vPeras1Sem, vPeras2Sem; //igual para las peras
        double impTotal; //importe total
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.println("Para las manzanas: ");
        System.out.println("Ventas (en kilos) del primer semestre: ");
        vManz1Sem = sc.nextInt();
        System.out.println("Ventas (en kilos) del segundo semestre: ");
        vManz2Sem = sc.nextInt();
        System.out.println("Para las peras: ");
        System.out.println("Ventas (en kilos) del primer semestre: ");
        vPeras1Sem = sc.nextInt();
        System.out.println("Ventas (en kilos) del segundo semestre: ");
        vPeras2Sem = sc.nextInt();
        //calculamos el importe total obtenido
        impTotal = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS;//47
        impTotal += (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;//47+78
        System.out.println("El importe total es de: " + impTotal + " euros");







    }


}
