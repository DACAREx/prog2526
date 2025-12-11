package prog.ud5.ejercicios;
public class Ejercicio30 {
    public static void main(String[] args) {
    System.out.println("Tablas de multiplicar del 0 al 10");
    System.out.println("=================================");
    int a = 0;
    int b = -1;
    int num = 0;
    while (a <= 10){
        b += 1;
        num = (a * b);
        System.out.println("       "+ a + " x " + b + " = " + num);
        if (b == 10){
            b = -1;
            a += 1;
            System.out.println("=================================");;
        }
    }
   }
}
