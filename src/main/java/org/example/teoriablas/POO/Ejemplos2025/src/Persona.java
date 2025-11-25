public class Persona {
    //Atributos
    private String nombre;
    private int edad;
    private String dni;

    //Constructores

    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //Metodos
    public String comer(){
        return this.nombre+" comiendo";
    }

    public String getNombre() {

        return nombre;
    }
    public void setNombre(String nombre) {
        if(nombre == null || nombre.equals("")){
            return;
        }
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
}
