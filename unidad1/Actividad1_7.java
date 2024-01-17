package unidad1;

import java.util.Locale;
import java.util.Scanner;

public class Actividad1_7 {

    public static void main(String[] args) {
     double radio; //el radio puede contener decimales
        double aea, longitud;
        Scanner sc = new Scanner(System.in) ;
        sc.useLocale(Locale.US) ; //usaremos decimales con .
        // pedimos los datos
        System.out.println("Escriba el radio: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio; //la clase Math pertenece al paquete
        //java.lang, que se importa por defecto
        aea = Math.PI * Math.pow(radio, 2) ; //Math.pow(base, expone) eleva la base
        //al exponente utilizado. Math.pow(radio, 2) eleva el radio a 2 (alcuadrado)
        System.out.println("La longitud de la circunferencia es : " + longitud) ;
        System.out.println("El área del círculo es: " + aea);






    }






}
