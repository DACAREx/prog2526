package progud8;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Ejercicio5 {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(7);
        numeros.add(9);
        numeros.add(6);
        numeros.add(12); 
        numeros.add(21);

        System.out.println(numeros);

        // 4. Añadir un número repetido
        numeros.add(7);
        System.out.println("Con duplicado: " + numeros);

        // 5. Añadir null
        numeros.add(null);
        System.out.println("Con null: " + numeros);

        // 6. Crear conjunto con los dos primeros números primos
        Set<Integer> numeros2 = new HashSet<>();
        numeros2.add(2);
        numeros2.add(3);

        boolean esSubconjunto = numeros.containsAll(numeros2);
        System.out.println("¿numeros2 es subconjunto de numeros? " + esSubconjunto);

        // 7. Lista final con los valores del conjunto
        final List<Integer> lista = new ArrayList<>(numeros);
        System.out.println("Lista: " + lista);

        // Modificaciones en la lista
        lista.add(100);
        lista.remove(0);
        lista.set(0, 999);

        System.out.println("Lista modificada: " + lista);
    }
}