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


//Ejercicio Práctico 50 puntos
//La universidad desea implementar un pequeño sistema para registrar encuestas
//de satisfacción. Cada encuesta debe guardar el nombre de la persona y un
//puntaje del 1 al 5.
//Complete los 3 requerimientos en base al código del archivo:
//https://github.com/facundouferer/CursoDeJava/blob/recuperatorio2025/src/Par
//ciales/Parcial2025/Recuperatorio/Encuestadora.java
//Resolución:
//En la solución debe copiar el programa completo que ha elaborado, indicando
//también el código del archivo Encuestadora.java.
//Es importante que coloque todo el documento aquí y no se debe borrar el código
//que ya se ha desarrollado siendo su código código nuevo.
//Se Solicita:
//1. Desarrolle la clase persona
//2. Desarrolle el método estático registrarEncuesta la cual se debe registrarse con
//los nombres del encuestado en mayúscula.
//3. Desarrolle el método estático mostrarResultados
//Tu respuesta
package Parciales.Parcial2025.Recuperatorio;

import java.util.Scanner;

// 1. Clase Persona (REQUERIMIENTO 1)
class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre.toUpperCase(); // nombre siempre en MAYÚSCULAS
    }

    public String getNombre() {
        return nombre;
    }

    public String mostrarInfo() {
        return "Nombre: " + nombre;
    }
}

// Clase Encuesta ya existente
class Encuesta extends Persona {
    private int puntaje; // 1 a 5

    public Encuesta(String nombre, int puntaje) {
        super(nombre);
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + " - Puntaje: " + puntaje;
    }
}

public class Encuestadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Encuesta[] encuestas = new Encuesta[20];
        int cantidad = 0;
        int opcion;

        do {
            System.out.println("\n===== SISTEMA DE ENCUESTAS =====");
            System.out.println("1. Registrar encuesta");
            System.out.println("2. Ver resultados");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {

                case 1:
                    if (cantidad < encuestas.length) {
                        encuestas[cantidad] = registrarEncuesta(sc); // REQUERIMIENTO 2
                        cantidad++;
                    } else {
                        System.out.println("No hay más espacio disponible.");
                    }
                    break;

                case 2:
                    mostrarResultados(encuestas); // REQUERIMIENTO 3
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        sc.close();
    }

    // 2. Método registrarEncuesta (REQUERIMIENTO 2)
    public static Encuesta registrarEncuesta(Scanner sc) {
        System.out.print("Ingrese nombre del encuestado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese puntaje (1 a 5): ");
        int puntaje = Integer.parseInt(sc.nextLine());

        return new Encuesta(nombre, puntaje);
    }

    // 3. Método mostrarResultados (REQUERIMIENTO 3)
    public static void mostrarResultados(Encuesta[] encuestas) {
        System.out.println("\n=== RESULTADOS DE LAS ENCUESTAS ===");

        for (Encuesta e : encuestas) {
            if (e != null) {
                System.out.println(e.mostrarInfo());
            }
        }
    }
}

