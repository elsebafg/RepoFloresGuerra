import java.util.Scanner;

public class Main {

    public static void main(String args[]){

        //creamos instancia de persona
       Persona p2 = new Persona("Juan");
       Persona p5 = new Persona("Maria");
       Persona p6 = new Persona("Juana", 16,"45025235" );
       Persona p3 = new Persona("Pedro", 25, "12104603");
       Persona p4 = new Persona("Susana", "12104603");

       Cuenta c1 = new Cuenta(p2);

    }
}
