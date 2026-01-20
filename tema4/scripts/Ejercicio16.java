package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce un numero decimal: ");
       double num = sc.nextDouble();
       int numEn = (int) num;
       System.out.println("El numero entero mas cercano es: " + numEn);             
    }
}
