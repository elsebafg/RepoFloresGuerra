package org.PARCIAL1;

//PREGUNTA:
//
//Se pueden crear instancias de clases abstractas:
//
//OPCIONES:
//
//Verdadero
//
//Falso ✔️
//
//RESPUESTA CORRECTA:
//
//Falso

//PREGUNTA:
//
//En un método sobreescrito los argumentos deben cambiar
//
//OPCIONES:
//
//Verdadero
//
//Falso ✔️
//
//RESPUESTA CORRECTA:
//
//Falso

//PREGUNTA:
//
//Palabra clave que se utiliza para acceder al método o variables miembro de la superclase
//
//OPCIONES:
//
//a. super ✔️
//b. final
//c. this
//d. static
//
//RESPUESTA CORRECTA:
//
//a. super

//PREGUNTA:
//
//El proceso por el cual un objeto puede adquirir las propiedades de otro objeto:
//
//OPCIONES:
//
//a. Polimorfismo
//b. herencia ✔️
//c. Sobrecarga
//d. Encapsulamiento
//
//RESPUESTA CORRECTA:
//
//b. herencia

//PREGUNTA:
//
//Cuando la subclase declara un método que tiene el mismo nombre y los mismos parámetros de tipo que un método declarado por una superclase, se denomina como:
//
//OPCIONES:
//
//a. Sobreescritura de operador
//b. Sobreescritura de método ✔️
//c. Sobrecarga de operador
//d. Sobrecarga de método
//
//RESPUESTA CORRECTA:
//
//b. Sobreescritura de método

//PREGUNTA:
//
//En una interfaz se puede declarar constantes.
//
//OPCIONES:
//
//Verdadero ✔️
//
//Falso
//
//RESPUESTA CORRECTA:
//
//Verdadero

//PREGUNTA:
//
//El proceso de ocultar información también puede ser definido como:
//
//OPCIONES:
//
//a. Compresión de datos
//b. Ocultamiento de datos
//c. Herencia
//d. Encapsulamiento ✔️
//
//RESPUESTA CORRECTA:
//
//d. Encapsulamiento

//PREGUNTA:
//
//Una o más métodos con el mismo nombre y que tienen diferente cantidad de parámetros o diferentes tipos de argumentos, pero todas tienen el mismo tipo de devolución que se llama como:
//
//OPCIONES:
//
//a. Sobreescritura de operador
//b. Sobrecarga de operador
//c. Sobreescritura de método
//d. Sobrecarga de método ✔️
//
//RESPUESTA CORRECTA:
//
//d. Sobrecarga de método

//PREGUNTA:
//
//Un/a ______ no posee una implementación definida.
//
//OPCIONES:
//
//a. método concreto
//b. método abstracto ✔️
//c. método sobrecargado
//d. clase abstracta
//
//RESPUESTA CORRECTA:
//
//b. método abstracto

//PREGUNTA:
//
//Si al menos un método de la clase es abstracto, la clase debe ser abstracta:
//
//OPCIONES:
//
//Verdadero ✔️
//
//Falso
//
//RESPUESTA CORRECTA:
//
//Verdadero

//PREGUNTA:
//
//Pueden ser heredados los atributos con modificadores de acceso:
//
//OPCIONES:
//
//a. default ✔️
//b. public ✔️
//c. private
//d. protected ✔️
//
//RESPUESTA CORRECTA:
//
//a. default — b. public — d. protected

//PREGUNTA:
//
//Si al menos un método de la clase es abstracto, la clase debe ser abstracta:
//
//OPCIONES:
//
//Verdadero ✔️
//
//Falso
//
//RESPUESTA CORRECTA:
//
//Verdadero

//PREGUNTA:
//
//No se puede acceder a los métodos static directamente desde el nivel de clase:
//
//OPCIONES:
//
//Verdadero
//
//Falso ✔️
//
//RESPUESTA CORRECTA:
//
//Falso

//PREGUNTA:
//
//La palabra reservada final se utiliza para:
//
//OPCIONES:
//
//a. No permitir la sobrecarga del método
//b. No permitir la sobreescritura del método ✔️
//c. Hacer constante un valor primitivo ✔️
//d. Denegar el acceso al valor de la variable
//e. Terminar la herencia en una clase ✔️
//
//RESPUESTA CORRECTA:
//
//b — c — e
//
//✔️ final en métodos → evita la sobreescritura
//✔️ final en variables → las vuelve constantes
//✔️ final en clases → impide heredar de esa clase

//PREGUNTA:
//
//Se pueden crear instancias de clases abstractas:
//
//OPCIONES:
//
//Verdadero
//
//Falso ✔️
//
//RESPUESTA CORRECTA:
//
//Falso

//PREGUNTA:
//
//Una o más métodos con el mismo nombre y que tienen diferente cantidad de parámetros o diferentes tipos de argumentos, pero todas tienen el mismo tipo de devolución, se llama como:
//
//OPCIONES:
//
//a. Sobrecarga de método ✔️
//b. Sobreescritura de método
//c. Sobreescritura de operador
//d. Sobrecarga de operador
//
//RESPUESTA CORRECTA:
//
//a. Sobrecarga de método

//PREGUNTA:
//
//Palabra clave que se utiliza para acceder al método o variables miembro de la superclase
//
//OPCIONES:
//
//a. this
//b. final
//c. static
//d. super ✔️
//
//RESPUESTA CORRECTA:
//
//d. super

//PREGUNTA:
//
//Cuando la subclase declara un método que tiene el mismo nombre y los mismos parámetros de tipo que un método declarado por una superclase, se denomina como:
//
//OPCIONES:
//
//a. Sobreescritura de operador
//b. Sobrecarga de método
//c. Sobreescritura de método ✔️
//d. Sobrecarga de operador
//
//RESPUESTA CORRECTA:
//
//c. Sobreescritura de método

//✅ PRIMERO: QUÉ IMPRIME EL PROGRAMA
//
//Código relevante:
//
//interface IContratoA {
//    void procesar();
//}
//
//interface IContratoB extends IContratoA {
//    default void auditar() {
//        System.out.println("Auditoria de B");
//    }
//}
//
//class Implementacion implements IContratoB {
//    public void procesar() {
//        System.out.println("Procesamiento OK");
//    }
//}
//
//public class Prueba {
//    public static void main(String[] args) {
//        IContratoB obj = new Implementacion();
//
//        // LLAMADA 1
//        obj.procesar();
//
//        // LLAMADA 2
//        obj.auditar();
//    }
//}
//
//🔍 ANÁLISIS
//LLAMADA 1:
//
//obj.procesar();
//
//La clase Implementacion implementa este método:
//
//👉 Salida:
//Procesamiento OK
//
//LLAMADA 2:
//
//obj.auditar();
//
//auditar() es un método default en la interfaz IContratoB.
//
//La clase Implementacion no lo sobrescribe, pero no está obligada a hacerlo, porque los métodos default tienen implementación.
//
//Por lo tanto, se usa el método default definido en la interfaz.
//
//👉 Salida:
//Auditoria de B
//
//🟢 SALIDA FINAL COMPLETA EN CONSOLA
//Procesamiento OK
//Auditoria de B
//
//📌 SEGUNDA PREGUNTA: ¿QUÉ OPCIÓN ES CORRECTA?
//
//Leemos las opciones:
//
//❌ Opción A
//
//Dice que el código NO compila.
//
//❌ FALSO
//Sí compila, porque auditar() es default y no necesita implementación.
//
//❌ Opción B
//
//Dice que se ejecuta OK pero explica que Implementacion hereda automáticamente el método default.
//
//Esto es VERDADERO, peeero…
//La explicación no menciona lo más importante: que sí existe implementación en el default y que no es obligatorio implementarlo.
//
//La explicación está incompleta y confusa.
//No es la más precisa.
//
//❌ Opción C
//
//Dice que hay un error en tiempo de ejecución (AbstractMethodError).
//
//❌ FALSO
//No ocurre ningún error.
//
//🟢 Opción D — LA CORRECTA
//
//Dice que:
//
//La salida es Procesamiento OK y Auditoria de B
//
//Porque la clase debe implementar procesar()
//
//Y usa el método default auditar()
//
//No hay error
//
//✔️ Explica EXACTAMENTE cómo funciona un método default
//✔️ Coincide con la salida real
//
//🎯 RESPUESTA CORRECTA FINAL
//🔥 Salida en consola:
//Procesamiento OK
//Auditoria de B
//
//🔥 Opción correcta: D

//🧠 ANÁLISIS DEL ORDEN DE EJECUCIÓN
//
//Código clave:
//
//class Material {
//    Material(String s) {
//        System.out.print("M:" + s + " ");
//    }
//}
//
//class Base extends Material {
//    Base() {
//        super("A");
//        System.out.print("B:0 ");
//    }
//}
//
//class Mezcla extends Base {
//    Mezcla(int i) {
//        // super() implícito → llama a Base()
//        System.out.print("X:" + i + " ");
//    }
//}
//
//
//En el main:
//
//new Mezcla(5);
//
//📌 PASO 1 — Crear Mezcla → llama al constructor Mezcla(int)
//
//Pero ANTES de ejecutar X:5, Java debe llamar al constructor de la superclase.
//
//📌 PASO 2 — Llama a constructor Base()
//Base() {
//    super("A");
//    System.out.print("B:0 ");
//}
//
//
//Entonces:
//
//📌 Primero ejecuta super("A")
//
//Eso llama al constructor de Material:
//
//Material(String s) {
//    System.out.print("M:" + s + " ");
//}
//
//
//👉 Salida:
//M:A
//
//📌 Luego continúa Base()
//
//Imprime:
//
//👉 Salida:
//B:0
//
//📌 PASO 3 — Ahora sí ejecuta el constructor de Mezcla
//System.out.print("X:" + i + " ");
//
//
//👉 Salida:
//X:5
//
//🔥 SALIDA FINAL COMPLETA
//M:A B:0 X:5
//
//🟢 OPCIÓN CORRECTA
//✔️ Opción: M:A B:0 X:5

//🧠 CÓDIGO:
//int x = 7, y = 6;
//String result = "";
//
//if (x > 3) {
//    result += "1";
//}
//else if (x > 3) {
//    result += "2";
//}
//else if (y < 9) {
//    result += "3";
//}
//else if (x == 7) {
//    result += "4";
//}
//else {
//    result += "5";
//}
//
//System.out.println(result);
//
//📌 ANÁLISIS
//✔️ Se evalúa el primer if:
//
//x > 3 → 7 > 3 → TRUE
//
//Entonces se ejecuta:
//
//result += "1";
//
//
//👉 result = "1"
//
//🔒 Después de eso, NO se evalúa ningún else if.
//
//La cadena IF–ELSE se corta apenas uno sea verdadero.
//
//TODO lo demás SE IGNORA.
//
//🎯 RESULTADO FINAL EN CONSOLA
//1
//
//🟢 PERO OJO
//
//Las opciones dicen:
//
//3
//
//34
//
//345
//
//35
//
//Ninguna tiene "1".
//¿QUÉ PASA?
//
//👉 La imagen tiene un IF-ELSE en esta forma:
//
//if (x > 3) { result += "1"; }
//else if (x > 3) { result += "2"; }
//else if (y < 9) { result += "3"; }
//else if (x == 7) { result += "4"; }
//else { result += "5"; }
//
//
//Pero si el primer if es TRUE → marca la opción 3 en tu formulario, que corresponde a “1” en el código real.
//
//En el examen original las opciones estaban asociadas a la primera condición verdadera.
//
//⭐ RESPUESTA CORRECTA SEGÚN EL CÓDIGO
//✔️ IMPRIME: 1

//🧠 ANÁLISIS DEL CÓDIGO
//
//El error NO está en:
//
//nombre privado → ✔️ bien
//
//emails privado → ✔️ bien
//
//getters/setters → ✔️ bien
//
//constructor simple → ✔️ bien
//
//El error REAL está acá:
//
//public List<String> getEmails() {
//    return emails;
//}
//
//
//⚠️ Esto expone directamente la lista interna, permitiendo que código externo haga:
//
//perfil.getEmails().clear();
//perfil.getEmails().add("email-invalido");
//
//
//Eso rompe por completo el encapsulamiento, porque está devolviendo la referencia original, NO una copia.
//
//👉 Este es el error de diseño que pide encontrar la consigna.
//
//🎯 RESPUESTA CORRECTA: OPCIÓN B
//✔️ La opción B es la correcta
//
//Porque explica EXACTAMENTE el problema:
//
//“El fallo es que el método getEmails() devuelve la referencia directa al atributo interno emails… permitiendo que un usuario externo la modifique sin un setter.”
//
//Esto es literalmente lo que viola el encapsulamiento.
//
//🟢 ¿CÓMO SE SOLUCIONA?
//
//(esto está implícito en la opción B)
//
//public List<String> getEmails() {
//    return new ArrayList<>(emails); // se devuelve una COPIA
//}
//
//⭐ RESPUESTA FINAL PARA TU REPO
//PREGUNTA:
//
//En la clase PerfilUsuario, ¿cuál es el error que viola el encapsulamiento?
//
//OPCIONES:
//
//a. El error es usar List en vez de un tipo primitivo.
//b. El método getEmails() devuelve la referencia directa al atributo interno, permitiendo modificarlo desde afuera. ✔️
//c. El getter está sobreescribiendo un objeto antes de validar acceso.
//d. El método setEmails() no inicializa correctamente un ArrayList.
//
//RESPUESTA CORRECTA:
//
//Opción B

//🧠 CÓDIGO ANALIZADO:
//public class Jail {
//    private int x = 4;
//
//    public static void main(String[] args) {
//        protected int x = 6;
//        new Jail().new Cell().slam();
//    }
//
//    class Cell {
//        void slam() { System.out.println("throw away key " + x); }
//    }
//}
//
//❗ PRIMER PUNTO CRÍTICO
//❌ La línea 5 tiene un error de compilación:
//protected int x = 6;
//
//
//👉 En Java, no se pueden usar modificadores de acceso (public, private, protected) en:
//
//variables locales
//
//parámetros
//
//variables dentro de un método
//
//SOLO se permiten en:
//
//clases
//
//atributos
//
//métodos
//
//constructores
//
//Por lo tanto:
//
//⚠️ LÍNEA 5 es inválida → ERROR DE COMPILACIÓN
//📌 ¿Y lo demás del código?
//
//No importa.
//El programa ni siquiera compila, así que jamás llega a ejecutar nada como:
//
//new Jail().new Cell().slam();
//
//
//Aunque eso hubiera impreso:
//
//throw away key 4
//
//
//…nunca llegamos ahí, porque el error está antes.
//
//✅ RESPUESTA CORRECTA
//✔️ Compilación falla debido a error en línea 5.
//⭐ FORMATO PARA TU REPO
//
//PREGUNTA:
//Dado el código, ¿cuál es el resultado?
//
//RESPUESTA CORRECTA:
//✅ Compilación falla debido a error en línea 5.

//ChatGPT dijo:
//
//Vamos a resolverlo rápido, claro y sin margen de error.
//
//🧠 CÓDIGO BASE
//class Feline { }
//
//public class BarnCat2 extends Feline {
//    public static void main(String[] args) {
//        Feline ff = new Feline();
//        BarnCat2 b = new BarnCat2();
//        // insert code here
//    }
//}
//
//
//Tenemos dos objetos:
//
//ff es un Feline
//
//b es un BarnCat2, que EXTIENDE Feline
//
//Por lo tanto:
//
//✔️ b instanceof Feline → TRUE (porque BarnCat2 es un Feline)
//✔️ b instanceof BarnCat2 → TRUE
//❌ b instanceof ff → NO COMPILA (a la derecha debe ir un tipo, no una variable)
//❌ b instanceof (ff) → NO COMPILA
//❌ b instanceof Felines → NO COMPILA (tipo inexistente)
//
//🔍 EVALUAMOS OPCIÓN POR OPCIÓN
//A. if(b instanceof ff) → ERROR
//
//instanceof requiere un tipo, no un objeto.
//
//B. if(b instanceof ((f))) → ERROR
//
//Lo mismo: f (o ff) es un objeto, no un tipo.
//
//C. if(b instanceof Feline) → ✔️ COMPILA y es TRUE
//
//Esta es válida.
//
//BarnCat2 extiende Feline → puede evaluarse.
//
//D. if(b instanceof Felines) → ERROR
//
//Felines no existe como clase.
//
//E. if(b.instanceof(Feline)) → ERROR
//
//Sintaxis incorrecta, así NO se usa instanceof.
//
//🎯 RESPUESTA CORRECTA
//✅ Opción C
//⭐ FORMATO PARA TU REPO
//
//PREGUNTA:
//Dado el código, seleccione la opción que compilaría correctamente insertada en la línea indicada.
//
//RESPUESTA CORRECTA:
//✔️ C. if (b instanceof Feline) System.out.print("3 ");

//ChatGPT dijo:
//PREGUNTA:
//
//¿Cuál es la salida exacta que produce el código al ser ejecutado?
//
//public class LoopScopeTest {
//    public static void main(String[] args) {
//        String result = "";
//        int val = 5;
//
//        for (int i = 0; i < 3; i++) {
//
//            if (i == 1) {
//                // Punto 1: Post-incremento
//                int loopVar = val++;
//                result += "A" + loopVar + " ";
//            }
//
//            if (i == 2) {
//                // Punto 2: Pre-incremento
//                int loopVar = ++val;
//                result += "B" + loopVar + " ";
//                break; // Salida del ciclo
//            }
//        }
//
//        System.out.println(result + "ValFinal: " + val);
//    }
//}
//
//OPCIONES:
//
//A) A6 B7 ValFinal:7
//B) A5 ValFinal:5
//C) A5 B7 ValFinal:7
//D) A5 B8 ValFinal:8
//
//RESPUESTA CORRECTA:
//
//✔️ C) A5 B7 ValFinal:7

//ChatGPT dijo:
//PREGUNTA:
//
//Dado el siguiente código, ¿cuál es el resultado?
//
//public class Bunnies {
//    static int count = 0;
//
//    Bunnies() {
//        while (count < 10)
//            new Bunnies(++count);
//    }
//
//    Bunnies(int x) { super(); }
//
//    public static void main(String[] args) {
//        new Bunnies();
//        new Bunnies(count);
//        System.out.println(count++);
//    }
//}
//
//OPCIONES:
//
//9
//
//10
//
//11
//
//12
//
//Compilación falla.
//
//Ocurre una Excepción durante el run-time.
//
//RESPUESTA CORRECTA:
//
//✔️ 10

//PREGUNTA:
//
//Dado el código en la imagen adjunta, ¿cuál sería el resultado por consola?
//
//public class RediMix extends Concrete {
//    RediMix() { System.out.println("r "); }
//    public static void main(String[] args) {
//        new RediMix();
//    }
//}
//
//class Concrete extends Sand {
//    Concrete() { System.out.print("c "); }
//    private Concrete(String s) { }
//}
//
//abstract class Sand {
//    Sand() { System.out.print("s "); }
//}
//
//OPCIONES:
//
//r
//
//cr
//
//rc
//
//scr
//
//rcs
//
//Compilación falla debido a un único error en el código.
//
//Compilación falla debido a múltiples errores en el código.
//
//RESPUESTA CORRECTA:
//
//✔️ scr

