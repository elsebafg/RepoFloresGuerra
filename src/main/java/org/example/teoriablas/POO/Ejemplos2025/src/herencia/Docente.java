public class Docente extends Empleado {
    private int cantHoras;
    private String cargo;

    public Docente(String nombre, String apellido, String dni) {
       super(nombre, apellido, dni);
    }

    public Docente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Docente(String nombre, String apellido, String dni, int cantHoras) {
        super(nombre, apellido, dni);
        this.cantHoras = cantHoras;
    }

    @Override
    public double sueldo(){
        double sueldoBase = super.sueldo();
        if (hoursOverflow()){
            return sueldoBase+= sueldoBase*1.1;
        }
        return sueldoBase+=sueldoBase*1.05;
    }

    public double sueldo(double incremento){
        return this.sueldo() + incremento;
    }

    public int getCantHoras() {
       return cantHoras;
    }

    public boolean hoursOverflow(){
        if (cantHoras > 50){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Docente{" +
                "cantHoras=" + cantHoras +
                ", cargo='" + cargo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
