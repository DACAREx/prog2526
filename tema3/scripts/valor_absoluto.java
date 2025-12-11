package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio13 {  
    public static void main(String[] args) {
        System.out.println("Introduce el numero del que desee saber su valor aboluto: ");
        Scanner sc1 = new Scanner(System.in);
        long num = sc1.nextLong();
        long ValorAbsoluto = (num > 0 ? num : (num * -1));
        System.out.println("El valor absoluto de " + num + " es " + ValorAbsoluto);
    }
}
