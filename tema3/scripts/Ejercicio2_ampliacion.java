public class Ejercicio2_ampliacion {

    public static void main(String[] args) {

        String[] nombres = {
            "Raul Perez Aguilar",
            "David Carrero Jimenez",
            "Alejandro Peralta Oliva",
            "David Carrero Real",
            "Antonio Hernandez Gilabert",
            "Daniel Copete Jimenez",
            "Adrian Campos Espejo",
            "Raul Bueno Garcia",
            "Aday Trandafir Garcia",
            "Daniel Pino Gomez",
            "Oscar Amaya Cortes",
            "Jhonal Jesus Roca Hernandez",
            "Jose Antonio Marchante Marchante"
        };
        boolean[] salio = new boolean[nombres.length]; 
        int i = 0;
        while (i < nombres.length) {
            int a = (int) (Math.random() * nombres.length);
            if (!salio[a]) {             
                salio[a] = true;          
                if (i < nombres.length / 2) {
                    System.out.println("Equipo 1: " + nombres[a]);
                } else {
                    System.out.println("Equipo 2: " + nombres[a]);
                }
                i += 1;
            }
        }
    }
}
