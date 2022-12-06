package polimorfismo;

public class Jefe extends Persona{
    private int id_jefe;
    private String departamento_a_cargo;

    //constructores
    public Jefe(){
    }

    public Jefe(int id, String dni, String nombre, String apellido, String domicilio, String telefono, int id_jefe, String departamento_a_cargo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_jefe = id_jefe;
        this.departamento_a_cargo = departamento_a_cargo;
    }

    //getters and setters

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_a_cargo() {
        return departamento_a_cargo;
    }

    public void setDepartamento_a_cargo(String departamento_a_cargo) {
        this.departamento_a_cargo = departamento_a_cargo;
    }

    //metodos
    public void accion(){
        System.out.println("jefe: supervisando proyecto");
    }

    //toString

    @Override
    public String toString() {
        return super.toString() + "\n" +"Jefe{" +
                "id_jefe=" + id_jefe +
                ", departamento_a_cargo='" + departamento_a_cargo + '\'' +
                '}';
    }
}
