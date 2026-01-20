package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int a = sc.nextInt();
        System.out.print("Introduce un numero entero: ");
        int b = sc.nextInt();
        int resultado = Mayor_Menor(a, b);
        if (resultado == 0) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Es mayor: " + resultado);
        }
    }
    private static int Mayor_Menor(int x, int y) {
        if (x > y) {
            return x;
        } else if (y > x) {
            return y;
        } else {
            return 0; 
        }
    }
}
