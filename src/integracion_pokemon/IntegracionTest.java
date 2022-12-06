package integracion_pokemon;

public class IntegracionTest {
    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        //probando ataques de squirtle
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        //probando ataques de charmander
        charmander.atacarAraniazo();
        charmander.atacarLanzaLlamas();
        //probando ataques de bulbasaur
        bulbasaur.atacarAraniazo();;
        bulbasaur.atacarDrenaje();
        //probando ataques de pikachu
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
    }
}
