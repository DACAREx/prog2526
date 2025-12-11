package prog.ud5.ejercicios;
import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        if (b < a) {
            int a_original = a;
            a = b;
            b = a_original;
        }
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero:");
            num = sc.nextInt();
            if (num >= a && num <= b) {  
                System.out.println("Enhorabuena! El numero esta dentro del rango.");
                System.out.println("los numeros del rango eran  " + a + " y " + b );
                System.out.println("numero introducido: " + num);
            } else {
                System.out.println("El numero " + num + " no esta en el rango");
                }if (num < a && num < b){
                System.out.println("Intenta de nuevo con un numero mas alto.");
                System.out.println("");
                }else {
                System.out.println("Intenta de nuevo con un numero mas bajo."); 
                System.out.println("");
        }
        } while (num < a || num > b);
    }
}

