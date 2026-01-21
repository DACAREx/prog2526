package prog.ud5.ejercicios;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero (0 para cerrar): ");
            num = sc.nextInt();
            if (num != 0) {
                if (num % 2 == 0) {
                    System.out.println("El numero " + num + " es par");
                } else {
                    System.out.println("El numero " + num + " es impar");
                }
                if (num > 0) {
                    System.out.println("El numero " + num + " es positivo");
                } else {
                    System.out.println("El numero " + num + " es negativo, su positivo es " + (num * -1) );
                }
                System.out.println("El cuadrado de " + num + " es " + (num * num));
            }
        } while (num != 0);
        System.out.println("Programa finalizado.");
    }
}
