package integracion_pokemon;

public class Bulbasaur extends Pokemon implements IPlanta {

    //constructores
    public Bulbasaur() {
    }

    //metodos abstractos de la clase abstracta Pokemon
    @Override
    protected void placaje() {
        System.out.println("hola soy bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola suy bulbasaur y este es mi ataque mordisco");
    }

    //metodos abstractos de la interfaz IPlanta
    @Override
    public void atacarDrenaje() {
        System.out.println("hola soy bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("hola soy bulbasaur y este es mi ataque paralizar");
    }


}
