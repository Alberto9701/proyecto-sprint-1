package clasesAbstractas2;

public class SmartWatch extends DispositivoElectronico{
    private int horas;
    private int minutos;
    private int segundos;

    //constructor
    public SmartWatch(){
    }

    public SmartWatch(String marca, int miliAmperes, double alto, double ancho, int horas, int minutos, int segundos) {
        super(marca, miliAmperes, alto, ancho);
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    //getters and setters
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //metodos sobre-escritos de la clase abstracta
    @Override
    public void encender() {
        System.out.println("reloj inteligente encendido");
    }

    @Override
    public void cargar() {
        System.out.println("cargando reloj inteligente");
    }
}
