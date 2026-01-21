package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int a = sc.nextInt();
        System.out.print("Introduce un numero entero: ");
        int b = sc.nextInt();
        int resultado1 = Mayor_Menor(a, b);
        if (resultado1 == 0) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El mayor es: " + resultado1);
        }
        System.out.print("Introduce un numero entero: ");
        int c = sc.nextInt();
        int resultado2 = Mayor_Menor(a, b, c);
        if (resultado2 == 0) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("El mayor es: " + resultado2);
        }
    }
    private static int Mayor_Menor(int x, int y) {
        if (x > y) return x;
        if (y > x) return y;
        return 0;
    }
    private static int Mayor_Menor(int x, int y, int z) {
        int mayor = Mayor_Menor(x, y);
        if (z > mayor) mayor = z;
        if (x == y && y == z) return 0;
        return mayor;
    }
}
