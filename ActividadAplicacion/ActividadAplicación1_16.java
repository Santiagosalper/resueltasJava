package ActividadAplicacion;

import java.util.Scanner;

public class ActividadAplicación1_16 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       int seg,min,hor,total;
        System.out.println("Indica una cantidad de segundos");
        seg=sn.nextInt();
        min=seg/60;
        seg%= 60; // --> se utiliza  el módulo para obtener el resultado entre los segundos y los min y hor
        hor=min/60; // bien
        min%=60; // ->
        //1 hora tiene 3600 seg
        System.out.println(hor + ":" + min + ":" + seg);

    }

}
