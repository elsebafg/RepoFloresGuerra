import javax.print.Doc;

public class Main {

    public static void main(String[] args) {


        Empleado[] empleados = new Empleado[3];

        empleados[0] = new Docente("Juan", "Garcia", "12104603", 30);
        empleados[1] = new Limpieza("Juan", "Perez", "12104608", 'n');
        empleados[2] = new Docente("Juan", "Garcia", "12104609",60);

        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].sueldo());
        }

        Docente e2 = new Docente("Juan", "Garcia", "12104603", 30);
        System.out.println(e2);

    }
}
