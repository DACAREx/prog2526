package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos saludos quieres?");
        int n = sc.nextInt();
        System.out.println("Saludos: ");
        variosSaludos(n);
        System.out.println("Saludos x2: ");
        variosSaludos(n * 2);
    }
    public static void variosSaludos(int n) {
        for (int j = 1; j <= n; j++) {
            System.out.println("Hola");
        }
    }
}
