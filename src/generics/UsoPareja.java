package generics;

public class UsoPareja {
    public static void main(String[] args) {

        Pareja<String> uno = new Pareja<String>(); //primero=null
        uno.setPrimero("Juan");
        System.out.println(uno.getPrimero());

        Persona pers1=new Persona("Ana");
        Pareja<Persona> personas = new Pareja<Persona>();
        personas.setPrimero(pers1);
        System.out.println(personas.getPrimero());


    }
}

class Persona{
    private String nombre;
    //constructor
    public Persona(String nombre){
        this.nombre=nombre;
    }

    //tostring


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
