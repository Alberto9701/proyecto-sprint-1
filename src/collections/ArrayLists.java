package collections;


import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();

        //agregar personas al final de la lista
        lista.add(new Persona(1,"Alberto",20));
        lista.add(new Persona(2,"jose",30));
        lista.add(new Persona(3,"miguel",40));
        lista.add(new Persona(4,"Juan",50));

        for(Persona p1:lista){
            System.out.println(p1.getNombre());
        }
        lista.remove(2);
        System.out.println("------------");
        for(Persona p1:lista){
            System.out.println(p1.getNombre());
        }

    }
}
