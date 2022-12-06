package collections;

import java.util.*;


public class DifArrayListyLinked {
    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<Persona>();
        //agregar personas al final de la lista
        lista.add(new Persona(1,"Alberto",20));
        lista.add(new Persona(2,"jose",30));
        lista.add(new Persona(3,"miguel",40));
        lista.add(new Persona(4,"Juan",50));

        LinkedList<Persona> listaEnlazada = new LinkedList<>();
        //agregar personas al final de la lista
        listaEnlazada.add(new Persona(1,"Mike",50));
        listaEnlazada.add(new Persona(2,"jesse",22));
        listaEnlazada.add(new Persona(3,"Walter",48));
        listaEnlazada.add(new Persona(4,"gustavo",50));


        //método remove en arraylist
        lista.remove(1);

        //método remove en linkedlist
        String nombreBorrar = "Walter";
        for(Persona p1:listaEnlazada){
            if(p1.getNombre().equals(nombreBorrar)){
                listaEnlazada.remove(p1);
                break;
            }
        }

        //impresion despues de eliminar
        for(Persona p1:lista){
            System.out.println(p1.getNombre());
        }
        System.out.println("-----------------------");
        for(Persona p1:listaEnlazada){
            System.out.println(p1.getNombre());
        }

        //método para el tamaño de la lista
        System.out.println("\n---¿Qué tamaño tienen las listas?");
        System.out.println("ArrayList: " + lista.size());
        System.out.println("LinkedList: " + listaEnlazada.size());

        //obtener el primer y último elemento, solo en linked list
        System.out.println("\n-------Primer y último elemento de la lista enlazada");
        System.out.println(((LinkedList<Persona>) listaEnlazada).getFirst().getNombre());
        System.out.println(((LinkedList<Persona>) listaEnlazada).getLast().getNombre());


        //borrar toda la lista
        System.out.println("------------borrando listas");
        lista.clear();
        listaEnlazada.clear();

        //comprobar si esta vacia
        System.out.println("---------comprobando si esta vacia");
        System.out.println("La Arraylist esta vacia?: " + lista.isEmpty());
        System.out.println("la linked list esa vacia?: " + listaEnlazada.isEmpty());

    }


}
