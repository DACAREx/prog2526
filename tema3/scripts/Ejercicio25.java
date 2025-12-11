package prog.ud5.ejercicios;

import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad_min;
        int edad_max = 0;
        do {
            System.out.println("Introduce edad (-1 para salir): ");
            edad_min = sc.nextInt();
            if (edad_min != -1) {  
                 if (edad_max > edad_min) {
               System.out.println("Introduce otra edad (-1 para salir): ");
               edad_min = sc.nextInt();
               } else {
                edad_max = edad_min;
               System.out.println("Introduce otra edad (-1 para salir): ");
               edad_min = sc.nextInt();}
            }
        } while(edad_min != -1); {
        System.out.println("La edad maxima del grupo es " +  edad_max);
        System.out.println("La edad minima del grupo es " +  edad_min);
    }
  }
}
            