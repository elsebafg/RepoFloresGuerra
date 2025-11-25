public class Lavarropas extends Electrodomestico {

    private int carga;

    public static int CARGA_DEFAULT = 5;

    public Lavarropas() {
        carga = CARGA_DEFAULT;
    }

    public Lavarropas(int carga) {
        this.carga = carga;
    }

    public Lavarropas(double precioBase, double peso, String color, char consumoEnergetico, int carga) {
        super(precioBase, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if(carga > 30) {
            precio+= 50;
        }
        return precio;
    }
}
