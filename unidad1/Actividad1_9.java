package unidad1;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escriba un número: ");
        //Es habitual crear y leer de un Scanner, haciéndolo todo en la misma instrucción
        numero = new Scanner(System.in) .nextInt();
        boolean esPar = (numero % 2) == 0; //calcula el resto de dividir el número
        //entre 2 y el resultado de esta operación la compra con 0
        System.out.println("Es par : " + esPar);






    }

}
