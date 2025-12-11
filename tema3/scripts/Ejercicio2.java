package prog.ud5.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String args[]) {
       System.out.println("Introduzca su edad: ");
       Scanner sc = new Scanner(System.in);
       int edad = sc.nextInt();
       edad = edad + 1;
       System.out.println("El anno que viene tendras: " + edad );
    }
}
