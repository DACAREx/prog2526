package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero de ecos: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while (i <= num){
            System.out.println("Eco...");
            i += 1;
        }
    }
}
