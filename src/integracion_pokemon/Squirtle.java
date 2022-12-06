package integracion_pokemon;

public class Squirtle extends Pokemon implements IAgua{

    //constructores
    public Squirtle() {
    }

    //metodos de la clase abstracta Pokemon
    @Override
    protected void placaje() {
        System.out.println("hola soy squirtle y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("hola soy squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("hola soy squirtle y este es mi ataque mordisco");
    }

    //metodos de la interfaz IAgua
    @Override
    public void atacarHidrobomba() {
        System.out.println("hola soy squirtle y este es mi ataque hidro bomba");
    }

    @Override
    public void atacrBurbuja() {
        System.out.println("hola soy squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("hola soy squirtle y este es mi ataque pistola de agua");
    }
}
