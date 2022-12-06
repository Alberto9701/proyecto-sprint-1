package clasesAbstractas;

public abstract class Figura {
    //atributos
    protected double x; //pos x
    protected double y; //pos y

    //constructores que solo pueden ser usadas por sus hijas
    //ya que recordemos que las clases abstractas no se pueden instanciar.
    protected Figura(){
    }
    protected Figura(double x, double y){
        this.x = x;
        this.y=y;
    }

    //metodos abstractos
    public abstract double calcularArea();

}
