package clasesAbstractas;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo extends Figura{
    private double radio;
    //constructores
    public Circulo(){
    }
    public Circulo(double radio,double x,double y){
        super(x,y);
        this.radio=radio;
    }

    //este concepto es la sobreescritura de métodos
    @Override
    public double calcularArea() {
        double resultado = PI * pow(radio, 2);
        return resultado;
    }
}
