package funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Miguel","Gomez",18),
                new Persona("Eduardo","Rodriguez",15),
                new Persona("Jorge","Martinez",20),
                new Persona("Emilio","Marquez",25),
                new Persona("Juan","Galbes",30),
                new Persona("Alexander","Villeda",28),
                new Persona("Carlos","Miranda",32),
                new Persona("Mariana","Mejia",17)
        );
        System.out.println("-----------------");
        System.out.println("Contar personas con edades>=20 años en programación imperativa estructurada");
        int contadorPersonas=0;
        for(Persona p1:personas){
            if(p1.getEdad()>=20){
                System.out.println(p1);
                contadorPersonas++;
            }
        }
        System.out.println("Numero de personas: " + contadorPersonas);

        System.out.println("----------------");
        System.out.println("Contar Personas con edades>=20 años en programación declarativa funcional");
        int contadorPersonas2= (int) personas.stream().filter( (p)->p.getEdad()>=20 ).peek(System.out::println).count();
        System.out.println("Numero de personas: " + contadorPersonas2);

    }



}
