package clasesAbstractas;

public class Cuadrado extends Figura {
    private double lado;

    //metodos constructores
    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    //este concepto es la sobreescritura de métodos
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
