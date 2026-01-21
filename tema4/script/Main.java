package prog.ud4.ejercicios3;

public class Main {

    public static void main(String[] args) {

        // Crear vehículos
        Vehiculo v1 = new Vehiculo("4321JKL", "Lamborguini", 2025, 250000.00, TipoVehiculo.TURISMO);
        Vehiculo v2 = new Vehiculo("8765MNO", "Honda", 2020, 4499.99, TipoVehiculo.MOTOCICLETA);
        Vehiculo v3 = new Vehiculo("1098PQR", "Mercedes", 2010, 90000.00, TipoVehiculo.CAMION);


        // Mostrar información antes del descuento
        System.out.println("ANTES DEL DESCUENTO");
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();

        // Aplicar descuentos
        v1.aplicarDescuento(10);
        v2.aplicarDescuento(5);
        v3.aplicarDescuento(20);

        // Mostrar información después del descuento
        System.out.println("DESPUES DEL DESCUENTO");
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();

        // Comprobar si un vehículo es antiguo
        System.out.println("El camion es antiguo? " + v3.esAntiguo());

        // Referencias
        Vehiculo referencia = v1;
        referencia.aplicarDescuento(10);

        System.out.println("Despues de usar la referencia:");
        v1.mostrarInformacion();
    }
}
