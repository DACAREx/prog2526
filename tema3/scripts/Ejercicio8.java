package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.print("Introduce tu edad: ");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        boolean comprobar = edad >= 18;
        System.out.println(comprobar);
    }
}
