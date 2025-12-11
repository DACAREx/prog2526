package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Esta lloviendo (Responde True/False): ");
        boolean llueve = sc1.nextBoolean();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Has hecho la tarea (Responde True/False): ");
        boolean tareas = sc2.nextBoolean();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Vas a la biblioteca (Responde True/False): ");
        boolean biblioteca = sc3.nextBoolean();
        boolean salir = biblioteca || (!llueve && tareas);
        System.out.println("Podras salir: " + salir);     
    }    
}
