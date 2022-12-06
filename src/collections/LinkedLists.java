package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Persona> listaEnlazada = new LinkedList<Persona>();

        //agregar personas al final de la lista
        listaEnlazada.add(new Persona(1,"Mike",50));
        listaEnlazada.add(new Persona(2,"jesse",22));
        listaEnlazada.add(new Persona(3,"Walter",48));
        listaEnlazada.add(new Persona(4,"gustavo",50));

        //agregar personal al principio de la lista
        listaEnlazada.add(0,new Persona(5,"Finn",18));

        System.out.println("----------");
        for(Persona p1: listaEnlazada){
            System.out.println(p1.getNombre());
        }

    }
}
