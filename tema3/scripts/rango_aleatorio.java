package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio17 {
   public static void main(String[] args) {
   int a = (int)(Math.random()* 101); 
   int b = (int)(Math.random()* 101);
   System.out.println("Introduce un numero :");
   Scanner sc = new Scanner(System.in);
   int num = sc.nextInt();
  if ((num < b) && (num > a)) {
  System.out.println("Enhorabuena el numero introducido esta entre los numeros " + a + " y " + b);
  System.out.println("El numero que tu introduciste es " + num );
} else {
  System.out.println("El numero " + num + " no estaba entre el rango");
     }
  }
}


