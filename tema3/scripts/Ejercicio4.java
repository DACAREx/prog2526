package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("En que anno naciste?");
        int anno_actual = 2025;
        int anno_nacimiento = sc.nextInt();
        int edad = anno_actual - anno_nacimiento;
        System.out.println("Tu tienes " + edad + " annos.");
    }
}
