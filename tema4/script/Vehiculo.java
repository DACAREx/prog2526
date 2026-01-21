package prog.ud4.ejercicios3;

// Clase Vehiculo
public class Vehiculo {

// Atributos (privados)
private final String matricula;
private final String marca;
private final int annoFabricacion;
private double precio;
private final TipoVehiculo tipo;

// Constructor
public Vehiculo(String matricula, String marca, int annoFabricacion, double precio, TipoVehiculo tipo) {
    this.matricula = matricula;
    this.marca = marca;
    this.annoFabricacion = annoFabricacion;
    this.precio = precio;
    this.tipo = tipo;
}

// Muestra la información del vehículo
public void mostrarInformacion() {
    System.out.println("------------------------");
    System.out.println("Matricula: " + matricula);
    System.out.println("Marca: " + marca);
    System.out.println("Anno de fabricacion: " + annoFabricacion);
    System.out.println("Precio: " + precio);
    System.out.println("Tipo: " + tipo);
    System.out.println("------------------------");
}

// Devuelve true si el vehículo tiene más de 10 años
public boolean esAntiguo() {
    int anioActual = 2026;
    if (anioActual - annoFabricacion > 10) {
        return true;
    } else {
         return false;
    }
}

// Aplica un descuento al precio
public void aplicarDescuento(double porcentaje) {
    precio = precio - (precio * porcentaje / 100);
}
}
