package collections;

import java.util.*;

public class Stacks {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<Integer>();
        List<Float> flotantes = new ArrayList<Float>();


        System.out.println("Pila vacia: " + pila);
        System.out.println("Esta vacia?: " + pila.isEmpty());

        //agregar elemento a la pila
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        //recorrido
        for(Integer pilita:pila){
            System.out.println(pilita);
        }

        //mostrar
        System.out.println("Pila: " + pila);
        System.out.println("Pila vacia?: " +pila.isEmpty());

        pila.pop(); //eliminar el último registro que entró
        System.out.println("Esta el 3?: " + pila.search(3));
        System.out.println("Último agregado: " + pila.peek());

    }
}
