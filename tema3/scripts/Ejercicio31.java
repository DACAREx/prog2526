package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {        
        System.out.println("Introduce el lado del triangulo rectangulo: ");
        Scanner sc = new Scanner(System.in);
        int NumOriginal = sc.nextInt();
        while (NumOriginal > 0) {          
            int NumTemporal = NumOriginal - 1;
            while (NumTemporal > 0) {
                System.out.print("*");
                NumTemporal -= 1;
            }
            System.out.println("*");
            NumOriginal -= 1;
        }
    }
}
