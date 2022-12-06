package lambda;

@FunctionalInterface
public interface ICalculadora {
    //recordemos que en las interfaces funcionales solo debemos tener un método
    //public void mensaje(String nombre);

    public void operacion(double a, double b);
}
