package Lab1_C15152_JoshueMoraR;

public class Persona {

    private int cedula;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(int cedula, String nombre, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + " Nombre: " + nombre + " Edad: " + edad;
    }
}
