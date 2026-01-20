package prog.ud5.ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        double PRECIOMANZANAS = 2.35;
        double PRECIOPERAS = 1.95;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Cuantos kilos de manzanas vende cada semestre");
        double manzanas = sc1.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Cuantos kilos de peras vende cada semestre");
        double peras = sc2.nextDouble();
        double total = (manzanas * 2 * PRECIOMANZANAS) + (peras * 2 * PRECIOPERAS);
        System.out.println("Importe total: " + total );
    }
    
}
