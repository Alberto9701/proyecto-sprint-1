package integracion_pokemon;

public abstract class Pokemon {
    protected int numPokedex;
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;


    //metodos
    protected abstract void placaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}
