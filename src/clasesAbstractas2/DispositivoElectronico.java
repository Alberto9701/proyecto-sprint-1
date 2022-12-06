package clasesAbstractas2;

public abstract class DispositivoElectronico {
    protected String marca;
    protected int miliAmperes;
    protected double alto;
    protected double ancho;

    //constructores solo para clases hijas
    protected DispositivoElectronico(){
    }
    protected DispositivoElectronico(String marca,int miliAmperes,double alto,double ancho){
        this.marca=marca;
        this.miliAmperes=miliAmperes;
        this.alto=alto;
        this.ancho=ancho;
    }
    //metodos abstractos
    public abstract void encender();
    public abstract void cargar();
}
