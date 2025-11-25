public class Limpieza extends Empleado {
     char turno;

    public final char TURNO_DEFAULT = 'm';


    public Limpieza(String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        turno = TURNO_DEFAULT;
    }

    public Limpieza(String nombre, String apellido) {
        super(nombre, apellido);
    }
    public Limpieza(String nombre, String apellido, String dni, char turno) {
        super(nombre, apellido, dni);
        comprobarTurno(turno);
    }

    private void comprobarTurno(char turno) {
        if(turno != TURNO_DEFAULT && turno != 'n'){
            this.turno = TURNO_DEFAULT;
        }else{
            this.turno = turno;
        }
    }

    //sobrescribir metodo sueldo si el tuerno es n sueldo mas 10-%
}
