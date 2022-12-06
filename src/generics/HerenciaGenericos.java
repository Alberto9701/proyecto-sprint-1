package generics;

public class HerenciaGenericos {
    //para esta ejecucion utilizaremos 4 clases esta, pareja, empleado y jefe

    public static void main(String[] args) {

        //lo siguiente en clases genéricas no se puede realizar
        /*Empleado administrativa = new Empleado("Elena",45,1500);
        Jefe directora = new Jefe("Ana",27,3500);
        Empleado nuevoEmpleado = directora;*/



        Pareja<Empleado> administrativa = new Pareja<Empleado>();
        Pareja<Jefe> directora = new Pareja<Jefe>();
        // Pareja<Empleado> nuevoEmpleado = directora; esta línea nos da un error no existe el principio de herencia (es un)

        Pareja.imprimirTrabajador(administrativa);
        Pareja.imprimirTrabajador(directora);



    }


}
