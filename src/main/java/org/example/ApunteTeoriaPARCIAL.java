package org.example;

public class ApunteTeoriaPARCIAL {
    //2. import java.util.*;
    //3. class Cereal { }
    //4. public class Flakes extends Cereal {
    //5.     public static void main(String[] args) {
    //6.         List<Cereal> c0 = new ListFlakes<>();
    //7.         List<Cereal> c1 = new ArrayList<Cereal>();
    //8.         List<Cereal> c2 = new ArrayList<>();
    //9.         List<Flakes> c3 = new ArrayList<Cereal>();
    //10.        List<Object> c4 = new ArrayList<Flakes>();
    //11.        ArrayList<Cereal> c5 = new ArrayList<Flakes>();
    //12.     }
    //13. }
    //Opciones:
    //
    //☐ Compilación falla debido a error en línea 6 SELECCIONAR.
    //
    //☐ Compilación falla debido a error en línea 7.
    //
    //☐ Compilación falla debido a error en línea 8.
    //
    //☐ Compilación falla debido a error en línea 9 SELECCIONAR.
    //
    //☐ Compilación falla debido a error en línea 10 SELECCIONAR.
    //
    //☑ Compilación falla debido a error en línea 11. (seleccionada)


    
    //Pregunta:
    //
    //¿Qué hace el método void close() de la clase BufferedWriter?
    //
    //[✔] Cierra el flujo de escritura y cierra el archivo.
    //[ ] Vuelca el contenido del Buffer al archivo.
    //[ ] Escribe un salto de línea en el archivo.


    //Dada la imagen adjunta, seleccione la afirmación INCORRECTA.
    //
    //a. Únicamente las clases que implementan la interfaz List permiten el uso de iteradores.
    //b. Un iterador es un objeto que proporciona funcionalidad para recorrer todos los elementos de una colección.
    //c. Un iterador permite recorrer cualquier tipo de colección hacia adelante utilizando el método next() combinado con el método hasNext() para comprobar si se ha alcanzado el final de la colección.
    //d. Una colección puede recorrerse tanto con un iterador como con un ciclo for-each. Ambas formas son equivalentes.
    //
    //Respuesta correcta (INCORRECTA):
    //
    //[✔] a
    //[ ] b
    //[ ] c
    //[ ] d


    //¿Qué hace el método void flush() de la Clase BufferedWriter?
    //[ ] Cierra el flujo de escritura y cierra el archivo.
    //[✔] Vuelca el contenido del Buffer al archivo.
    //[ ] Escribe un salto de línea en el archivo.



    //Dado el código adjunto, ¿cuál sería el resultado?
    //
    //Código:
    //
    //3. public static void main(String[] args) {
    //4.     try {
    //5.         throw new Error();
    //6.     }
    //7.     catch (Error e) {
    //8.         try { throw new RuntimeException(); }
    //9.         catch (Throwable t) { }
    //10.    }
    //11.    System.out.println("phew");
    //12. }
    //
    //
    //Opciones:
    //
    //[✔] "phew"
    //[ ] No se genera salida.
    //[ ] Compilación falla en línea 5.
    //[ ] Compilación falla en línea 7.
    //[ ] Compilación falla en línea 8.
    //[ ] Compilación falla en línea 9.


    //¿Cuál de las siguientes es una característica de java.lang.Exception?
    //
    //Opciones:
    //
    //[ ] private
    //[✔] extends Throwable
    //[ ] implements Throwable
    //[ ] final
    //[ ] implements Externalizable

    //Seleccione según imagen adjunta, la opción CORRECTA.
    //
    //Pregunta: En la definición de una interface en Java:
    //
    //a. Es necesaria emplear la palabra clave abstract.
    //b. La signatura de los métodos de una interfaz tienen visibilidad public o private, pero no protected.
    //c. No se permiten campos constantes.
    //d. Aunque no se indique usando la palabra clave final, todos los campos son tratados como si así fuesen.
    //
    //
    //Opciones:
    //
    //[ ] a
    //[ ] b
    //[ ] c
    //[✔] d

    //¿Qué hace el método void write(int c) de la Clase BufferedWriter?
    //
    //Opciones:
    //
    //[ ] Escribe una porción de un Array en el archivo.
    //[✔] Escribe un carácter en el archivo.
    //[ ] Escribe una porción de una cadena de caracteres en el archivo.

//Consigna (tal como aparece en el examen):
//
//Pregunta:
//Indique cuál de las siguientes definiciones de un método m, que lanza IOException, y que devuelve void, es correcta:
//
//a. void m{} throws IOException {}
//b. void m() throw IOException {}
//c. void m(void) throws IOException {}
//d. void m() throws IOException {}
//
//✅ Respuesta correcta:
//✔ d. void m() throws IOException {}


    //📘 Consigna completa:
    //
    //Elija la opción correcta a la pregunta:
    //“¿A qué clase pertenece la definición: ‘Los caracteres escritos se transforman previamente en bytes’?”
    //
    //Opciones:
    //
    //OutputStreamWriter
    //
    //InputStreamReader
    //
    //PublicStreamReader
    //
    //✅ Respuesta correcta:
    //✔ OutputStreamWriter

    //📘 Consigna completa:
    //
    //Dado el código en imagen adjunta, cuál sería su salida por consola?
    //
    //public class test {
    //    public static void main(String args[]) {
    //        int i = 1, j = 1;
    //        try {
    //            i++;
    //            j++;
    //            i += j;
    //            if(i == 5)
    //                i++;
    //        }
    //        catch(ArithmeticException e) {
    //            System.out.print(0);
    //        }
    //        catch(ArrayIndexOutOfBoundsException e) {
    //            System.out.print(1);
    //        }
    //        catch(Exception e) {
    //            System.out.print(2);
    //        }
    //        finally {
    //            System.out.print(3);
    //        }
    //        System.out.print("," + 4);
    //    }
    //}
    //
    //
    //Opciones:
    //
    //a. 0,4
    //b. 1,4
    //c. 2,4
    //d. 3,4
    //
    //✅ Respuesta correcta:
    //✔ d. 3,4

//📘 Consigna completa:
//
//¿Qué interfaz proporciona capacidad de almacenar datos usando pares (clave, valor)?
//
//a. Java.util.Map
//b. Java.util.Set
//c. Java.util.List
//d. Java.util.Collection
//
//❌ Tu respuesta marcada: b. Set
//
//Es incorrecta.
//
//✅ Respuesta correcta: a. Java.util.Map



    //📘 Consigna completa:
    //
    //Dado el código fuente en imagen adjunta, seleccione la respuesta INCORRECTA.
    //
    //Código:
    //
    //public class Person implements Serializable {
    //    private int age;
    //    private String name;
    //    private Address country;
    //}
    //
    //
    //Opciones:
    //
    //a. Address debe implementar Serializable.
    //b. Address debe implementar Serializable, sino se lanza NotSerializableException.
    //c. No todas las subclases de Person podrían ser serializables.
    //d. El tipo de datos de "country" debe ser serializable.
    //e. No se produce error de compilación.
    //
    //❌ Respuesta INCORRECTA:
    //c. No todas las subclases de Person podrían ser serializables.
    //🧠 Explicación clara
    //
    //Veamos cada opción:
    //
    //✔ a. Correcta
    //
    //Si una clase tiene un atributo de tipo Address, esa clase también debe ser Serializable.
    //
    //✔ b. Correcta
    //
    //Si Address NO implementa Serializable → se lanza NotSerializableException en tiempo de ejecución.
    //
    //❌ c. Incorrecta
    //
    //Esto es falso.
    //Si una clase implementa Serializable:
    //
    //public class Person implements Serializable {}
    //
    //
    //👉 Todas sus subclases también son serializables automáticamente,
    //sin necesidad de volver a escribir implements Serializable.
    //
    //Por eso esta afirmación es la incorrecta, la que pide el examen.
    //
    //✔ d. Correcta
    //
    //El atributo country (tipo Address) debe ser serializable sí o sí.
    //
    //✔ e. Correcta
    //
    //Esto NO causa error de compilación.
    //El error ocurriría en tiempo de ejecución, no al compilar.



    //❓ Pregunta
    //
    //¿A qué Clase pertenece la siguiente definición?:
    //"abre un archivo de texto en modo lectura"
    //
    //Opciones:
    //
    //a. FileWriter
    //b. FileReader
    //c. FileReader
    //
    //(Nótese que la opción b está duplicada en tu captura, pero la correcta sigue siendo la misma)
    //
    //✅ Respuesta correcta:
    //b. FileReader


    //📌 CÓDIGO DEL EJERCICIO
    //class Noodle {
    //    String name;
    //    Noodle(String n) { name = n; }
    //}
    //
    //class AsianNoodle extends Noodle {
    //    public boolean equals(Object o) {
    //        AsianNoodle a = (AsianNoodle)o;
    //        return this.name.length() == a.name.length();
    //    }
    //    AsianNoodle(String n) { super(n); }
    //    public int hashCode() { return name.length(); }
    //}
    //
    //public class Soba extends AsianNoodle {
    //    Soba(String n) { super(n); }
    //
    //    public static void main(String[] args) {
    //        Noodle n = new Noodle("bob");
    //        AsianNoodle a1 = new AsianNoodle("ramen");
    //        AsianNoodle a2 = new AsianNoodle("udon");
    //        AsianNoodle a3 = new AsianNoodle("red");
    //        AsianNoodle a4 = new AsianNoodle("soba");
    //        Soba s = new Soba("soba");
    //
    //        System.out.print(n.equals(a1) + " ");
    //        System.out.print(a1.equals(a2) + " ");
    //        System.out.print(a2.equals(a3) + " ");
    //        System.out.print(a3.equals(a4) + " ");
    //        System.out.print(a4.equals(s));
    //    }
    //}
    //
    //🚨 ATENCIÓN: POSIBLE ERROR DE EJECUCIÓN
    //La línea:
    //AsianNoodle a = (AsianNoodle) o;
    //
    //
    //Si o no es AsianNoodle, tira ClassCastException, NO devuelve false.
    //
    //El primer print:
    //
    //n.equals(a1)
    //
    //
    //→ Llama a equals de Object, NO de AsianNoodle.
    //→ Devuelve false (porque es comparación por referencia).
    //➡️ No hay cast, no hay error.
    //
    //Los demás sí usan equals de AsianNoodle, porque el receptor sí es AsianNoodle.
    //
    //📌 ANALIZAMOS CADA UNO
    //✔️ 1) n.equals(a1)
    //
    //n es un Noodle, usa equals de Object → comparación por referencia → false
    //
    //✔️ 2) a1.equals(a2)
    //
    //Comparación por largo del nombre:
    //
    //"ramen" → 5
    //
    //"udon" → 4
    //5 == 4 → false
    //
    //✔️ 3) a2.equals(a3)
    //
    //"udon" → 4
    //
    //"red" → 3
    //4 == 3 → false
    //
    //✔️ 4) a3.equals(a4)
    //
    //"red" → 3
    //
    //"soba" → 4
    //3 == 4 → false
    //
    //✔️ 5) a4.equals(s)
    //
    //"soba" → 4
    //
    //"soba" → 4
    //4 == 4 → true
    //
    //✅ RESULTADO FINAL
    //false false false false true
    //
    //🎯 RESPUESTA CORRECTA EN EL EXAMEN
    //✔️ false false false false true
    //
    //(Esa es la opción que estaba seleccionada en tu captura: ✔ d )


    //❓ Consigna
    //
    //Según la imagen adjunta, seleccione la opción CORRECTA.
    //
    //Pregunta: Respecto a las excepciones en Java, podemos afirmar…
    //
    //a. Todas las subclases de la clase estandar de Java RuntimeException son excepciones comprobables.
    //b. Todas las subclases de la clase estandar de Java Exception son excepciones comprobables.
    //c. Error es una subclase directa de Throwable, mientras que Exception es una subclase directa de Error.
    //d. Tanto Error como Exception son subclases directas de Throwable.
    //
    //✅ Respuesta Correcta: d
    //
    //✔ d. Tanto Error como Exception son subclases directas de Throwable.

    //❓ Consigna (copiable)
    //
    //Pregunta:
    //Dado el siguiente código, ¿cuál de las siguientes afirmaciones es correcta?
    //
    //Set<Object> objetos = new HashSet<Object>();
    //String obj1 = "JAVA";
    //int obj2 = 5;
    //Boolean obj3 = new Boolean(true);
    //objetos.add(obj3);
    //objetos.add(obj1);
    //objetos.add(obj2);
    //objetos.add(obj3);
    //for(Object object : objetos) {
    //    System.out.print(object);
    //}
    //
    //
    //Opciones:
    //
    //a. Error en tiempo de ejecución.
    //b. Se muestran por pantalla JAVA 5 y true en un orden no determinado.
    //c. Se muestran por pantalla JAVA 5 y true en el orden exacto en el que fueron insertadas en la colección.
    //d. Se muestran por pantalla JAVA 5 y true en un orden no determinado y, además, “true” se muestra dos veces.
    //
    //🧠 Análisis del código
    //✔ 1. HashSet NO permite duplicados
    //
    //Esto es clave:
    //
    //objetos.add(obj3);   // true
    //...
    //objetos.add(obj3);   // duplicado → NO se inserta
    //
    //
    //➡️ true NO se imprime dos veces.
    //
    //✔ 2. El orden NO está garantizado
    //
    //HashSet NO mantiene el orden de inserción.
    //Por lo tanto, el orden de salida puede ser:
    //
    //JAVA5true
    //
    //5JAVAtrue
    //
    //trueJAVA5
    //
    //etc.
    //
    //✔ 3. int obj2 = 5; → autoboxing
    //
    //Cuando hacés objetos.add(obj2); se convierte en un Integer.
    //
    //No causa error.
    //
    //✔ 4. No hay ningún error de compilación ni ejecución
    //
    //Todo es válido.
    //
    //✅ Resultado que se imprime por consola
    //
    //Se imprimen exactamente tres valores:
    //
    //"JAVA"
    //
    //5
    //
    //true
    //
    //en un orden NO determinado
    //y sin repetidos.
    //
    //✔ Respuesta correcta
    //b. Se muestran por pantalla JAVA 5 y true en un orden no determinado.

    //❓ Consigna (copiable)
    //
    //Seleccione según imagen adjunta, la opción CORRECTA.
    //
    //Pregunta:
    //¿Qué código hay que añadir en la posición indicada en el código para que compile?
    //
    //public class ExceptionTest {
    //    class TestException extends Exception {}
    //
    //    public void runTest() throws TestException {}
    //
    //    public void test() /* Código a añadir */ {
    //        runTest();
    //    }
    //}
    //
    //
    //Opciones:
    //
    //a. No hay que añadir código alguno.
    //b. throws Exception
    //c. catch (Exception e)
    //d. throws RuntimeException
    //
    //🧠 Análisis
    //✔ runTest() lanza TestException, que es CHECKED
    //public void runTest() throws TestException
    //
    //
    //➡️ Toda excepción checked debe ser:
    //
    //capturada (try/catch)
    //o
    //
    //propagada con throws
    //
    //En el método test() se llama a runTest() sin try/catch.
    //
    //Por lo tanto, para que compile, test() también debe declarar un throws compatible.
    //
    //❌ Veamos las opciones incorrectas:
    //a) No hay que añadir nada
    //
    //❌ Sí hace falta, porque la checked exception no está manejada.
    //
    //c) catch(Exception e)
    //
    //❌ Debería envolver el cuerpo completo:
    //
    //public void test() {
    //    try { runTest(); }
    //    catch(Exception e) {}
    //}
    //
    //
    //Pero NO es lo que pide el ejercicio: solo permite poner algo en la firma.
    //
    //d) throws RuntimeException
    //
    //❌ RuntimeException es unchecked → NO cubre TestException.
    //
    //✅ Respuesta Correcta
    //✔ b. throws Exception
    //
    //Porque Exception es la superclase de TestException, y por lo tanto cubre la excepción que puede lanzar runTest().

    //❓ Consigna
    //
    //Elija la opción correcta a la pregunta:
    //
    //¿A qué Clase pertenece la definición: “Lee bytes y los transforma a caracteres”?
    //
    //Opciones:
    //
    //a. OupputStreamWriter
    //b. InputStreamReader
    //c. PublicStreamReader
    //
    //✅ Respuesta Correcta: b. InputStreamReader

    //❓ Consigna
    //
    //¿Qué Clase provee una representación/asociación abstracta de ficheros y directorios?
    //
    //Opciones:
    //
    //a. ObjectInputStream
    //b. File
    //c. FileInputStream
    //
    //✅ Respuesta Correcta: b. File

    //❓ Consigna
    //
    //¿A qué Clase pertenece la siguiente definición?: “abre un archivo de texto en modo escritura”?
    //
    //Opciones:
    //
    //a. FileReader
    //b. FileWriter
    //c. FileOutput
    //
    //✅ Respuesta Correcta: FileWriter

    //❓ Consigna
    //
    //¿Qué hace el método void newLine() de la clase BufferedWriter?
    //
    //Opciones:
    //
    //a. Cierra el flujo de escritura y cierra el archivo.
    //b. Vuelca el contenido del Buffer al archivo.
    //c. Escribe un salto de línea en el archivo.
    //
    //✅ Respuesta Correcta: c. Escribe un salto de línea en el archivo.

    //📌 Consigna (copiala así tal cual):
    //
    //Seleccione la opción CORRECTA, según la afirmación en la imagen:
    //
    //Pregunta:
    //Un Set es una estructura:
    //
    //a. Que almacena cada elemento individual una sola vez como mínimo. No mantiene un orden específico.
    //b. Que almacena cada elemento individual una sola vez como mínimo. Mantiene un orden específico.
    //c. Que almacena cada elemento individual una sola vez como máximo. No mantiene un orden específico.
    //d. Que almacena cada elemento individual una sola vez como máximo. Mantiene un orden específico.
    //
    //✅ Respuesta correcta: c
    //✔ Justificación clara:


}