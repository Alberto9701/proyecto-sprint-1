package polimorfismo;

public class Empleado extends Persona{
    private int num_empleado;
    private String cargo;
    private double sueldo;

    //constructores
    public Empleado(){
    }

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int num_empleado, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.num_empleado = num_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    //getters and setters

    public int getNum_empleado() {
        return num_empleado;
    }

    public void setNum_empleado(int num_empleado) {
        this.num_empleado = num_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //metodos
    public void accion(){
        System.out.println("empleado: realizando tarea encomendada");
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "\n" + "Empleado{" +
                "num_empleado=" + num_empleado +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
