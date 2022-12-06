package generics;

public class Pareja<T> {
    private T primero;

    //constructores
    public Pareja(){
        primero=null;
    }
    //setter
    public void setPrimero(T nuevoValor){
        this.primero=nuevoValor;
    }
    //getter
    public T getPrimero(){
        return this.primero;
    }

    //creamos un método para recibir un empleado
    //este método pertenece a la parte de herencia genérica
    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        Empleado primero= p.getPrimero();
        System.out.println(primero);
    }


}
