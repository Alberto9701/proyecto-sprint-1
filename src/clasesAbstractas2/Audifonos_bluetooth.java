package clasesAbstractas2;

public class Audifonos_bluetooth extends DispositivoElectronico{
    private float decibelios;
    private boolean cancelacion_ruido;
    private boolean resistente_al_agua;

    //constructores
    public Audifonos_bluetooth(){
    }

    public Audifonos_bluetooth(String marca, int miliAmperes, double alto, double ancho, float decibelios, boolean cancelacion_ruido, boolean resistente_al_agua) {
        super(marca, miliAmperes, alto, ancho);
        this.decibelios = decibelios;
        this.cancelacion_ruido = cancelacion_ruido;
        this.resistente_al_agua = resistente_al_agua;
    }

    //getters and setters

    public float getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(float decibelios) {
        this.decibelios = decibelios;
    }

    public boolean isCancelacion_ruido() {
        return cancelacion_ruido;
    }

    public void setCancelacion_ruido(boolean cancelacion_ruido) {
        this.cancelacion_ruido = cancelacion_ruido;
    }

    public boolean isResistente_al_agua() {
        return resistente_al_agua;
    }

    public void setResistente_al_agua(boolean resistente_al_agua) {
        this.resistente_al_agua = resistente_al_agua;
    }

    //metodos abstractos sobre-escritos
    @Override
    public void encender() {
        System.out.println("Audifonos bluetooth encendidos");
    }

    @Override
    public void cargar() {
        System.out.println("audifonos recargando batería");
    }

}
