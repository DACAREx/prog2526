package prog.ud5.ejercicios;
public class Ejercicio28 {
    public static void main(String[] args) {
    int num_original = 7;
    int num = 0;
    int i = 0;
    while (num <= 100){
        System.out.println(num_original + " x " + i + " = " + num);
        i += 1;
        num = num_original * i;
    }
   }
}
