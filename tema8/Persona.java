package progud8.ejercicio10;

import java.util.*;

// Clase Persona
class Persona {
    String nombre;
    String apellidos;
    int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String toString() {
        return nombre + " " + apellidos + " - Edad: " + edad;
    }
}

class ComparadorPorEdad implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return p1.edad - p2.edad;
    }
}

class ComparadorPorApellidos implements Comparator<Persona> {
    public int compare(Persona p1, Persona p2) {
        return p1.apellidos.compareTo(p2.apellidos);
    }
}
    