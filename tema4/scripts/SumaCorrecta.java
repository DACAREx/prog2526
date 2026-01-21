package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        System.out.println("Suma los numeros " + a + " y " + b );
        Scanner sc = new Scanner(System.in);
        int num;
        boolean respuesta = false;
        do {
            System.out.println("Introduce el resultado: ");
            num = sc.nextInt();
            if (num == (a + b)) {  
                System.out.println("Enhorabuena! La suma es correcta.");
                a = (int)(Math.random() * 101);
                b = (int)(Math.random() * 101);
                System.out.println("");
                System.out.println("los nuevos numeros son " + a + " y " + b );
                respuesta = true;
            } else {
                System.out.println("La suma es incorrecta introduciste " + num
                + " y la solucion era " + (a + b));
                break;
        }
        } while (respuesta == true);
    }
  }

