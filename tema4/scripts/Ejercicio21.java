package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce la nota: ");
    float num = sc.nextFloat();
    int nota = (int)num;
        switch(nota){
            case 0,1,2,3,4:
                System.out.println("La nota es insuficiente");
                break;
            case 5:
                System.out.println("La nota es suficiente");
                break;
            case 6:
                System.out.println("La nota es bien");
                break;
            case 7,8:
                System.out.println("La nota es notable");
                break;
            case 9,10:
                System.out.println("La nota es sobresaliente");
                break;
            default:
                System.out.println("ERROR; Nota no valida");
                break;
        }        
    }
}
