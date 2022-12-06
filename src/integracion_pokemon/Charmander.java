package integracion_pokemon;

public class Charmander extends Pokemon implements IFuego{

    //constructores
    public Charmander() {
    }

    //metodos sobre escritos de la clase abstracta pokemon
    @Override
    protected void placaje() {
        System.out.println("hola soy charmander y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy charmander y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy charmander y este es mi ataque mordisco");
    }

    //metodos sobre escritos de la interfaz IFuego
    @Override
    public void atacarPunioFuego() {
        System.out.println("hola soy charmander y este es mi ataque puño de fuego");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("hola soy charmander y este es mi ataque lanza llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("hola soy charmander y este es mi ataque ascuas");
    }
}
