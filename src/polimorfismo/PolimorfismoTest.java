package polimorfismo;

import java.util.ArrayList;

public class PolimorfismoTest {
    public static void main(String[] args) {
        /*
        esto arroja un error
        String vector[] = new String[3];
        vector[0] = 1;
        */

        //sin embargo con el polimorfirsmo podemos combinar
        //las distintas clases en un vector
        Persona vector[] = new Persona[4];
        vector[0] = new Persona();
        vector[1] = new Empleado();
        vector[2] = new Consultor();
        vector[3] = new Jefe();

        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona());
        personas.add(new Empleado());
        personas.add(new Jefe());
        personas.add(new Consultor());

        //recorriendo arraylist de Personas con foreach
        for(Persona p1:personas){
            p1.accion(); //llamando al metodo accion el cual se comportará distinto dependiendo de la clase del objeto
        }

    }
}
