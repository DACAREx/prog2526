package prog.ud5.ejercicios;

public class Ejercicio1_ampliacion {

    public static void main(String[] args) {

        int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0;
        int temp6 = 0, temp7 = 0, temp8 = 0, temp9 = 0, temp10 = 0;
        int temp11 = 0, temp12 = 0, temp13 = 0;

        int i = 0;
        while (i < 13) {

            int a = (int) (Math.random() * 13) + 1;
            i++;

            switch (a) {
                case 1 -> {
                    temp1++;
                    System.out.println("Raul Perez Aguilar ha salido " + temp1 + " veces");
                }
                case 2 -> {
                    temp2++;
                    System.out.println("David Carrero Jimenez ha salido " + temp2 + " veces");
                }
                case 3 -> {
                    temp3++;
                    System.out.println("Alejandro Peralta Oliva ha salido " + temp3 + " veces");
                }
                case 4 -> {
                    temp4++;
                    System.out.println("David Carrero Real ha salido " + temp4 + " veces");
                }
                case 5 -> {
                    temp5++;
                    System.out.println("Antonio Hernandez Gilabert ha salido " + temp5 + " veces");
                }
                case 6 -> {
                    temp6++;
                    System.out.println("Daniel Copete Jimenez ha salido " + temp6 + " veces");
                }
                case 7 -> {
                    temp7++;
                    System.out.println("Adrian Campos Espejo ha salido " + temp7 + " veces");
                }
                case 8 -> {
                    temp8++;
                    System.out.println("Raul Bueno Garcia ha salido " + temp8 + " veces");
                }
                case 9 -> {
                    temp9++;
                    System.out.println("Aday Trandafir Garcia ha salido " + temp9 + " veces");
                }
                case 10 -> {
                    temp10++;
                    System.out.println("Daniel Pino Gomez ha salido " + temp10 + " veces");
                }
                case 11 -> {
                    temp11++;
                    System.out.println("Oscar Amaya Cortes ha salido " + temp11 + " veces");
                }
                case 12 -> {
                    temp12++;
                    System.out.println("Jhonal Jesus Roca Hernandez ha salido " + temp12 + " veces");
                }
                case 13 -> {
                    temp13++;
                    System.out.println("Jose Antonio Marchante Marchante ha salido " + temp13 + " veces");
                }
            }
        }
    }
}
