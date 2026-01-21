
package prog.ud5.ejercicios;
public class Ejercicio5 {
    public static void main(String[] args) {
        short limite = 32767;
        System.out.println("original" + limite);
        limite += 1;
        System.out.println("al sumar 1:      " + limite);
        limite -= 2;
        System.out.println("al restar 1:     " + limite);
    }
}
