package generics;

public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //metodos
    public String damDatos(){
        return "El empleado se llama " + this.nombre + ". Tiene " + this.edad + " años. " + "Y tiene un salario de " + this.salario;
    }
}
