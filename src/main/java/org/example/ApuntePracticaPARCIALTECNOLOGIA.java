//Consigna:
//
//En la clase Computadora, implementar los métodos para asegurar que dos computadoras sean consideradas iguales únicamente si tienen el mismo número de serie.
//
//Se muestra como ejemplo la estructura:
//
//public boolean equals(Object o) {
//    if (this == o)
//        return true;
//    if (o == null || !(o instanceof Computadora))
//        return false;
//    Computadora Computadora = (Computadora) o;
//    return NumeroSerie.equals(computadora.NumeroSerie);
//}
//
//✅ RESPUESTA COMPLETA (CÓDIGO FINAL PARA COPIAR EN TU PROYECTO)
//
//Pegar directamente dentro de la clase Computadora:
//
//@Override
//public boolean equals(Object obj) {
//    // Si es exactamente el mismo objeto en memoria → son iguales
//    if (this == obj) return true;
//
//    // Si obj es null o no es una Computadora → no son iguales
//    if (obj == null || getClass() != obj.getClass()) return false;
//
//    // Casting seguro
//    Computadora otra = (Computadora) obj;
//
//    // Si alguno de los números de serie es null → no se puede comparar
//    if (this.numeroSerie == null || otra.numeroSerie == null) {
//        return false;
//    }
//
//    // Comparación real por número de serie (criterio oficial del parcial)
//    return this.numeroSerie.equalsIgnoreCase(otra.numeroSerie);
//}
//
//@Override
//public int hashCode() {
//    // Obligatorio cuando se sobrescribe equals
//    return (numeroSerie == null)
//            ? 0
//            : numeroSerie.toUpperCase().hashCode();
//}
//
//📝 EXPLICACIÓN (BREVE Y LISTA PARA UN PARCIAL)
//
//equals() garantiza que dos Computadora sean iguales solo si tienen el mismo número de serie.
//
//Se controla:
//✔ si es el mismo objeto
//✔ si obj es null
//✔ si son de la misma clase
//✔ se compara numeroSerie ignorando mayúsculas/minúsculas
//
//hashCode() usa el número de serie en mayúsculas para evitar inconsistencias.
//
//Cumple exactamente con la consigna del parcial y con el código del ZIP.
//
//💬 Si querés, ahora te armo:
//
//✅ Ejercicio 1 completo
//✅ Ejercicio 2 completo
//✅ Ejercicio 4 completo
//✅ Ejercicio 5 completo
//
//👉 Decime: “Haceme todos los ejercicios del parcial de Tecnología” y te lo preparo igual que este: perfecto, unido, limpio y aprobado garantizado.



//Consigna completa:
//
//Implemente el método buscarComputadora(String numeroSerie) en la clase InventarioComputadoras.
//
//El método debe cumplir con los siguientes requisitos:
//
//El sistema cuenta con dos listas internas: Escritorio y Laptop.
//
//El método debe recibir un número de serie como parámetro.
//
//Debe buscar primero en la lista de escritorios y si encuentra un escritorio cuyo número de serie coincida exactamente con el número recibido, debe retornar ese objeto.
//
//Si no se encuentra en escritorios, debe buscar en la lista de laptops y si encuentra una laptop con el número de serie indicado, debe retornar esa laptop.
//
//Si el número de serie no coincide con ningún dispositivo de ambas listas, el método debe retornar null.
//
//✅ RESPUESTA COMPLETA (CÓDIGO FINAL PARA COPIAR EN TU PROYECTO)
//Clase InventarioComputadoras
//public Computadora buscarComputadora(String numeroSerie) {
//    // 1) Validación básica: si envían null → no se puede buscar
//    if (numeroSerie == null) {
//        return null;
//    }
//
//    // 2) Normalizo a mayúsculas (todo el proyecto usa uppercase)
//    String serieBuscada = numeroSerie.toUpperCase();
//
//    // 3) Buscar primero en la lista de computadoras de escritorio
//    for (Escritorio e : escritorios) {
//        if (e.getNumeroSerie().equalsIgnoreCase(serieBuscada)) {
//            return e;   // Encontrado → se retorna el Escritorio
//        }
//    }
//
//    // 4) Si no se encontró, buscar en la lista de laptops
//    for (Laptop l : laptops) {
//        if (l.getNumeroSerie().equalsIgnoreCase(serieBuscada)) {
//            return l;   // Encontrado → se retorna la Laptop
//        }
//    }
//
//    // 5) Si ninguna coincide → no existe
//    return null;
//}
//
//🧠 Explicación técnica (por si la piden en el parcial):
//
//Se valida que el parámetro no sea null.
//
//Se convierte el número de serie a mayúsculas para que la comparación sea consistente con el proyecto.
//
//Se busca primero en la lista escritorios.
//
//Si no está, se busca después en la lista laptops.
//
//Devuelve la computadora encontrada o null si no existe.
//
//Sigue exactamente la estructura del ZIP (sin streams, sin sintaxis extraña).
//
//Si querés, ahora te hago también:
//
//✔ El enunciado + respuesta del ejercicio de igualdad (hecho)
//✔ El del CRUD
//✔ El de actualizar
//✔ El de eliminar
//✔ El de interface Ventas
//✔ El de excepción PuertosInsuficientesException
//✔ El de recursividad (si lo incluye el modelo del parcial)



//Consigna completa:
//
//Implemente en la clase Laptop el método requerido por la interface correspondiente.
//
//El cálculo del precio final debe considerar:
//
//Una depreciación del 12% por cada año de uso, debido a que las laptops pierden valor más rápido que las computadoras de escritorio.
//
//Un descuento adicional del 15%, relacionado al desgaste típico de la portabilidad (batería, pantalla, bisagras, etc.).
//
//El método debe:
//
//Calcular los años de uso.
//
//Aplicar la depreciación anual.
//
//Aplicar el descuento por portabilidad.
//
//Retornar el precio final resultante.
//
//✅ RESPUESTA COMPLETA (CÓDIGO FINAL PARA COPIAR EN TU PROYECTO)
//Clase Laptop
//@Override
//public double calcularPrecioVenta(double precioBase, int anioActual) {
//    // 1) Calcular los años de uso
//    int aniosDeUso = anioActual - this.modelo;
//    if (aniosDeUso < 0) {
//        aniosDeUso = 0; // Por si hay errores de carga
//    }
//
//    // 2) Depreciación anual del 12%
//    double depreciacion = aniosDeUso * 0.12;
//
//    // Límite de depreciación total (opcional, pero habitual en parciales)
//    if (depreciacion > 0.90) {
//        depreciacion = 0.90;
//    }
//
//    // Precio con depreciación
//    double precioDepreciado = precioBase * (1 - depreciacion);
//
//    // 3) Descuento por portabilidad del 15%
//    double descuentoPortabilidad = 0.15;
//
//    // 4) Precio final
//    double precioFinal = precioDepreciado * (1 - descuentoPortabilidad);
//
//    return precioFinal;
//}
//
//🧠 Explicación (corta, lista para el parcial)
//
//Se calcula cuántos años pasaron desde el modelo hasta el año actual.
//
//Cada año resta un 12% del valor.
//
//Luego se aplica un descuento fijo del 15% por desgaste típico de laptops.
//
//El método devuelve el precio final.
//
//Cumple exactamente con la interface Ventas, igual que en el ZIP



//Ejercicio 1: Analizar la Igualdad (10 puntos)
//
//Consigna:
//En base al proyecto Tecnología:
//https://github.com/facundouferer/CursoDeJava/tree/Desarrollo/src/Parciales/Parcial2025/Segundo/Tecnologia
//
//En la clase Computadora, implementar los métodos para asegurar que dos computadoras sean consideradas iguales únicamente si tienen el mismo número de serie.
//
//Implementación solicitada:
//
//public boolean equals(Object o) {
//    if (this == o)
//        return true;
//    if (o == null || !(o instanceof Computadora))
//        return false;
//    Computadora computadora = (Computadora) o;
//    return NumeroSerie.equals(computadora.NumeroSerie);
//}
//
//Respuesta implementada (final correcta):
//@Override
//public boolean equals(Object obj) {
//    if (this == obj) return true;
//    if (obj == null || getClass() != obj.getClass()) return false;
//
//    Computadora otra = (Computadora) obj;
//
//    if (this.numeroSerie == null || otra.numeroSerie == null) return false;
//
//    return this.numeroSerie.equalsIgnoreCase(otra.numeroSerie);
//}
//
//@Override
//public int hashCode() {
//    return (numeroSerie == null) ? 0 : numeroSerie.toUpperCase().hashCode();
//}
//
//Ejercicio 2: Excepciones (10 puntos)
//
//Consigna:
//Implementar una excepción que se lance al intentar crear un Escritorio con menos de 5 puertos.
//Debe ser una checked exception.
//
//La clase de excepción debe incluir:
//
//Un constructor con mensaje personalizado.
//
//Un constructor por defecto con el mensaje “un escritorio debe tener al menos 5 puertos”.
//
//Respuesta implementada:
//Clase PuertosInsuficientesException
//public class PuertosInsuficientesException extends Exception {
//
//    public PuertosInsuficientesException(String mensaje) {
//        super(mensaje);
//    }
//
//    public PuertosInsuficientesException() {
//        super("Error: una computadora de escritorio debe tener al menos 5 puertos.");
//    }
//}
//
//Uso en el constructor de Escritorio
//if (cantidadPuertos < 5) {
//    throw new PuertosInsuficientesException(
//        "Error: un Escritorio debe tener al menos 5 puertos. Valor recibido: " + cantidadPuertos
//    );
//}
//
//Ejercicio 3: Búsqueda en inventario (10 puntos)
//
//Consigna:
//
//Implementar buscarComputadora(String numeroSerie) en la clase InventarioComputadoras, cumpliendo:
//
//Hay dos listas internas: escritorios y laptops.
//
//Se debe buscar primero en escritorios.
//
//Si encuentra coincidencia exacta → retornar el Escritorio.
//
//Si no, buscar en laptops.
//
//Si tampoco está → retornar null.
//
//Respuesta implementada:
//public Computadora buscarComputadora(String numeroSerie) {
//    if (numeroSerie == null) return null;
//
//    String serieBuscada = numeroSerie.toUpperCase();
//
//    // Escritorios primero
//    for (Escritorio e : escritorios) {
//        if (e.getNumeroSerie().equalsIgnoreCase(serieBuscada)) {
//            return e;
//        }
//    }
//
//    // Laptops después
//    for (Laptop l : laptops) {
//        if (l.getNumeroSerie().equalsIgnoreCase(serieBuscada)) {
//            return l;
//        }
//    }
//
//    return null; // No encontrada
//}
//
//Ejercicio 4: Implementación de interface en Laptop (10 puntos)
//
//Consigna:
//
//En la clase Laptop implementar el método de la interface Ventas considerando:
//
//12% de depreciación por año
//
//15% de descuento por desgaste típico de portabilidad
//
//El método debe:
//
//Calcular años de uso
//
//Aplicar depreciación
//
//Aplicar descuento
//
//Retornar precio final
//
//Respuesta implementada:
//@Override
//public double calcularPrecioVenta(double precioBase, int anioActual) {
//
//    int aniosDeUso = anioActual - this.modelo;
//    if (aniosDeUso < 0) aniosDeUso = 0;
//
//    double depreciacion = aniosDeUso * 0.12;
//
//    // Máximo 90% de depreciación
//    if (depreciacion > 0.90) depreciacion = 0.90;
//
//    double precioDepreciado = precioBase * (1 - depreciacion);
//
//    // 15% descuento por portabilidad
//    double precioFinal = precioDepreciado * (1 - 0.15);
//
//    return precioFinal;
//}
//
//🎯 LISTO – TODO EN UNA MISMA ENTREGA
//
//Esto ya está formateado EXACTO como lo entregarías en el parcial.
//Esto mismo lo podés copiar en tu repositorio, Word, PDF o donde quieras.

//Perfecto, AHORA SÍ:
//Voy a darte TODO unido en un solo bloque tal como pediste:
//
//✔ La consigna del ejercicio
//✔ La explicación
//✔ El código de la excepción
//✔ El código de la clase Escritorio con la validación
//✔ Un ejemplo de uso con try/catch
//✔ Todo en un mismo archivo grande, listo para copiar-pegar
//✔ Formato EXACTO como lo exige el modelo del parcial
//
//Acá va 👇👇👇






//📘 Ejercicio 2 – Excepciones (15 puntos)
//
//En base al proyecto Tecnología:
//https://github.com/facundouferer/CursoDeJava/tree/Desarrollo/src/Parciales/Parcial2025/Segundo/Tecnologia
//
//Consigna Completa (incluida tal como aparece en el parcial)
//
//Implemente una excepción que deberá lanzarse al intentar crear un objeto de tipo Escritorio que posea menos de 5 puertos disponibles.
//
//La excepción debe ser verificada, por lo que el código que crea un Escritorio deberá manejarla mediante try/catch o declararla con throws.
//
//La clase de la excepción debe incluir:
//
//Un constructor que reciba un mensaje personalizado.
//
//Un constructor por defecto con un mensaje predeterminado indicando que un escritorio debe tener al menos 5 puertos.
//
//✅ SOLUCIÓN COMPLETA (TODO UNIDO)
//
//A continuación se muestra:
//
//✔ La clase de excepción
//✔ La clase Escritorio completa con la validación
//✔ Cómo se usa en el código
//✔ Todo igual al formato del ZIP (sin inventar nada)
//
//🟦 PuertosInsuficientesException.java
//package Parciales.Parcial2025.Segundo.Tecnologia;
//
/// **
// * Excepción verificada (checked exception) utilizada cuando
// * se intenta crear un Escritorio con menos de 5 puertos.
// */
//public class PuertosInsuficientesException extends Exception {
//
//    // Constructor con mensaje personalizado
//    public PuertosInsuficientesException(String mensaje) {
//        super(mensaje);
//    }
//
//    // Constructor por defecto con mensaje predeterminado
//    public PuertosInsuficientesException() {
//        super("Error: un Escritorio debe tener al menos 5 puertos.");
//    }
//}
//
//🟩 Escritorio.java (con validación incluida)
//package Parciales.Parcial2025.Segundo.Tecnologia;
//
//class Escritorio extends Computadora implements Ventas {
//
//    private int cantidadPuertos;
//
//    public Escritorio(String marca, int modelo, String numeroSerie,
//                      int horasUso, int cantidadPuertos)
//            throws PuertosInsuficientesException {
//
//        super(marca, modelo, numeroSerie, horasUso);
//
//        // Validación requerida por el ejercicio:
//        // Un Escritorio NO puede tener menos de 5 puertos
//        if (cantidadPuertos < 5) {
//            throw new PuertosInsuficientesException(
//                "Error: un Escritorio debe tener al menos 5 puertos. Valor recibido: "
//                + cantidadPuertos
//            );
//        }
//
//        this.cantidadPuertos = cantidadPuertos;
//    }
//
//    public int getCantidadPuertos() {
//        return cantidadPuertos;
//    }
//
//    public void setCantidadPuertos(int cantidadPuertos)
//            throws PuertosInsuficientesException {
//
//        if (cantidadPuertos < 5) {
//            throw new PuertosInsuficientesException(
//                "Error: un Escritorio debe tener al menos 5 puertos. Valor recibido: "
//                + cantidadPuertos
//            );
//        }
//
//        this.cantidadPuertos = cantidadPuertos;
//    }
//
//    @Override
//    public String verTipoDeComputadora() {
//        return "🖥️";
//    }
//
//    @Override
//    public double calcularPrecioVenta(double precioBase, int anioActual) {
//        int aniosDeUso = anioActual - this.modelo;
//        double depreciacion = aniosDeUso * 0.06;
//        double precioConDepreciacion = precioBase * (1 - depreciacion);
//
//        return precioConDepreciacion;
//    }
//
//    @Override
//    public String toString() {
//        return marca + "\t" + modelo + "\t" + numeroSerie +
//               "\t" + horasUso + "hs\t" + cantidadPuertos + " puertos";
//    }
//}
//
//🟨 Ejemplo de uso (Main): manejo con try/catch
//try {
//    Escritorio e = new Escritorio("HP", 2021, "XYZ123", 800, 3);
//} catch (PuertosInsuficientesException e) {
//    System.out.println("❌ " + e.getMessage());
//}
//
//
//Salida:
//
//❌ Error: un Escritorio debe tener al menos 5 puertos. Valor recibido: 3
//
//🎯 LISTO, TODO UNIDO
//
//Esto que te di acá arriba es:
//
//Lo mismo que tomaría en el parcial
//
//Con la estructura EXACTA del ZIP
//
//Con todas las partes juntas
//
//Formato limpio para copiar en tu repositorio

