package prog.ud5.ejercicios;
public class Ejercicio9 {
    public static void main(String[] args) {
        boolean comprobar1 = 3 <= 5 && 2 == 2;
        System.out.println("3 <= 5 && 2 == 2  -->  " + comprobar1 );
        boolean comprobar2 = 3 <= 5 && 2 > 10;
        System.out.println("3 <= 5 && 2 > 10  -->  " + comprobar2 );
        boolean comprobar3 = 1 != 2 || 5 < 3;
        System.out.println("1 != 2 || 5 < 3  -->  " + comprobar3 );
        boolean comprobar4 = !(1 < 2);
        System.out.println("!(1 < 2)  -->  " + comprobar4 );
    }
}
