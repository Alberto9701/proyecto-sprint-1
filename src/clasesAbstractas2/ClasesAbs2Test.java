package clasesAbstractas2;

public class ClasesAbs2Test {
    public static void main(String[] args) {
        //instanciar una clase abstracta es un error
        //DispositivoElectronico disp1 = new DispositivoElectronico();

        Celular cel1 = new Celular();
        cel1.encender();
        cel1.cargar();
        System.out.println("\n");

        Audifonos_bluetooth audis1 = new Audifonos_bluetooth();
        audis1.encender();
        audis1.cargar();
        System.out.println("\n");

        SmartWatch reloj1 = new SmartWatch();
        reloj1.encender();
        reloj1.cargar();
    }
}
