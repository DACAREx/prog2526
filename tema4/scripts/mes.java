
package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Introduce el numero del mes: ");
    int num = sc.nextInt();
    switch (num){
        case 1,3,5,7,8,10,12 -> System.out.println("Este mes tiene 31 dias");
        case 4,6,9,11 -> System.out.println("Este mes tiene 30 dias");
        case 2 -> System.out.println("Este mes es febrero y puede tener tanto 28 como 29 dias");
        default -> System.out.println("Recuerda que son 12 meses e introducelo sin decimales");
    }
    }
}
