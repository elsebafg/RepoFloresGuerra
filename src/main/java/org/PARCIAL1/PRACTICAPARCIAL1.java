package org.PARCIAL1;

//En base al programa que se encuentra en el repositorio https://github.com/facundouferer/CursoDeJava/blob/master/src/Practica/Practica06.java
//
//Desarrolla una función que permita registrar un docente. El programa debe solicitar al usuario el nombre, apellido, DNI y la cantidad de materias que dicta, para luego pedir el nombre de cada materia. Finalmente debe devolver un objeto Docentes con esas materias asignadas.
public static Docentes registrarDocente(Scanner sc) {
    System.out.print("Nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Apellido: ");
    String apellido = sc.nextLine();

    System.out.print("DNI: ");
    int dni = Integer.parseInt(sc.nextLine());

    System.out.print("Cantidad de materias: ");
    int cant = Integer.parseInt(sc.nextLine());

    Materia[] materias = new Materia[cant];

    for (int i = 0; i < cant; i++) {
        System.out.print("Nombre de la materia " + (i + 1) + ": ");
        String nomMat = sc.nextLine();
        materias[i] = new Materia(nomMat);
    }

    return new Docentes(nombre, apellido, dni, materias);
}


//En base al programa que se encuentra en el repositorio https://github.com/facundouferer/CursoDeJava/blob/master/src/Practica/Practica06.java
//
//Desarrolla una función que reciba un objeto que implemente la interfaz InformeDeDatos y muestre en pantalla el informe generado. Además, si se trata de un docente, también deben mostrarse todas las materias que dicta.
public interface InformeDeDatos {
    String generarInforme();
}

class Estudiantes extends Persona implements InformeDeDatos {
    private String carrera;

    public Estudiantes(String nombre, String apellido, int dni, String carrera) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
    }

    public Estudiantes(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.carrera = "Sin definir";
    }

    @Override
    public String generarInforme() {
        return super.toString() + "\nCarrera: " + this.carrera;
    }
}

class Docentes extends Persona implements InformeDeDatos {
    private Materia[] materias;

    public Docentes(String nombre, String apellido, int dni, Materia[] materias) {
        super(nombre, apellido, dni);
        this.materias = materias;
    }

    @Override
    public String generarInforme() {
        String info = super.toString() + "\nMaterias:";
        for (Materia m : materias) {
            info += "\n- " + m.toString();
        }
        return info;
    }
}
/// ESTO DE ACA ABAJO ES LO QUE PIDE EL PARCIAL, ES SOLO LA FUNCION (ASEGURARSE)
public static void mostrarInforme(InformeDeDatos obj) {
    System.out.println(obj.generarInforme());
}



//En base al programa que se encuentra en el repositorio https://github.com/facundouferer/CursoDeJava/blob/master/src/Practica/Practica06.java
//
//Desarrolla una función que reciba un arreglo de estudiantes y muestre en pantalla los datos de cada uno. En caso de que existan posiciones vacías en el arreglo, estas no deben mostrarse.
public static void mostrarEstudiantes(Estudiantes[] lista) {
    for (int i = 0; i < lista.length; i++) {
        if (lista[i] != null) {
            System.out.println(lista[i].toString());
        }
    }
}



//En base al programa que se encuentra en el repositorio https://github.com/facundouferer/CursoDeJava/blob/master/src/Practica/Practica06.java
//
//Desarrolla una función que implemente un menú principal con distintas opciones (por ejemplo: registrar estudiante, registrar docente, mostrar informe, salir). El menú debe permitir al usuario ejecutar varias acciones hasta que elija salir del programa.
// En base al programa original del profesor

interface InformeDeDatos {
    String generarInforme();
}

class Persona {
    private String nombre, apellido;
    private int dni;

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "- " + apellido + ", " + nombre + " (DNI: " + dni + ")";
    }
}

class Estudiantes extends Persona implements InformeDeDatos {
    private String carrera;

    public Estudiantes(String nombre, String apellido, int dni, String carrera) {
        super(nombre, apellido, dni);
        this.carrera = carrera;
    }

    public Estudiantes(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
        this.carrera = "Sin definir";
    }

    @Override
    public String generarInforme() {
        return super.toString() + "\nCarrera: " + carrera;
    }
}

class Materia {
    private String nombre;

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

class Docentes extends Persona implements InformeDeDatos {
    private Materia[] materias;

    public Docentes(String nombre, String apellido, int dni, Materia[] materias) {
        super(nombre, apellido, dni);
        this.materias = materias;
    }

    @Override
    public String generarInforme() {
        String info = super.toString() + "\nMaterias:";
        for (Materia m : materias) {
            info += "\n- " + m.toString();
        }
        return info;
    }
}

public class Practica06 {

    public static void main(String[] args) {
        menuPrincipal();
    }

    // ============================
    // REGISTRAR ESTUDIANTE
    // ============================
    public static Estudiantes registrarEstudiante(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("DNI: ");
        int dni = Integer.parseInt(sc.nextLine());

        System.out.print("Carrera: ");
        String carrera = sc.nextLine();

        return new Estudiantes(nombre, apellido, dni, carrera);
    }

    // ============================
    // REGISTRAR DOCENTE
    // ============================
    public static Docentes registrarDocente(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("DNI: ");
        int dni = Integer.parseInt(sc.nextLine());

        System.out.print("Cantidad de materias: ");
        int cant = Integer.parseInt(sc.nextLine());

        Materia[] materias = new Materia[cant];

        for (int i = 0; i < cant; i++) {
            System.out.print("Nombre de la materia " + (i + 1) + ": ");
            String nomMat = sc.nextLine();
            materias[i] = new Materia(nomMat);
        }

        return new Docentes(nombre, apellido, dni, materias);
    }

    // ============================
    // MOSTRAR INFORME
    // ============================
    public static void mostrarInforme(InformeDeDatos obj) {
        System.out.println(obj.generarInforme());
    }

    // ============================
    // MENU PRINCIPAL (LO QUE PIDIO LA CONSIGNA)
    // ============================
    public static void menuPrincipal() {
        Scanner sc = new Scanner(System.in);

        Estudiantes[] estudiantes = new Estudiantes[20];
        Docentes[] docentes = new Docentes[20];
        int indiceEst = 0;
        int indiceDoc = 0;

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar docente");
            System.out.println("3. Mostrar informe");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    if (indiceEst < estudiantes.length) {
                        estudiantes[indiceEst] = registrarEstudiante(sc);
                        indiceEst++;
                    } else {
                        System.out.println("No hay mas espacio disponible.");
                    }
                    break;

                case 2:
                    if (indiceDoc < docentes.length) {
                        docentes[indiceDoc] = registrarDocente(sc);
                        indiceDoc++;
                    } else {
                        System.out.println("No hay mas espacio disponible.");
                    }
                    break;

                case 3:
                    System.out.println("=== INFORMES ===");
                    for (Estudiantes e : estudiantes) {
                        if (e != null) {
                            mostrarInforme(e);
                            System.out.println();
                        }
                    }
                    for (Docentes d : docentes) {
                        if (d != null) {
                            mostrarInforme(d);
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida.");
                    break;
            }

            System.out.println();
        }
    }
}
