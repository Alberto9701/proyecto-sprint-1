package clasesAbstractas2;

public class Celular extends DispositivoElectronico{
    private int gb;
    private int ram;
    private int mgpx;
    //constructores
    public Celular(){
    }

    public Celular(String marca, int miliAmperes, double alto, double ancho, int gb, int ram, int mgpx) {
        super(marca, miliAmperes, alto, ancho);
        this.gb = gb;
        this.ram = ram;
        this.mgpx = mgpx;
    }
    //getters and setters
    public int getGb() {
        return gb;
    }

    public void setGb(int gb) {
        this.gb = gb;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMgpx() {
        return mgpx;
    }

    public void setMgpx(int mgpx) {
        this.mgpx = mgpx;
    }

    //metodos sobre-escritos de nuestra clase abstracta
    @Override
    public void encender() {
        System.out.println("iniciando sistema operativo del smartphone");
    }

    @Override
    public void cargar() {
        System.out.println("cargando celular");
    }
}
