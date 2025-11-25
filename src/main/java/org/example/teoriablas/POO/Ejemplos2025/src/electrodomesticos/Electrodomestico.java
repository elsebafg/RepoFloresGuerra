public class Electrodomestico {

    double precioBase;
    String color = "blanco";
    char consumoEnergetico = 'F';
    double peso;

    enum colores { blanco, negro, rojo, azul , gris};
    enum consumosEnergeticos { A, B, C, D, F; }

    public static final double PRECIO_BASE_DEFAULT = 10000;
    public static final double PESO_BASE_DEFAULT = 5;

    public Electrodomestico(){
        precioBase = PRECIO_BASE_DEFAULT;
        peso = PESO_BASE_DEFAULT;
    }

    public Electrodomestico(double precioBase , double peso){
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase , double peso, String color, char consumoEnergetico){
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public double precioFinal() {
        double precio = 0;
        switch (consumoEnergetico) {
            case A:
                precio+=100;
                break;
            case B:
                precio+=80;
                break;
            default:
                precio = precioBase;
        }

        if(peso < 20){
            precio+=10;
        }else if(peso < 50){
            precio+=50;
        }
        return precio;

    }
}
