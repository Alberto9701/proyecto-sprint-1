package interfaces;

import static java.lang.Math.pow;

public class Cuadrado implements Figura, Dibujable {
    private double lado;

    //constructores
    public Cuadrado(){
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //metodos sobre-escritos por las interfaces

    @Override
    public double calcularArea() {
        return pow(lado,2);
    }

    @Override
    public void dibujar() {
        System.out.println("hola estoy dibujando un cuadrado");
    }
}
