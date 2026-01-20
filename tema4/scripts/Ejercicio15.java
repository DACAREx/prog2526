package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce nota 1er Trimestre: ");
        int nota1 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce nota 2ndo Trimestre: ");
        int nota2 = sc2.nextInt();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce nota 3er Trimestre: ");
        int nota3 = sc3.nextInt();
        int calificacion = (nota1 + nota2 + nota3)/3;
        float expediente = (float)(nota1 + nota2 + nota3)/3;
        System.out.println("La calificacion es " + calificacion);
        System.out.println("La nota de expediente es " + expediente);
    }
}
