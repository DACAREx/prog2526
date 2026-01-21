package prog.ud5.ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
    boolean operacion1 = 10 + 5 * 2 > 20 && 4 == 4;
    System.out.println("10 + 5 * 2 > 20 && 4 == 4  -->  " + operacion1 );
    System.out.println("Es falso porque 20 no es mayor que 20 y 4 si es igual "
            +"que 4 pero para que con el operador &&  de true deben ser ambos verdad");
        System.out.println("");
        
    boolean operacion2 = !(7 + 3 > 10) || 3 * 2 <= 6;
    System.out.println("!(7 + 3 > 10) || 3 * 2 <= 6  -->  " + operacion2 );
    System.out.println("Es true porque 10 no es mayor que 10 pero al tener el simbolo "
            + "! lo vuelve contrario por lo tanto es true y 6 es menor o igual que 6"
            + " por lo tanto el operador || si ambos son ciertos el resultado es true");
        System.out.println("");
        
    boolean operacion3 = 10 / 2 + 3 * 5 == 19 && true;
    System.out.println("10 / 2 + 3 * 5 == 19 && true  -->  " + operacion3 );    
    System.out.println("El resultado es falso debido a que 10 / 2 y 3 * 5 se hacen antes de la suma"
            + " sumando asi 20 que no es lo mismo que 19 y como el operado && necesita que los dos sean ciertos "
            + " para que de true pues el resultado es false");
        System.out.println("");
    
    int x = 5; x += 3 * 2;
    System.out.println("int x = 5; x += 3 * 2  -->  " + x );
    System.out.println("X vale 11 debido a que la multiplicacion aplica antes  que la suma"
            + " y seria 5 + 6");
        System.out.println("");
        
    boolean b = false; b = !b || 7 % 2 == 1;
    System.out.println("boolean b = false; b = !b || 7 % 2 == 1  -->  " + b );
        System.out.println("Es true porque el simbolo ! hace que b se vuelva true "
                + " y el resultado de 7 % 2 no es igual a 1 y por lo tanto en el operador"
                + " || si el primero es cierto y el segundo false el resultado sera true ");
            System.out.println("");
    }
   
}

