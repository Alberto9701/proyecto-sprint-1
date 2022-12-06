package integracion_pokemon;

public class Pikachu extends Pokemon implements IElectrico{

    //constructores
    public Pikachu(){
    }

    //metodos abstractos de la clase abstracta Pokemon
    @Override
    protected void placaje() {
        System.out.println("hola soy pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy pikachu y este es mi ataque mordisco");
    }

    //metodos abstractos de la interfaz IElectrico
    @Override
    public void atacarImpactrueno() {
        System.out.println("hola soy pikachu y este es mi ataque impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("hola soy pikachu y este es mi ataque trueno");
    }
}
