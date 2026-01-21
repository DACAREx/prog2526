package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Cual es la primera nota: ");
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Cual es la segunda nota: ");
        Scanner sc2 = new Scanner(System.in);
        float nota1 = sc1.nextFloat();
        float nota2 = sc2.nextFloat();
        float media = (nota1 + nota2)/2;
        System.out.println("La nota media: " + media);
    }
}
