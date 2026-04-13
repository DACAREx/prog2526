package progud8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] datos = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        ArrayList<Double> notas = new ArrayList<>();

        for (String d : datos) {
            notas.add(Double.parseDouble(d));
        }

        double suma = 0;
        for (double n : notas) {
            suma += n;
        }

        double media = suma / notas.size();

        ArrayList<Double> aprobados = new ArrayList<>();
        for (double n : notas) {
            if (n >= 5) {
                aprobados.add(n);
            }
        }

        System.out.println(notas);
        System.out.println(media);
        System.out.println(aprobados);
    }
}