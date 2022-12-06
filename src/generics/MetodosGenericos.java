package generics;
import java.util.*;

public class MetodosGenericos {

    public static void main(String[] args) {
        String nombres[] = {"Maria","Jose","Juan","Mike"};
        /*String elementos = MisMatrices.getElementos(nombres);
        System.out.println(elementos);*/

        /*Persona personas[] = {new Persona("Alberto"),new Persona("Miguel"),new Persona("Jose")};
        System.out.println(MisMatrices.getElementos(personas));*/

        //usando el método getMenor
        System.out.println(MisMatrices.getMenor(nombres));

        //ahora un ejemplo con GregorianCalendar
        GregorianCalendar fechas[]= {new GregorianCalendar(2015,05,12),new GregorianCalendar(2015,04,11)};
        System.out.println(MisMatrices.getMenor(fechas));


    }


}

//esta clase tiene un método genérico
class MisMatrices{
    //se usa static para decir que es un método de clase, es decir que no necesitamos
    //un objeto o una instacia para mandar a llamar al método
    /*public static <T> String getElementos(T[] a){
        return "El array tiene " + a.length + " elementos";
    }*/
    public static <T extends Comparable> T getMenor(T[] a){
        if(a==null || a.length==0){
            return null;
        }

        T elementoMenor = a[0];

        for(int i=1;i<a.length;i++){
            if(elementoMenor.compareTo(a[i])>0){
                elementoMenor=a[i];
            }
        }
        return elementoMenor;

    }

}
