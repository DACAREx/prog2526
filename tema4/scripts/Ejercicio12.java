package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num2 = sc2.nextInt();
        int solucion = (num1 > num2 ? num1 : num2);
        System.out.println(solucion + " es mayor.");
    }
}
