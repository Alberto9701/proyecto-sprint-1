package interfaces;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radio;

    //constructores
    public Circulo(){
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    //metodos sobre-escritos por las interfaces

    @Override
    public double calcularArea() {
        return PI * pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando un circulo");
    }

    @Override
    public void rotar() {
        System.out.println("hola estoy rotando un circulo");
    }
}
