package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.print("Introduce el radio: ");
        Scanner sc = new Scanner(System.in);
        float radio = sc.nextFloat();
        double longitud = (2 * radio * 3.14);
        double Area = (3.14 * radio * radio);
        System.out.println("longitud: " + longitud);
        System.out.println("Area: " + Area);
    }
}
