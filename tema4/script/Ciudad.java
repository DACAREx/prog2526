package prog.ud4.ejercicios;

public class Ciudad {

    public static void main(String[] args) {

        Persona juan = new Persona(
                "Juan", 
                20, 
                1.90f, 
                DiaDeLaSemana.LUNES, 
                Sexo.HOMBRE
        );

        Persona david = new Persona(
                "David", 
                21, 
                1.80f, 
                DiaDeLaSemana.SABADO, 
                Sexo.HOMBRE
        );

        Persona lucia = new Persona(
                "Lucia", 
                21, 
                1.48f, 
                DiaDeLaSemana.VIERNES, 
                Sexo.MUJER
        );

        System.out.println("Hola soy " + juan.nombre + " y tengo " + juan.edad + " años y hoy es " + juan.dia);
        System.out.println("Hola soy " + david.nombre + " y tengo " + david.edad + " años y hoy es " + david.dia);
        System.out.println("Hola soy " + lucia.nombre + " y tengo " + lucia.edad + " años y hoy es " + lucia.dia);
    }
}
