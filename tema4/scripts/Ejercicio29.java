package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        System.out.println("Introduce el numero que desee saber su factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num;
        int fact = 1;
        while (i != 0){
            fact = fact * i;
            i -= 1;
        }
        System.out.println("El factorial de " + num + " es " + fact);
    }
}