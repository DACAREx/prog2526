package prog.ud5.ejercicios;

import java.util.Scanner;

public class HolaMundo 
{
    public static void main(String[] args) {
       System.out.println("Hola Mundo");   
       java.time.LocalTime queHoraEs = java.time.LocalTime.now();
       System.out.println("La hora del sistema es: " + queHoraEs);        
       
       System.out.println("Introduzca un numero: ");
       Scanner sc = new Scanner(System.in);
       double numero = sc.nextDouble();
       System.out.println("El numero es: " + numero );
    }
}